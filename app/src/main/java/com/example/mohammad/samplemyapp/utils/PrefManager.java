package com.example.mohammad.samplemyapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    static PrefManager instance;
    private Context context;

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
        this.context=context;
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public String getSaveString(String key) {
        return sharedPreferences.getString(key,"*");
    }

    public void saveString(String key, String value) {
        sharedPreferences.edit().putString(key,value).apply();
    }

}
