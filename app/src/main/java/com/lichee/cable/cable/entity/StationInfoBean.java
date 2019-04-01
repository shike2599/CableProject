package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/31.
 */

public  class StationInfoBean implements Serializable{
    /**
     * ss_id : 1
     * station_name : ??1????
     * station_level : 3
     */

    private String ss_id;
    private String station_name;
    private String station_level;

    public String getSs_id() {
        return ss_id;
    }

    public void setSs_id(String ss_id) {
        this.ss_id = ss_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_level() {
        return station_level;
    }

    public void setStation_level(String station_level) {
        this.station_level = station_level;
    }

    @Override
    public String toString() {
        return "StationInfoBean{" +
                "ss_id='" + ss_id + '\'' +
                ", station_name='" + station_name + '\'' +
                ", station_level='" + station_level + '\'' +
                '}';
    }
}