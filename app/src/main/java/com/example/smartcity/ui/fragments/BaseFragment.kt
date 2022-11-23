package com.example.smartcity.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment<T>:Fragment() {
    var _bind : T? = null
    val bind get() = _bind!!


    override fun onDestroy() {
        super.onDestroy()
        _bind = null
    }
}