package com.ym.quickrun.bean;

import java.util.List;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/10
 * desc: 分钟级预报
 */


public class MinutelyBean {
    /**
     * status : ok
     * description : 零星小雨，点点滴滴
     * probability : [0.7898951173,0.6828188896,0.52573663,0.2881945372]
     * probability_4h : [0.7898951173,0.52573663,0.3594248891,0.5171459317]
     * datasource : radar
     * precipitation_2h : [0.0327,0.0369,0.0428,0.0497,0.0566,0.0625,0.0668,0.0693,0.0701,0.0692,0.0666,0.0625,0.0569,0.0501,0.0427,0.035,0.0276,0.0208,0.0151,0.0103,0.0065,0.0036,0.0014,0,0,0,0,0,0,0,2.0E-4,3.0E-4,3.0E-4,2.0E-4,1.0E-4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
     * precipitation : [0.0327,0.0369,0.0428,0.0497,0.0566,0.0625,0.0668,0.0693,0.0701,0.0692,0.0666,0.0625,0.0569,0.0501,0.0427,0.035,0.0276,0.0208,0.0151,0.0103,0.0065,0.0036,0.0014,0,0,0,0,0,0,0,2.0E-4,3.0E-4,3.0E-4,2.0E-4,1.0E-4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
     */

    private String status;
    private String description;
    private String datasource; //天气状况
    private List<Double> probability; //未来四天可能性出现零星小雨的概率
    private List<Double> probability_4h; //未来四小时可能性出现零星小雨的概率
    private List<Double> precipitation_2h; //未来2小时每分钟的降雨量
    private List<Double> precipitation; //未来一小时每分钟的降雨量，0.03-0.25是小雨，0.25-0.35是中雨, 0.35以上是大雨，根据不同地区情况可以有所调整。如果需要mm/h，请在请求中加参数 ?unit=metric:v2

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public List<Double> getProbability() {
        return probability;
    }

    public void setProbability(List<Double> probability) {
        this.probability = probability;
    }

    public List<Double> getProbability_4h() {
        return probability_4h;
    }

    public void setProbability_4h(List<Double> probability_4h) {
        this.probability_4h = probability_4h;
    }

    public List<Double> getPrecipitation_2h() {
        return precipitation_2h;
    }

    public void setPrecipitation_2h(List<Double> precipitation_2h) {
        this.precipitation_2h = precipitation_2h;
    }

    public List<Double> getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(List<Double> precipitation) {
        this.precipitation = precipitation;
    }
}