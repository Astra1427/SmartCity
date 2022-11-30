package com.example.smartcity.ui.activities.statistics

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.smartcity.common.Apis
import com.example.smartcity.common.keys
import com.example.smartcity.databinding.ActivityStatisMainBinding
import com.example.smartcity.ui.BaseActivity
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

class StatisMainActivity : BaseActivity() {


    private lateinit var bind: ActivityStatisMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityStatisMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initView(true,"数据分析")

    }


    fun testExample(){
        /*with(bind) {

            lineChart1.setNoDataText("没有获取到数据")
            lineChart1.setNoDataTextColor(Color.RED)

            val floats = listOf(12f,3f,4f,5f,23f)
            val entries = mutableListOf<Entry>()

            for (i in floats.indices) {
                entries.add(Entry(i.toFloat(),floats[i]))
            }

            val barEntries = floats.map { x-> BarEntry(floats.indexOf(x).toFloat(),x) }

            val pieEntries = floats.map { x-> PieEntry(floats.indexOf(x).toFloat(),x) }

            val lineDataSet = LineDataSet(entries,"").apply {
                setDrawFilled(true)
                mode = LineDataSet.Mode.HORIZONTAL_BEZIER
            }

            val lineData = LineData(lineDataSet)


            with(lineChart1) {
                setBackgroundColor(Color.argb(0,32,34,36))
                legend.isEnabled = false
                setDrawBorders(false)

                with(xAxis) {
                    valueFormatter = IndexAxisValueFormatter(listOf("清醒","潜睡","深睡","离床"))
                    setDrawGridLines(false)
                    setDrawAxisLine(false)
                    textSize = 12f
                    position = XAxis.XAxisPosition.BOTTOM
                }
            }

            lineChart1.data = lineData


            BarData(BarDataSet(barEntries,"")).let {
                barChart1.data = it
                hBarChart1.data = it
            }

            pieChart1.data = PieData(PieDataSet(pieEntries,""))


        }*/
    }

    fun studyExample1(){
        /*  with(bind) {
            val bar01Entries = listOf(
                BarEntry(0f, listOf(2f,1.2f,1.3f).toFloatArray()),
                BarEntry(1f, listOf(3f,1f,2f).toFloatArray()),
                BarEntry(2f, floatArrayOf(1f,4f,0.9f)),
                BarEntry(3f,floatArrayOf(1f,4f,0.9f)),
                BarEntry(4f,floatArrayOf(1f,4f,0.9f)),
                BarEntry(5f,floatArrayOf(1f,4f,0.9f)),
                BarEntry(6f,floatArrayOf(1f,4f,0.9f))
            )



            val barDataSet = BarDataSet(bar01Entries,"").apply {
                colors = listOf(Color.parseColor("#FFA3A3"),
                    Color.parseColor("#FF8383"),
                    Color.parseColor("#FF6363")
                )
                title = "test"
                valueTextSize = 10f
                stackLabels = listOf("清醒",
                    "潜睡",
                    "").toTypedArray()
//                valueTypeface.

            }

            val barData = BarData(barDataSet).apply {
                barWidth = 0.8f

            }

            barChart1.data = barData

            with(barChart1) {
                setNoDataText("暂无数据")
                setScaleEnabled(false)

                xAxis.let {
                    it.position = XAxis.XAxisPosition.BOTTOM
                    it.valueFormatter = IndexAxisValueFormatter(listOf("一","二","三","四","五","六","七"))
                    it.textSize = 20f
                    it.setDrawGridLines(false)
                    textAlignment = View.TEXT_ALIGNMENT_VIEW_END
                }
                axisRight.isEnabled = false
                axisLeft.let{
                    it.setDrawGridLines(false)
                    it.textSize = 20f
                }


                description.isEnabled = false
                title = "Bar Chart 1"
                legend.let {
                    it.textSize = 15f
                }


            }

        }

        * */
    }

}
