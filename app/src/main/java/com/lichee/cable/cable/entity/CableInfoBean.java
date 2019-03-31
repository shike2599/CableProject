package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/31.
 */

public  class CableInfoBean implements Serializable{
    /**
     * cable_status : ??
     * cable_name : SI000001
     * cable_id : 1
     * start_station : ??????
     * end_station : 6
     */

    private String cable_status;
    private String cable_name;
    private String cable_id;
    private String start_station;
    private String end_station;

    public String getCable_status() {
        return cable_status;
    }

    public void setCable_status(String cable_status) {
        this.cable_status = cable_status;
    }

    public String getCable_name() {
        return cable_name;
    }

    public void setCable_name(String cable_name) {
        this.cable_name = cable_name;
    }

    public String getCable_id() {
        return cable_id;
    }

    public void setCable_id(String cable_id) {
        this.cable_id = cable_id;
    }

    public String getStart_station() {
        return start_station;
    }

    public void setStart_station(String start_station) {
        this.start_station = start_station;
    }

    public String getEnd_station() {
        return end_station;
    }

    public void setEnd_station(String end_station) {
        this.end_station = end_station;
    }
}
