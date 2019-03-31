package com.lichee.cable.cable.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lichee on 2019/3/30.
 */

public class AlarmInfoResponse implements Serializable {

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * alarm_log_id : 1
         * cable_id : {"ss_id":{"station_name":"??????","area_id":{"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":4,"area_name":"???\r\n","area_isdeleted":false},"station_location":"[108.907345,34.203843]\r\n","station_isdeleted":false,"station_class":1,"station_id":8},"cable_status":"??","cable_name":"SI000001","cable_isdeleted":false,"cable_id":1,"es_id":{"station_name":"?????","area_id":{"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":1,"area_name":"???\r\n","area_isdeleted":false},"station_location":"[108.986551542969,34.0999634101563]\r\n","station_isdeleted":false,"station_class":2,"station_id":6}}
         * alarm_info : ?????300m

         * alarm_date : {"nanos":0,"time":1536632100000,"minutes":15,"seconds":0,"hours":10,"month":8,"year":118,"timezoneOffset":-480,"day":2,"date":11}
         * user_id : null
         * alarm_log_isdeleted : true
         */

        private int alarm_log_id;
        private CableIdBean cable_id;
        private String alarm_info;
        private AlarmDateBean alarm_date;
        private Object user_id;
        private boolean alarm_log_isdeleted;

        public int getAlarm_log_id() {
            return alarm_log_id;
        }

        public void setAlarm_log_id(int alarm_log_id) {
            this.alarm_log_id = alarm_log_id;
        }

        public CableIdBean getCable_id() {
            return cable_id;
        }

        public void setCable_id(CableIdBean cable_id) {
            this.cable_id = cable_id;
        }

        public String getAlarm_info() {
            return alarm_info;
        }

        public void setAlarm_info(String alarm_info) {
            this.alarm_info = alarm_info;
        }

        public AlarmDateBean getAlarm_date() {
            return alarm_date;
        }

        public void setAlarm_date(AlarmDateBean alarm_date) {
            this.alarm_date = alarm_date;
        }

        public Object getUser_id() {
            return user_id;
        }

        public void setUser_id(Object user_id) {
            this.user_id = user_id;
        }

        public boolean isAlarm_log_isdeleted() {
            return alarm_log_isdeleted;
        }

        public void setAlarm_log_isdeleted(boolean alarm_log_isdeleted) {
            this.alarm_log_isdeleted = alarm_log_isdeleted;
        }

    }
}
