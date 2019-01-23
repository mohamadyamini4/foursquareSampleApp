package com.example.mohammad.samplemyapp.Object;

import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("code")
    private long code;
    @SerializedName("requetid")
    private String requestid;

    public long getCode() {
        return code;
    }

    public void setCode(long value) {
        this.code = value;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String value) {
        this.requestid = value;
    }
}
