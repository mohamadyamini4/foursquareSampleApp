package com.example.mohammad.samplemyapp.Present.PresenterImps;

import android.location.Location;

import com.example.mohammad.samplemyapp.Model.Model;
import com.example.mohammad.samplemyapp.Model.ModelImpls.getListModelImpl;
import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.View.View;
import com.example.mohammad.samplemyapp.object.BaseResponse;

public class FetchListPresenterImpl implements Presenter.fetchList ,Presenter.ReceivedPlaceList {

    View.fetchListManager viewFetchListManager;
    Model.modelFetchList modelFetchList;

    public FetchListPresenterImpl(View.fetchListManager fetchListManager) {
        this.viewFetchListManager = fetchListManager;
        modelFetchList=new getListModelImpl(this);

    }


    @Override
    public void getList(Location location) {

        modelFetchList.getList(convertLocationToString(location));

    }

    private String convertLocationToString(Location location) {

        return String.format("%s,%s",location.getLatitude(),location.getLongitude());
    }

    @Override
    public void receivedList(Object baseResponse) {

        if (baseResponse instanceof BaseResponse) {
            if (((BaseResponse) baseResponse).getMeta().getCode()==200) {
                viewFetchListManager.receiveList(((BaseResponse) baseResponse).getResponse().getVenues());
            }
            else
                viewFetchListManager.onreceiveListErr();
        }
    }
}
