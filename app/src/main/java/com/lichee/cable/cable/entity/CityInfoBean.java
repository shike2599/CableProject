package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/31.
 */

public  class CityInfoBean implements Serializable{
    /**
     * city_isdeleted : false
     * city_id : 1
     * city_name : ???

     */

    private boolean city_isdeleted;
    private int city_id;
    private String city_name;

    public boolean isCity_isdeleted() {
        return city_isdeleted;
    }

    public void setCity_isdeleted(boolean city_isdeleted) {
        this.city_isdeleted = city_isdeleted;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "CityInfoBean{" +
                "city_isdeleted=" + city_isdeleted +
                ", city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}