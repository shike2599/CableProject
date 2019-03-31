package com.lichee.cable.cable.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lichee on 2019/3/30.
 */

public class InitLeftResponse implements Serializable{

    private List<LeftResultBean> leftResult;

    public List<LeftResultBean> getLeftResult() {
        return leftResult;
    }

    public void setLeftResult(List<LeftResultBean> leftResult) {
        this.leftResult = leftResult;
    }

    public static class LeftResultBean implements Serializable{
        /**
         * city_id : 1
         * station_name : ??1????

         * area_id : 1
         * city_name : ???

         * area_name : ???

         * station_id : 1
         */

        private String city_id;
        private String station_name;
        private String area_id;
        private String city_name;
        private String area_name;
        private String station_id;

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getStation_name() {
            return station_name;
        }

        public void setStation_name(String station_name) {
            this.station_name = station_name;
        }

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public String getStation_id() {
            return station_id;
        }

        public void setStation_id(String station_id) {
            this.station_id = station_id;
        }
    }
}
