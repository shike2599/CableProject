package com.lichee.cable.cable.entity;

import java.io.Serializable;

/**
 * Created by lichee on 2019/3/30.
 */

public class CountCableResponse implements Serializable{

    /**
     * totalNum : 6
     * healthNum : 5
     * unhealthNum : 1
     */

    private int totalNum;
    private int healthNum;
    private int unhealthNum;

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getHealthNum() {
        return healthNum;
    }

    public void setHealthNum(int healthNum) {
        this.healthNum = healthNum;
    }

    public int getUnhealthNum() {
        return unhealthNum;
    }

    public void setUnhealthNum(int unhealthNum) {
        this.unhealthNum = unhealthNum;
    }
}
