package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/31.
 */
public  class SsIdBean  implements Serializable {
    /**
     * station_name : ??????
     * area_id : {"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":4,"area_name":"???\r\n","area_isdeleted":false}
     * station_location : [108.907345,34.203843]

     * station_isdeleted : false
     * station_class : 1
     * station_id : 8
     */

    private String station_name;
    private AreaIdBean area_id;
    private String station_location;
    private boolean station_isdeleted;
    private int station_class;
    private int station_id;

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public AreaIdBean getArea_id() {
        return area_id;
    }

    public void setArea_id(AreaIdBean area_id) {
        this.area_id = area_id;
    }

    public String getStation_location() {
        return station_location;
    }

    public void setStation_location(String station_location) {
        this.station_location = station_location;
    }

    public boolean isStation_isdeleted() {
        return station_isdeleted;
    }

    public void setStation_isdeleted(boolean station_isdeleted) {
        this.station_isdeleted = station_isdeleted;
    }

    public int getStation_class() {
        return station_class;
    }

    public void setStation_class(int station_class) {
        this.station_class = station_class;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }


}