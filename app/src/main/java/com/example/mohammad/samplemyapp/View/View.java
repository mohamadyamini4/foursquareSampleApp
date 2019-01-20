package com.example.mohammad.samplemyapp.View;

import android.location.Location;

import com.example.mohammad.samplemyapp.Object.Venue;

import java.util.ArrayList;

public interface View {

    interface ViewLocationManager {
        void receiveLocation(Location location);
    }

    interface fetchListManager {
        void receiveList(ArrayList<Venue> venues);

        void onreceiveListErr();
    }
}
