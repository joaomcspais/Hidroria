package com.jp.hidroria;

import java.io.Serializable;

public class Data implements Serializable {
    private String location;
    private String info;
    private String date;
    private String locname;

    public Data()
    {
        this.location = "";
        this.info = "";
        this.date = "";
        this.locname = "";
    }

    public String getLocation() {
        return location;
    }

    public String getLocationName() {
        return locname;
    }

    public String getInfo() {
        return info;
    }

    public String getDate() {
        return date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLocationName(String location) {
        this.locname = location;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
