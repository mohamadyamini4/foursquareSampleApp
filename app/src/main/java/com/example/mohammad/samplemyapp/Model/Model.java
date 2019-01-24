package com.example.mohammad.samplemyapp.Model;

import android.location.Location;

import com.example.mohammad.samplemyapp.object.BaseResponse;

public interface Model {

    interface ModelLocationManager {
        Location getLocationServer();
    }

    interface modelFetchList {
        void getList(String Location);
    }
}
