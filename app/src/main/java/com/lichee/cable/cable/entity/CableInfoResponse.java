package com.lichee.cable.cable.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lichee on 2019/3/30.
 */

public class CableInfoResponse implements Serializable {

    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * ss_id : {"station_name":"??????","area_id":{"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":4,"area_name":"???\r\n","area_isdeleted":false},"station_location":"[108.907345,34.203843]\r\n","station_isdeleted":false,"station_class":1,"station_id":8}
         * cable_status : ??
         * cable_name : SI000001
         * cable_isdeleted : false
         * cable_id : 1
         * es_id : {"station_name":"?????","area_id":{"city_id":{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"},"area_id":1,"area_name":"???\r\n","area_isdeleted":false},"station_location":"[108.986551542969,34.0999634101563]\r\n","station_isdeleted":false,"station_class":2,"station_id":6}
         */

        private SsIdBean ss_id;
        private String cable_status;
        private String cable_name;
        private boolean cable_isdeleted;
        private int cable_id;
        private EsIdBean es_id;

        public SsIdBean getSs_id() {
            return ss_id;
        }

        public void setSs_id(SsIdBean ss_id) {
            this.ss_id = ss_id;
        }

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

        public boolean isCable_isdeleted() {
            return cable_isdeleted;
        }

        public void setCable_isdeleted(boolean cable_isdeleted) {
            this.cable_isdeleted = cable_isdeleted;
        }

        public int getCable_id() {
            return cable_id;
        }

        public void setCable_id(int cable_id) {
            this.cable_id = cable_id;
        }

        public EsIdBean getEs_id() {
            return es_id;
        }

        public void setEs_id(EsIdBean es_id) {
            this.es_id = es_id;
        }
    }
}
