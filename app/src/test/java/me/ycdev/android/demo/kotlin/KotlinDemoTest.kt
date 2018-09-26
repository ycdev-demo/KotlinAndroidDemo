package me.ycdev.android.demo.kotlin

import org.junit.Test

import me.ycdev.android.demo.common.CommonConstants

import org.junit.Assert.assertEquals

class KotlinDemoTest {
    @Test
    fun sdkVersion() {
        assertEquals(CommonConstants.SDK_VERSION, 1)
    }
}
