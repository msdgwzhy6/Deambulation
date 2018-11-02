package com.ym.deambulation.network.api;

import com.ym.deambulation.bean.FutureWeatherBean;
import com.ym.deambulation.bean.LocalWeatherBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/7
 * desc: 天气接口
 */
public interface WeatherService {

    /**
     * 获取当地天气状况
     *
     * @param token     token
     * @param latitude  纬度
     * @param longitude 经度
     * @return
     */
    @GET("v2/{token}/{latitude},{longitude}/realtime.json")
    Flowable<LocalWeatherBean> getLocalWeather(
            @Path("token") String token,
            @Path("latitude") String latitude,
            @Path("longitude") String longitude
    );


    /**
     * 获取当地未来天气状况
     *
     * @param token     token
     * @param latitude  纬度
     * @param longitude 经度
     * @return
     */
    @GET("v2/{token}/{latitude},{longitude}/forecast.json")
    Flowable<FutureWeatherBean> getFutureWeather(
            @Path("token") String token,
            @Path("latitude") String latitude,
            @Path("longitude") String longitude
    );
}
