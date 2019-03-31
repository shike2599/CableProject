package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/31.
 */
public  class AreaIdBean implements Serializable {
    /**
     * city_id : {"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"}
     * area_id : 4
     * area_name : ???

     * area_isdeleted : false
     */

    private CityIdBean city_id;
    private int area_id;
    private String area_name;
    private boolean area_isdeleted;

    public CityIdBean getCity_id() {
        return city_id;
    }

    public void setCity_id(CityIdBean city_id) {
        this.city_id = city_id;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public boolean isArea_isdeleted() {
        return area_isdeleted;
    }

    public void setArea_isdeleted(boolean area_isdeleted) {
        this.area_isdeleted = area_isdeleted;
    }
}