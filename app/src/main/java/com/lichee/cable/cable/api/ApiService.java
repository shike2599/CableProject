package com.lichee.cable.cable.api;

import com.lichee.cable.cable.entity.AlarmInfoResponse;
import com.lichee.cable.cable.entity.CableInfoResponse;
import com.lichee.cable.cable.entity.CableListResponse;
import com.lichee.cable.cable.entity.CableRealResponse;
import com.lichee.cable.cable.entity.CountCableResponse;
import com.lichee.cable.cable.entity.InitLeftResponse;
import com.lichee.cable.cable.entity.MapListResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author lichee
 */
public interface ApiService {

    /**
     * 1.获取左侧城市、区域、电站列表
     * @return  LeftResultResponse
     */
    @GET("cats/index/getInitLeft.do")
    Observable<InitLeftResponse> getInitLeft();

    /**
     * 2.根据电站ID获取电缆信息
     * @param state   电缆状态（0全部，1正常，2故障）
     * @param searchKey   电站id（0为全部电站）
     * @param page   翻页参数（默认为1）
     * @return
     */
    @GET("cats/Cable/getCableListByPage.do")
    Observable<CableListResponse> getCableListByPage(@Query("state") String state,
                                                     @Query("searchKey") String searchKey,
                                                     @Query("page")Integer page);

    /**
     * 3.根据电站ID统计电缆总数及故障数
     * @param searchKey  电站id（0为全部电站）
     * @return
     */
    @GET("cats/Cable/countCableNum.do")
    Observable<CountCableResponse> countCableNum(@Query("searchKey") String searchKey);

    /**
     * 4.根据电缆ID获取电缆实时动态数据信息
     * @param cable_id   电缆id
     * @return
     */
    @GET("cats/Cable/getCableRealData.do")
    Observable<CableRealResponse> getCableRealData(@Query("cable_id") String cable_id);


    /**
     * 5.定时轮询报警
     * @return
     */
    @GET("cats/Cable/getCableInfo.do")
    Observable<CableInfoResponse> getCableInfo();

    /**
     * 6.获取所有报警信息
     * @return
     */
    @GET("cats/alarm/getAlarmInfo.do")
    Observable<AlarmInfoResponse> getAlarmInfo();

    /**
     * 7. 获取地图所需信息
     * @return
     */
    @GET("cats/index/getMapList.do")
    Observable<MapListResponse> getMapList();

}
