package vip.frendy.ktablayout.extension

import android.os.Handler
import android.os.Looper

/**
 * Created by iiMedia on 2017/8/25.
 */
fun postDelayedToUI(runnable: () -> Unit, delay: Long) {
    val mainHandler = Handler(Looper.getMainLooper())
    mainHandler.postDelayed(runnable, delay)
}