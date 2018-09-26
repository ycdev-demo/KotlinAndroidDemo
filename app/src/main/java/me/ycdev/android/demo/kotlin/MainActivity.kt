package me.ycdev.android.demo.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.ycdev.android.demo.common.utils.LogUtils

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtils.d(TAG, "test log")
    }
}
