package com.example.mohammad.samplemyapp.Model;

import android.location.Location;

import com.example.mohammad.samplemyapp.Object.BaseResponse;

public interface Model {

    interface ModelLocationManager {
        Location getLocationServer();
    }

    interface modelFetchList {
        BaseResponse getList();
    }
}
