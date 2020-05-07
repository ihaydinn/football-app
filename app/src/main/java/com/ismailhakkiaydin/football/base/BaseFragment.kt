package com.ismailhakkiaydin.football.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

abstract class BaseFragment<DB: ViewDataBinding, VM: ViewModel>: Fragment() {

    lateinit var viewModel: VM
    lateinit var dataBinding: DB

    @LayoutRes
    abstract fun getResourceLayout() : Int
    abstract fun getViewModel() : Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(getViewModel())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, getResourceLayout(), container, false)
        return dataBinding.root
    }

}