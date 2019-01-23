package com.example.mohammad.samplemyapp.Present.PresenterImps;

import android.location.Location;

import com.example.mohammad.samplemyapp.Model.Model;
import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.View.View;
import com.example.mohammad.samplemyapp.object.BaseResponse;

public class FetchListPresenterImpl implements Presenter.fetchList {

    View.fetchListManager fetchListManager;
    Model.modelFetchList modelFetchList;

    public FetchListPresenterImpl(View.fetchListManager fetchListManager) {
        this.fetchListManager = fetchListManager;

    }


    @Override
    public void getList(Location location) {
        BaseResponse baseResponse = modelFetchList.getList();
        if (baseResponse.getMeta().getCode() == 200) {
            fetchListManager.receiveList(baseResponse.getResponse().getVenues());
        } else {
            fetchListManager.onreceiveListErr();
        }

    }
}
