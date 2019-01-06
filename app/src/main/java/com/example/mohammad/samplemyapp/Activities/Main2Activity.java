package com.example.mohammad.samplemyapp.Activities;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.Present.PresenterImps.LocationManagerPresenterImpl;
import com.example.mohammad.samplemyapp.R;
import com.example.mohammad.samplemyapp.View.View;

public class Main2Activity extends AppCompatActivity implements View.ViewLocationManager {

    Presenter.LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        locationManager = LocationManagerPresenterImpl.getInstance(this);

    }

    @Override
    public void receiveLocation(Location location) {

    }
}
