package com.example.smartcity.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsetsAnimation.Bounds
import android.widget.ArrayAdapter
import android.widget.RadioButton
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.children
import androidx.core.view.forEach
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.smartcity.R
import com.example.smartcity.databinding.ActivityNavigationBinding
import com.example.smartcity.ui.fragments.AllServiceFragment
import com.example.smartcity.ui.fragments.BlankFragment
import com.example.smartcity.ui.fragments.HomeFragment
import com.example.smartcity.ui.fragments.MyFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator
import com.youth.banner.listener.OnPageChangeListener
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class NavigationActivity :BaseActivity() {
    private lateinit var bind: ActivityNavigationBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(bind.root)

        with(bind) {
            rgTab.setOnCheckedChangeListener { group, checkedId ->
                rgTab.children.forEach {

                    if (it is RadioButton){
                        if (it.id == checkedId)
                        {
                            it.compoundDrawables[1]?.setTint(Color.RED)
                            it.setTextColor(Color.RED)
                            vPager2.currentItem = group.indexOfChild(it)
                        }
                        else {
                            it.compoundDrawables[1]?.setTint(Color.BLACK)
                            it.setTextColor(Color.BLACK)
                        }
                    }
                }
            }
            vPager2.isUserInputEnabled = false


            vPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    var i = 0
                    bind.rgTab.children.forEach {
                        if (i++ == position){
                            val btn = it as RadioButton
                            btn.isChecked = true
                        }
                    }
                }
            })

            vPager2.bindFragment(supportFragmentManager,this@NavigationActivity.lifecycle, listOf(
                HomeFragment(),
                AllServiceFragment(),
                BlankFragment.newInstance("",""),
                BlankFragment.newInstance("",""),
                MyFragment()
            ))
            val titles = listOf("首页","全部服务","智慧养老","新闻","个人中心")



            tbLayout.addOnTabSelectedListener(object:OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    tab?.icon?.setTint(Color.RED)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    tab?.icon?.setTint(Color.BLACK)

                }
                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

            })

            TabLayoutMediator(tbLayout,vPager2,true,false){
                tab,posi->
                tab.setIcon(android.R.drawable.ic_menu_save)
                tab.icon?.setBounds(0,0,0,0)

                tab.text = titles[posi]
            }.attach()







        }
    }



    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true, priority = 2)
    fun subChangeTabPage(event:JumpTabEvent){
        bind.vPager2.setCurrentItem(event.tabIndex,false)
    }


    fun ViewPager2.bindFragment(
        fm: FragmentManager,
        lifecycle: Lifecycle,
        fragments:List<Fragment>
    ):ViewPager2{
        offscreenPageLimit = fragments.size-1
        adapter = object: FragmentStateAdapter(fm,lifecycle){
            override fun getItemCount(): Int {
                return fragments.size
            }

            override fun createFragment(position: Int): Fragment {
                return fragments[position]
            }
        }
        return this
    }

}

class JumpTabEvent(val tabIndex:Int)