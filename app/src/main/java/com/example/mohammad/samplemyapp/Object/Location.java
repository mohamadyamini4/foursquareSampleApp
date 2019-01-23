package com.example.mohammad.samplemyapp.Object;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Location {
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;
    @SerializedName("labelLatLngs")
    private ArrayList<LabeledLatLng> labeledLatLngs;
    @SerializedName("distance")
    private long distance;
    @SerializedName("postalCode")
    private String postalCode;
    @SerializedName("cc")
    private String cc;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("country")
    private String country;
    @SerializedName("formattedAddress")
    private ArrayList<String> formattedAddress;

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

    public ArrayList<LabeledLatLng> getLabeledLatLngs() {
        return labeledLatLngs;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long value) {
        this.distance = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String value) {
        this.cc = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public ArrayList<String> getFormattedAddress() {
        return formattedAddress;
    }
}
