package com.ym.deambulation.bean;

import java.util.List;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/10
 * desc: 当地天气状况
 */
public class LocalWeatherBean {


    /**
     * status : ok
     * lang : zh_CN //目前只支持简体中文（zh_CN、zh_SG）、繁体中文（zh_TW、zh_HK），英语（en_US、en_GB）在测试中
     * server_time : 1539139331
     * tzshift : 28800  //时区的偏移秒数，如东八区就是 28800 秒，使用秒是为了支持像尼泊尔这样的差 5 小时 45 分钟的地区，它们有非整齐的偏移量
     * location : [39.9283  //纬度,116.4163  //经度]
     * unit : metric  //目前只支持米制（metric）和科学计量法（SI），英制还有待开发
     * result : {"status":"ok","o3":19,"co":0.3,"temperature":13.79,"pm10":28,"skycon":"CLEAR_DAY","cloudrate":0,"aqi":28,"comfort":{"index":7,"desc":"冷"},"no2":26,"visibility":30.7,"humidity":0.26,"pres":101876.79,"ultraviolet":{"index":7,"desc":"强"},"pm25":11,"so2":6,"precipitation":{"nearest":{"status":"ok","distance":46.03,"intensity":0.1875},"local":{"status":"ok","intensity":0,"datasource":"radar"}},"wind":{"direction":328.35,"speed":6.5}}
     */

    public String status;
    public String lang;
    public int server_time;
    public int tzshift;
    public String unit;
    public ResultBean result;
    public List<Double> location;


    public static class ResultBean {
        /**
         * status : ok
         * o3 : 19
         * co : 0.3
         * temperature : 13.79  //温度
         * pm10 : 28
         * skycon : CLEAR_DAY  //天气概况    CLEAR_DAY：晴天
                                            CLEAR_NIGHT：晴夜
                                            PARTLY_CLOUDY_DAY：多云
                                            PARTLY_CLOUDY_NIGHT：多云
                                            CLOUDY：阴
                                            RAIN： 雨
                                            SNOW：雪
                                            WIND：风
                                            HAZE：雾霾沙尘

         * cloudrate : 0     // 云量
         * aqi : 28
         * comfort : {"index":7,"desc":"冷"}
         * no2 : 26
         * visibility : 30.7
         * humidity : 0.26  //相对湿度
         * pres : 101876.79 //气压
         * ultraviolet : {"index":7,"desc":"强"}
         * pm25 : 11      //pm25值
         * so2 : 6
         * precipitation : {//降水
                              "nearest":{ //最近的降水带 //用户补充：nearest字段有时候没有
                                          "status":"ok"
                                          "distance":46.03 //距离
                                          "intensity":0.1875  /降水强度}
                              "local":{ //本地的降水
                                         "status":"ok"
                                         "intensity":0  //降水强度，这是彩云自定义的一个量。如果需要mm/h，请在请求中加参数 ?unit=metric:v2
                                         "datasource":"radar" //数据源}
                           }
         * wind : { //风
                    "direction":328.35  //风向。单位是度。正北方向为0度，顺时针增加到360度。
                    "speed":6.5  //风速，米制下是公里每小时}
         */

        public String status;
        public int o3;
        public double co;
        public double temperature;
        public int pm10;
        public String skycon;
        public int cloudrate;
        public int aqi;
        public ComfortBean comfort;
        public int no2;
        public double visibility;
        public double humidity;
        public double pres;
        public UltravioletBean ultraviolet;
        public int pm25;
        public int so2;
        public PrecipitationBean precipitation;
        public WindBean wind;


        public static class ComfortBean {
            /**
             * index : 7
             * desc : 冷
             */

            public int index;
            public String desc;

        }

        public static class UltravioletBean {
            /**
             * index : 7
             * desc : 强
             */

            public int index;
            public String desc;

        }

        public static class PrecipitationBean {
            /**
             * nearest : {"status":"ok","distance":46.03,"intensity":0.1875}
             * local : {"status":"ok","intensity":0,"datasource":"radar"}
             */

            public NearestBean nearest;
            public LocalBean local;


            public static class NearestBean {
                /**
                 * status : ok
                 * distance : 46.03
                 * intensity : 0.1875
                 */

                public String status;
                public double distance;
                public double intensity;

            }

            public static class LocalBean {
                /**
                 * status : ok
                 * intensity : 0
                 * datasource : radar
                 */

                public String status;
                public int intensity;
                public String datasource;

            }
        }

        public static class WindBean {
            /**
             * direction : 328.35
             * speed : 6.5
             */

            public double direction;
            public double speed;

        }
    }
}
