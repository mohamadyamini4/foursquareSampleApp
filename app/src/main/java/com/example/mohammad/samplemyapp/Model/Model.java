package com.example.mohammad.samplemyapp.Model;

public interface Model {

    interface ModelLocationManager {
        void getLocationServer();
    }

    interface modelFetchList {
        void getList(String Location);
    }
}
