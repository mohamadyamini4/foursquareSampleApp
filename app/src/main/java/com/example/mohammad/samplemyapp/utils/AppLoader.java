package com.example.mohammad.samplemyapp.utils;

import android.app.Application;
import android.content.Context;

public class AppLoader extends Application {

    private static Context mContext;

    public static Context getAppContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;

    }
}
