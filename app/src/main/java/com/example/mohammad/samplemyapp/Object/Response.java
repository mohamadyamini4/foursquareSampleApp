package com.example.mohammad.samplemyapp.Object;

public class Response {
    private io.quicktype.Venue[] venues;
    private boolean confident;

    public io.quicktype.Venue[] getVenues() {
        return venues;
    }

    public void setVenues(io.quicktype.Venue[] value) {
        this.venues = value;
    }

    public boolean getConfident() {
        return confident;
    }

    public void setConfident(boolean value) {
        this.confident = value;
    }
}
