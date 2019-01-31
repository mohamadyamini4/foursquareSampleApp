package com.example.mohammad.samplemyapp.Present;

import android.location.Location;

public interface Presenter {

    interface LocationManager {
        void getLocation();
    }

    interface receivedLocation{

        void onReceived(Location location);
    }


    interface fetchList {
        void getList(Location location);
    }
    interface ReceivedPlaceList{

        void receivedList(Object baseResponse);
    }
}
