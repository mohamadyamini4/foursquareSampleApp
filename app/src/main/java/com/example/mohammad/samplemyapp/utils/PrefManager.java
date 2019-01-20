package com.example.mohammad.samplemyapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    static PrefManager instance;

    public static PrefManager getInstance(Context context) {
        if (instance != null)
            return instance;
        synchronized (PrefManager.class) {
            instance = new PrefManager(context);
            return instance;
        }
    }

    private SharedPreferences sharedPreferences;
    private String prefName = "FourSquarePref";

    public PrefManager(Context context) {
        sharedPreferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public void saveString(Context context, String key, String value) {


    }

}
