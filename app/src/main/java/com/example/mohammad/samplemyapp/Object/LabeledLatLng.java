package com.example.mohammad.samplemyapp.Object;

import com.google.gson.annotations.SerializedName;

public class LabeledLatLng {
    @SerializedName("label")
    private String label;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double value) {
        this.lat = value;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double value) {
        this.lng = value;
    }
}
