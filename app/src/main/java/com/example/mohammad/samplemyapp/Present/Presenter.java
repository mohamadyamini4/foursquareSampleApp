package com.example.mohammad.samplemyapp.Present;

import android.location.Location;

public interface Presenter {

    interface LocationManager {
        void getLocation();
    }

    interface fetchList {
        void getList(Location location);
    }
}
