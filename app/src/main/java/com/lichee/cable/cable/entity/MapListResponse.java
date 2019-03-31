package com.lichee.cable.cable.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lichee on 2019/3/30.
 */

public class MapListResponse implements Serializable {

    /**
     * geocoordMap : {"??????":[108.907345,34.203843],"??3????":[109.30197390625,34.4092153144531],"??2????":[109.35197390625,34.4692153144531],"?????":[108.986551542969,34.0999634101563],"??1????":[109.40197390625,34.6092153144531]}
     * stationId : [{"name":"??1????","value":"1"},{"name":"??2????","value":"2"},{"name":"??1????","value":"3"},{"name":"??2????","value":"4"},{"name":"??3????","value":"5"},{"name":"?????","value":"6"},{"name":"?????","value":"7"},{"name":"??????","value":"8"}]
     * cableInfo : [{"cable_status":"??","cable_name":"SI000001","cable_id":"1","start_station":"??????","end_station":"6"},{"cable_status":"??","cable_name":"SI000002","cable_id":"2","start_station":"??????","end_station":"7"},{"cable_status":"??","cable_name":"SI000003","cable_id":"3","start_station":"?????","end_station":"3"},{"cable_status":"??","cable_name":"SI000004","cable_id":"4","start_station":"?????","end_station":"4"},{"cable_status":"??","cable_name":"SI000005","cable_id":"5","start_station":"?????","end_station":"1"},{"cable_status":"?????2000m","cable_name":"SI000006","cable_id":"6","start_station":"?????","end_station":"2"}]
     * cityInfo : [{"city_isdeleted":false,"city_id":1,"city_name":"???\r\n"}]
     * stationInfo : [{"ss_id":"1","station_name":"??1????","station_level":"3"},{"ss_id":"2","station_name":"??2????","station_level":"3"},{"ss_id":"3","station_name":"??1????","station_level":"3"},{"ss_id":"4","station_name":"??2????","station_level":"3"},{"ss_id":"5","station_name":"??3????","station_level":"3"},{"ss_id":"6","station_name":"?????","station_level":"2"},{"ss_id":"7","station_name":"?????","station_level":"2"},{"ss_id":"8","station_name":"??????","station_level":"1"}]
     */

    private GeocoordMapBean geocoordMap;
    private List<StationIdBean> stationId;
    private List<CableInfoBean> cableInfo;
    private List<CityInfoBean> cityInfo;
    private List<StationInfoBean> stationInfo;

    public GeocoordMapBean getGeocoordMap() {
        return geocoordMap;
    }

    public void setGeocoordMap(GeocoordMapBean geocoordMap) {
        this.geocoordMap = geocoordMap;
    }

    public List<StationIdBean> getStationId() {
        return stationId;
    }

    public void setStationId(List<StationIdBean> stationId) {
        this.stationId = stationId;
    }

    public List<CableInfoBean> getCableInfo() {
        return cableInfo;
    }

    public void setCableInfo(List<CableInfoBean> cableInfo) {
        this.cableInfo = cableInfo;
    }

    public List<CityInfoBean> getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(List<CityInfoBean> cityInfo) {
        this.cityInfo = cityInfo;
    }

    public List<StationInfoBean> getStationInfo() {
        return stationInfo;
    }

    public void setStationInfo(List<StationInfoBean> stationInfo) {
        this.stationInfo = stationInfo;
    }

    public static class GeocoordMapBean {
        @SerializedName("??????")
        private List<Double> _$13; // FIXME check this code
        @SerializedName("??3????")
        private List<Double> _$34; // FIXME check this code
        @SerializedName("??2????")
        private List<Double> _$220; // FIXME check this code
        @SerializedName("?????")
        private List<Double> _$252; // FIXME check this code
        @SerializedName("??1????")
        private List<Double> _$1143; // FIXME check this code

        public List<Double> get_$13() {
            return _$13;
        }

        public void set_$13(List<Double> _$13) {
            this._$13 = _$13;
        }

        public List<Double> get_$34() {
            return _$34;
        }

        public void set_$34(List<Double> _$34) {
            this._$34 = _$34;
        }

        public List<Double> get_$220() {
            return _$220;
        }

        public void set_$220(List<Double> _$220) {
            this._$220 = _$220;
        }

        public List<Double> get_$252() {
            return _$252;
        }

        public void set_$252(List<Double> _$252) {
            this._$252 = _$252;
        }

        public List<Double> get_$1143() {
            return _$1143;
        }

        public void set_$1143(List<Double> _$1143) {
            this._$1143 = _$1143;
        }
    }

}
