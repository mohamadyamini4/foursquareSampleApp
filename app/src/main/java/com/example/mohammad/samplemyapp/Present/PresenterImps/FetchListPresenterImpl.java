package com.example.mohammad.samplemyapp.Present.PresenterImps;

import android.location.Location;

import com.example.mohammad.samplemyapp.Model.Model;
import com.example.mohammad.samplemyapp.Model.ModelImpls.getListModelImpl;
import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.View.View;
import com.example.mohammad.samplemyapp.object.BaseResponse;
import com.example.mohammad.samplemyapp.utils.AppLoader;
import com.example.mohammad.samplemyapp.utils.PrefManager;

import static com.example.mohammad.samplemyapp.network.Const.PREF_LAST_LOCATION;

public class FetchListPresenterImpl implements Presenter.fetchList, Presenter.ReceivedPlaceList {

    View.fetchListManager viewFetchListManager;
    Model.modelFetchList modelFetchList;
    boolean onceCall=false;


    public FetchListPresenterImpl(View.fetchListManager fetchListManager) {
        this.viewFetchListManager = fetchListManager;
        modelFetchList = new getListModelImpl(this);

    }


    @Override
    public void getList(Location location) {
        if (getLastLocation().equals("*") || moreThan100Meters(location) || isOnceCall()){
            saveLocationtoPref(location);
            modelFetchList.getList(convertLocationToString(location));
        }
    }
    private String getLastLocation(){
        return PrefManager.getInstance(AppLoader.getAppContext()).getSaveString(PREF_LAST_LOCATION);
    }

    private void saveLocationtoPref(Location location){
        PrefManager.getInstance(AppLoader.getAppContext()).saveString(PREF_LAST_LOCATION,convertLocationToString(location));
    }

    private boolean moreThan100Meters(Location location) {

        if (location != null) {
            String[] latlong = getLastLocation().split(",");
            double latp1 = Double.parseDouble(latlong[0]);
            double lngp1 = Double.parseDouble(latlong[1]);
            Location lastLocation = new Location("p1");
            lastLocation.setLatitude(latp1);
            lastLocation.setLongitude(lngp1);
            float distanceInMeters = location.distanceTo(lastLocation);
            if (distanceInMeters > 100)
                return true;
        }

        return false;
    }

    private String convertLocationToString(Location location) {

        return String.format("%s,%s", location.getLatitude(), location.getLongitude());
    }

    @Override
    public void receivedList(Object baseResponse) {

        if (baseResponse instanceof BaseResponse) {
            if (((BaseResponse) baseResponse).getMeta().getCode() == 200) {
                viewFetchListManager.receiveList(((BaseResponse) baseResponse).getResponse().getVenues());
            } else
                viewFetchListManager.onreceiveListErr();
        }
    }

    public boolean isOnceCall() {
        if (!onceCall){
            onceCall=true;
            return true;
        }
        else return false;

    }

    public void setOnceCall(boolean onceCall) {
        this.onceCall = onceCall;
    }
}
