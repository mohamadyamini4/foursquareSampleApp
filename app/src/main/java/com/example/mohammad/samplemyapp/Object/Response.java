package com.example.mohammad.samplemyapp.Object;

import java.util.ArrayList;

public class Response {
    private ArrayList<Venue> venues;
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
