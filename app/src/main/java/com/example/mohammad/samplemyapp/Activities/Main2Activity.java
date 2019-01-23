package com.example.mohammad.samplemyapp.Activities;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.Present.PresenterImps.FetchListPresenterImpl;
import com.example.mohammad.samplemyapp.Present.PresenterImps.LocationManagerPresenterImpl;
import com.example.mohammad.samplemyapp.R;
import com.example.mohammad.samplemyapp.View.View;
import com.example.mohammad.samplemyapp.object.Venue;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.ViewLocationManager, View.fetchListManager {

    public static String TAG = Main2Activity.class.getSimpleName();
    Presenter.LocationManager locationManager;
    Presenter.fetchList fetchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LocationManagerPresenterImpl.getInstance(this).getLocation();
        locationManager.getLocation();
        fetchList = new FetchListPresenterImpl(this);
    }

    @Override
    public void receiveLocation(Location location) {


    }

    @Override
    public void receiveList(ArrayList<Venue> venues) {

    }

    @Override
    public void onreceiveListErr() {

    }
}
