package com.example.mohammad.samplemyapp.View;

import android.location.Location;

public interface View {

    interface ViewLocationManager {
        void receiveLocation(Location location);
    }
}
