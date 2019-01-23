package com.example.mohammad.samplemyapp.object;

import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("tipCount")
    private long tipCount;
    @SerializedName("usersCount")
    private long usersCount;
    @SerializedName("checkinsCount")
    private long checkinsCount;
    @SerializedName("visitsCount")
    private long visitsCount;

    public long getTipCount() {
        return tipCount;
    }

    public void setTipCount(long value) {
        this.tipCount = value;
    }

    public long getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(long value) {
        this.usersCount = value;
    }

    public long getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(long value) {
        this.checkinsCount = value;
    }

    public long getVisitsCount() {
        return visitsCount;
    }

    public void setVisitsCount(long value) {
        this.visitsCount = value;
    }
}
