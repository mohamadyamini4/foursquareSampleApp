package com.example.mohammad.samplemyapp.Object;

public class BeenHere {
    private long count;
    private long lastCheckinExpiredAt;
    private boolean marked;
    private long unconfirmedCount;

    public long getCount() {
        return count;
    }

    public void setCount(long value) {
        this.count = value;
    }

    public long getLastCheckinExpiredAt() {
        return lastCheckinExpiredAt;
    }

    public void setLastCheckinExpiredAt(long value) {
        this.lastCheckinExpiredAt = value;
    }

    public boolean getMarked() {
        return marked;
    }

    public void setMarked(boolean value) {
        this.marked = value;
    }

    public long getUnconfirmedCount() {
        return unconfirmedCount;
    }

    public void setUnconfirmedCount(long value) {
        this.unconfirmedCount = value;
    }
}
