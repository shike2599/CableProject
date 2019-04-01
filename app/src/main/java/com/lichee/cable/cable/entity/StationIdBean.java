package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/31.
 */

public  class StationIdBean implements Serializable {
    /**
     * name : ??1????
     * value : 1
     */

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StationIdBean{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}