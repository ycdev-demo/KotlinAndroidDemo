package me.ycdev.android.demo.kotlin;

import org.junit.Test;

import me.ycdev.android.demo.common.CommonConstants;

import static org.junit.Assert.assertEquals;

public class JavaDemoTest {
    @Test
    public void sdkVersion() {
        assertEquals(CommonConstants.SDK_VERSION, 1);
    }
}
