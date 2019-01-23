package com.example.mohammad.samplemyapp.Object;

import com.google.gson.annotations.SerializedName;

public class HereNow {
    @SerializedName("count")
    private long count;
    @SerializedName("summery")
    private String summary;
    @SerializedName("groups")
    private Object[] groups;

    public long getCount() {
        return count;
    }

    public void setCount(long value) {
        this.count = value;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String value) {
        this.summary = value;
    }

    public Object[] getGroups() {
        return groups;
    }

    public void setGroups(Object[] value) {
        this.groups = value;
    }
}
