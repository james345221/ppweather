package com.example.ppweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by asus-pc on 2017/5/29.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
