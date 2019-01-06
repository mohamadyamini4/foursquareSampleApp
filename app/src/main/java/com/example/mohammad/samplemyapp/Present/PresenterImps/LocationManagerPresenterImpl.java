package com.example.mohammad.samplemyapp.Present.PresenterImps;

import android.app.Activity;
import android.content.Context;

import com.example.mohammad.samplemyapp.Model.Model;
import com.example.mohammad.samplemyapp.Model.ModelImpls.ModelLocationManagerImpl;
import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.View.View;

public class LocationManagerPresenterImpl implements Presenter.LocationManager {

    private static LocationManagerPresenterImpl presenter;
    private View.ViewLocationManager viewLocationManager;
    private Model.ModelLocationManager modelLocationManager;

    public static LocationManagerPresenterImpl getInstance(Context context) {
        if (presenter != null) return presenter;
        else {
            presenter = new LocationManagerPresenterImpl((View.ViewLocationManager) context, (Activity) context);
            return presenter;
        }
    }

    private LocationManagerPresenterImpl(View.ViewLocationManager viewLocationManager, Activity activity) {
        this.viewLocationManager = viewLocationManager;
        modelLocationManager = new ModelLocationManagerImpl(activity);
    }


    @Override
    public void getLocation() {
        viewLocationManager.receiveLocation(modelLocationManager.getLocationServer());
    }
}
