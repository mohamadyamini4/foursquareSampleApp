package com.example.mohammad.samplemyapp.Object;

public class Venue {
    private String id;
    private String name;
    private Contact contact;
    private Location location;
    private Category[] categories;
    private boolean verified;
    private Stats stats;
    private BeenHere beenHere;
    private HereNow hereNow;
    private String referralid;
    private Object[] venueChains;
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

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] value) {
        this.categories = value;
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
