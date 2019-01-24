package com.example.mohammad.samplemyapp.Present;

import android.location.Location;

import com.example.mohammad.samplemyapp.object.BaseResponse;

public interface Presenter {

    interface LocationManager {
        void getLocation();
    }

    interface fetchList {
        void getList(Location location);
    }
    interface ReceivedPlaceList{

        void receivedList(Object baseResponse);
    }
}
