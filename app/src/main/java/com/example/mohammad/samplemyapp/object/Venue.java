package com.example.mohammad.samplemyapp.object;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Venue {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("contact")
    private Contact contact;
    @SerializedName("location")
    private Location location;
    @SerializedName("categories")
    private ArrayList<Category> categories;
    @SerializedName("verified")
    private boolean verified;
    @SerializedName("stats")
    private Stats stats;
    @SerializedName("beenHere")
    private BeenHere beenHere;
    @SerializedName("hereNow")
    private HereNow hereNow;
    @SerializedName("referralid")
    private String referralid;
    @SerializedName("venueChains")
    private Object[] venueChains;
    @SerializedName("hasPerk")
    private boolean hasPerk;

    public String getid() {
        return id;
    }

    public void setid(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact value) {
        this.contact = value;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location value) {
        this.location = value;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public boolean getVerified() {
        return verified;
    }

    public void setVerified(boolean value) {
        this.verified = value;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats value) {
        this.stats = value;
    }

    public BeenHere getBeenHere() {
        return beenHere;
    }

    public void setBeenHere(BeenHere value) {
        this.beenHere = value;
    }

    public HereNow getHereNow() {
        return hereNow;
    }

    public void setHereNow(HereNow value) {
        this.hereNow = value;
    }

    public String getReferralid() {
        return referralid;
    }

    public void setReferralid(String value) {
        this.referralid = value;
    }

    public Object[] getVenueChains() {
        return venueChains;
    }

    public void setVenueChains(Object[] value) {
        this.venueChains = value;
    }

    public boolean getHasPerk() {
        return hasPerk;
    }

    public void setHasPerk(boolean value) {
        this.hasPerk = value;
    }
}
