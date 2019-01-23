package com.example.mohammad.samplemyapp.Object;

import com.google.gson.annotations.SerializedName;

public class Icon {
    @SerializedName("prefix")
    private String prefix;
    @SerializedName("suffix")
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String value) {
        this.prefix = value;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String value) {
        this.suffix = value;
    }
}
