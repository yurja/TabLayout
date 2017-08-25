package com.myxianwen.ngzb.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_community.*
import vip.frendy.ktablayout.R
import vip.frendy.ktablayout.extension.postDelayedToUI

/**
 * 社区
 */
class FragmentCommunity : Fragment(), View.OnClickListener {
    private var rootView: View? = null
    private val DEFAULT_URL = "http://frendy.vip/"

    companion object {
        fun getInstance(): FragmentCommunity {
            val fragment = FragmentCommunity()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (rootView == null) {
            rootView = inflater?.inflate(R.layout.fragment_community, container, false)
            initData()
            postDelayedToUI({ initView() }, 200)
        }
        // 缓存的rootView需要判断是否已经被加过parent， 如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误
        (rootView?.parent as? ViewGroup)?.removeView(rootView)
        return rootView
    }

    private fun initData() {

    }

    private fun initView() {
        webview?.loadUrl(DEFAULT_URL)
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {

        } else {

        }
    }

    override fun onDestroy() {
        webview?.destroy()
        super.onDestroy()
    }

    override fun onClick(view: View) {

    }
}
