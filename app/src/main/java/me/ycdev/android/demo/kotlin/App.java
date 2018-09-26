package me.ycdev.android.demo.kotlin;

import android.app.Application;

import me.ycdev.android.demo.common.utils.LogUtils;

public class App extends Application {
    private static final String TAG = "KotlinDemo";

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.d(TAG, "app start...");
    }
}
