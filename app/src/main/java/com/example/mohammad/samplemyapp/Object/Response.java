package com.example.mohammad.samplemyapp.Object;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Response {
    @SerializedName("venues")
    private ArrayList<Venue> venues;
    @SerializedName("confident")
    private boolean confident;

    public ArrayList<Venue> getVenues() {
        return venues;
    }

    public void setVenues(ArrayList<Venue> value) {
        this.venues = value;
    }

    public boolean getConfident() {
        return confident;
    }

    public void setConfident(boolean value) {
        this.confident = value;
    }
}
