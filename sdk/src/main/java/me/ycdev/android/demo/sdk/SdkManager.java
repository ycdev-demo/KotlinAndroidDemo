package me.ycdev.android.demo.sdk;

import me.ycdev.android.demo.common.CommonConstants;
import me.ycdev.android.demo.common.utils.LogUtils;

public class SdkManager {
    private static final String TAG = "SdkManager";

    private static SdkManager sInstance = new SdkManager();

    public static SdkManager getInstance() {
        return sInstance;
    }

    public int getSdkVersion() {
        LogUtils.d(TAG, "SDK version: " + CommonConstants.SDK_VERSION);
        return CommonConstants.SDK_VERSION;
    }
}
