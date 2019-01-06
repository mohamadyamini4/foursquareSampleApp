package com.example.mohammad.samplemyapp.Object;

public class BaseResponse {
    private Meta meta;
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
