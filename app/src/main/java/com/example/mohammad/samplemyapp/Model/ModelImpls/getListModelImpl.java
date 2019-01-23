package com.example.mohammad.samplemyapp.Model.ModelImpls;

import com.example.mohammad.samplemyapp.Model.Model;
import com.example.mohammad.samplemyapp.object.BaseResponse;

public class getListModelImpl implements Model.modelFetchList {


    @Override
    public BaseResponse getList() {
        return new BaseResponse();
    }
}
