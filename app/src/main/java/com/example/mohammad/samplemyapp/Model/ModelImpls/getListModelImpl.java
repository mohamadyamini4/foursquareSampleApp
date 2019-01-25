package com.example.mohammad.samplemyapp.Model.ModelImpls;

import com.example.mohammad.samplemyapp.Model.Model;
import com.example.mohammad.samplemyapp.Present.Presenter;
import com.example.mohammad.samplemyapp.network.ApiClient;
import com.example.mohammad.samplemyapp.network.ApiInterface;
import com.example.mohammad.samplemyapp.object.BaseResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.mohammad.samplemyapp.network.Const.*;

public class getListModelImpl implements Model.modelFetchList {

    Presenter.ReceivedPlaceList mReceivedPlaceList;

    public getListModelImpl(Presenter.ReceivedPlaceList mReceivedPlaceList) {
        this.mReceivedPlaceList = mReceivedPlaceList;
    }

    @Override
    public void getList(String location) {
        Call<BaseResponse> baseResponseCall = ApiClient.getClient().create(ApiInterface.class)
                .getPlaceList(CLIENT_ID,CLIENT_SECRET,location,VERSION);
        baseResponseCall.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {

                mReceivedPlaceList.receivedList(response.body());
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {

            }
        });
    }
}
