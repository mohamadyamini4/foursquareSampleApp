package com.example.mohammad.samplemyapp.network;

import com.example.mohammad.samplemyapp.object.BaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("venues/search")
    Call<BaseResponse> getPlaceList(@Query("client_id") String client_id,
                                    @Query("client_secret") String client_secret,
                                    @Query("ll") String ll,
                                    @Query("v") String v);

}
