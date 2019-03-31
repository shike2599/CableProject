package com.lichee.cable.cable.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lichee on 2019/3/30.
 */

public class CableRealResponse implements Serializable{

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable{
        /**
         * scan_time : {"nanos":0,"time":1539229144000,"minutes":39,"seconds":4,"hours":11,"month":9,"year":118,"timezoneOffset":-480,"day":4,"date":11}
         * a_cur : 10
         * is_checked : false
         * cable_id : {"ss_id":{"station_name":"??????","area_id":{"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":4,"area_name":"???\r\n","area_isdeleted":false},"station_location":"[108.907345,34.203843]\r\n","station_isdeleted":false,"station_class":1,"station_id":8},"cable_status":"??","cable_name":"SI000001","cable_isdeleted":false,"cable_id":1,"es_id":{"station_name":"?????","area_id":{"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":1,"area_name":"???\r\n","area_isdeleted":false},"station_location":"[108.986551542969,34.0999634101563]\r\n","station_isdeleted":false,"station_class":2,"station_id":6}}
         * real_info_id : 1
         * b_cur : 20
         * c_cur : 30
         */

        private ScanTimeBean scan_time;
        private int a_cur;
        private boolean is_checked;
        private CableIdBean cable_id;
        private int real_info_id;
        private int b_cur;
        private int c_cur;

        public ScanTimeBean getScan_time() {
            return scan_time;
        }

        public void setScan_time(ScanTimeBean scan_time) {
            this.scan_time = scan_time;
        }

        public int getA_cur() {
            return a_cur;
        }

        public void setA_cur(int a_cur) {
            this.a_cur = a_cur;
        }

        public boolean isIs_checked() {
            return is_checked;
        }

        public void setIs_checked(boolean is_checked) {
            this.is_checked = is_checked;
        }

        public CableIdBean getCable_id() {
            return cable_id;
        }

        public void setCable_id(CableIdBean cable_id) {
            this.cable_id = cable_id;
        }

        public int getReal_info_id() {
            return real_info_id;
        }

        public void setReal_info_id(int real_info_id) {
            this.real_info_id = real_info_id;
        }

        public int getB_cur() {
            return b_cur;
        }

        public void setB_cur(int b_cur) {
            this.b_cur = b_cur;
        }

        public int getC_cur() {
            return c_cur;
        }

        public void setC_cur(int c_cur) {
            this.c_cur = c_cur;
        }
    }
}
