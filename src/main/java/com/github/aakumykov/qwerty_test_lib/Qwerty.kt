package com.github.aakumykov.qwerty_test_lib

import android.util.Log

class Qwerty {
    fun work() {
        Log.d(TAG, "work()")
    }
    companion object {
        val TAG: String = Qwerty::class.java.simpleName
    }
}