package com.example.mohammad.samplemyapp.object;

import com.google.gson.annotations.SerializedName;

public class BaseResponse {
    @SerializedName("meta")
    private Meta meta;
    @SerializedName("response")
    private Response response;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response value) {
        this.response = value;
    }
}
