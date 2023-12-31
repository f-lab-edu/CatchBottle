package com.season.winter.common.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope

abstract class BaseFragment<T: ViewDataBinding>(private val layoutResourceId: Int): Fragment() {

    private var viewDataBinding: T? = null
    val binding
        get() = viewDataBinding!!

    protected val coroutine = lifecycleScope

    protected abstract fun initStartView()
    protected abstract fun T.initAfterView()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        DataBindingUtil.inflate<T>(inflater, layoutResourceId, container,false).apply {
            viewDataBinding = this
            initStartView()
        }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.initAfterView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewDataBinding = null
    }
}