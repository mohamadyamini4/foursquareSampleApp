package com.example.mohammad.samplemyapp.Object;

public class Location {
    private double lat;
    private double lng;
    private LabeledLatLng[] labeledLatLngs;
    private long distance;
    private String postalCode;
    private String cc;
    private String city;
    private String state;
    private String country;
    private String[] formattedAddress;

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

    public LabeledLatLng[] getLabeledLatLngs() {
        return labeledLatLngs;
    }

    public void setLabeledLatLngs(LabeledLatLng[] value) {
        this.labeledLatLngs = value;
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

    public String[] getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String[] value) {
        this.formattedAddress = value;
    }
}
