package com.mike.firebaseapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by Mike on 4/13/2016.
 */
public class MyApplication extends Application {
    private static MyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static MyApplication getInstance(){
        return sInstance;
    }

    public static Context getAppContext(){
        return sInstance.getApplicationContext();
    }
}