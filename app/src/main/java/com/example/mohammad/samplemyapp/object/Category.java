package com.example.mohammad.samplemyapp.object;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("pluralName")
    private String pluralName;
    @SerializedName("shortName")
    private String shortName;
    @SerializedName("icon")
    private Icon icon;
    @SerializedName("primary")
    private boolean primary;

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

    public String getPluralName() {
        return pluralName;
    }

    public void setPluralName(String value) {
        this.pluralName = value;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String value) {
        this.shortName = value;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon value) {
        this.icon = value;
    }

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean value) {
        this.primary = value;
    }
}
