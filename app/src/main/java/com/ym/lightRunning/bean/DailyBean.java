package com.ym.lightRunning.bean;

import java.util.List;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/10
 * desc: 未来四天的天气状况
 */

public class DailyBean {
    /**
     * status : ok
     * coldRisk : [{"index":"3","desc":"易发","datetime":"2018-10-10"},{"index":"3","desc":"易发","datetime":"2018-10-11"},{"index":"3","desc":"易发","datetime":"2018-10-12"},{"index":"3","desc":"易发","datetime":"2018-10-13"},{"index":"3","desc":"易发","datetime":"2018-10-14"}]
     * skycon_20h_32h : [{"date":"2018-10-10","value":"RAIN"},{"date":"2018-10-11","value":"RAIN"},{"date":"2018-10-12","value":"RAIN"},{"date":"2018-10-13","value":"RAIN"},{"date":"2018-10-14","value":"RAIN"}]
     * temperature : [{"date":"2018-10-10","max":25,"avg":23.27,"min":22},{"date":"2018-10-11","max":23,"avg":21.4,"min":20},{"date":"2018-10-12","max":24,"avg":22.13,"min":21},{"date":"2018-10-13","max":24,"avg":22.47,"min":21},{"date":"2018-10-14","max":25,"avg":22.99,"min":21}]
     * skycon : [{"date":"2018-10-10","value":"RAIN"},{"date":"2018-10-11","value":"RAIN"},{"date":"2018-10-12","value":"RAIN"},{"date":"2018-10-13","value":"RAIN"},{"date":"2018-10-14","value":"RAIN"}]
     * cloudrate : [{"date":"2018-10-10","max":0.99,"avg":0.89,"min":0.78},{"date":"2018-10-11","max":1,"avg":1,"min":0.99},{"date":"2018-10-12","max":1,"avg":0.94,"min":0.84},{"date":"2018-10-13","max":0.97,"avg":0.85,"min":0.71},{"date":"2018-10-14","max":1,"avg":0.89,"min":0.51}]
     * aqi : [{"date":"2018-10-10","max":20,"avg":16.82,"min":14},{"date":"2018-10-11","max":19,"avg":13.83,"min":10},{"date":"2018-10-12","max":17,"avg":12.92,"min":10},{"date":"2018-10-13","max":17,"avg":12.12,"min":9},{"date":"2018-10-14","max":18,"avg":13.42,"min":10}]
     * comfort : [{"index":"3","desc":"热","datetime":"2018-10-10"},{"index":"4","desc":"温暖","datetime":"2018-10-11"},{"index":"4","desc":"温暖","datetime":"2018-10-12"},{"index":"4","desc":"温暖","datetime":"2018-10-13"},{"index":"3","desc":"热","datetime":"2018-10-14"}]
     * humidity : [{"date":"2018-10-10","max":0.88,"avg":0.85,"min":0.79},{"date":"2018-10-11","max":0.9,"avg":0.87,"min":0.82},{"date":"2018-10-12","max":0.85,"avg":0.81,"min":0.79},{"date":"2018-10-13","max":0.86,"avg":0.82,"min":0.8},{"date":"2018-10-14","max":0.87,"avg":0.84,"min":0.79}]
     * astro : [{"date":"2018-10-10","sunset":{"time":"17:31"},"sunrise":{"time":"05:49"}},{"date":"2018-10-11","sunset":{"time":"17:30"},"sunrise":{"time":"05:49"}},{"date":"2018-10-12","sunset":{"time":"17:29"},"sunrise":{"time":"05:50"}},{"date":"2018-10-13","sunset":{"time":"17:28"},"sunrise":{"time":"05:50"}},{"date":"2018-10-14","sunset":{"time":"17:27"},"sunrise":{"time":"05:51"}}]
     * pres : [{"date":"2018-10-10","max":100204.1,"avg":100076.49,"min":99887.44},{"date":"2018-10-11","max":100654.64,"avg":100384.3,"min":100130.84},{"date":"2018-10-12","max":100653.9,"avg":100529.37,"min":100403.92},{"date":"2018-10-13","max":100500.21,"avg":100376.79,"min":100254.09},{"date":"2018-10-14","max":100355.33,"avg":100180.29,"min":99997.72}]
     * ultraviolet : [{"index":"1","desc":"最弱","datetime":"2018-10-10"},{"index":"1","desc":"最弱","datetime":"2018-10-11"},{"index":"1","desc":"最弱","datetime":"2018-10-12"},{"index":"1","desc":"最弱","datetime":"2018-10-13"},{"index":"1","desc":"最弱","datetime":"2018-10-14"}]
     * pm25 : [{"date":"2018-10-10","max":13,"avg":11.18,"min":7},{"date":"2018-10-11","max":14,"avg":9.92,"min":6},{"date":"2018-10-12","max":12,"avg":9.08,"min":6},{"date":"2018-10-13","max":12,"avg":8.5,"min":6},{"date":"2018-10-14","max":13,"avg":9.38,"min":7}]
     * dressing : [{"index":"4","desc":"温暖","datetime":"2018-10-10"},{"index":"5","desc":"凉爽","datetime":"2018-10-11"},{"index":"4","desc":"温暖","datetime":"2018-10-12"},{"index":"4","desc":"温暖","datetime":"2018-10-13"},{"index":"4","desc":"温暖","datetime":"2018-10-14"}]
     * carWashing : [{"index":"3","desc":"较不适宜","datetime":"2018-10-10"},{"index":"3","desc":"较不适宜","datetime":"2018-10-11"},{"index":"3","desc":"较不适宜","datetime":"2018-10-12"},{"index":"3","desc":"较不适宜","datetime":"2018-10-13"},{"index":"3","desc":"较不适宜","datetime":"2018-10-14"}]
     * precipitation : [{"date":"2018-10-10","max":0.8485,"avg":0.4638,"min":0},{"date":"2018-10-11","max":4.2824,"avg":1.5967,"min":0.447},{"date":"2018-10-12","max":0.5718,"avg":0.2995,"min":0.1936},{"date":"2018-10-13","max":0.32,"avg":0.2454,"min":0.0816},{"date":"2018-10-14","max":0.4882,"avg":0.1715,"min":0}]
     * wind : [{"date":"2018-10-10","max":{"direction":56.57,"speed":23.33},"avg":{"direction":55.62,"speed":19.96},"min":{"direction":66.03,"speed":14.97}},{"date":"2018-10-11","max":{"direction":29.58,"speed":33.08},"avg":{"direction":34.68,"speed":26.37},"min":{"direction":41.18,"speed":18.34}},{"date":"2018-10-12","max":{"direction":55.62,"speed":26.43},"avg":{"direction":59.91,"speed":23.22},"min":{"direction":84.96,"speed":19.34}},{"date":"2018-10-13","max":{"direction":77.37,"speed":24.63},"avg":{"direction":82.48,"speed":22.11},"min":{"direction":86.94,"speed":18.11}},{"date":"2018-10-14","max":{"direction":71.77,"speed":22.75},"avg":{"direction":82.56,"speed":21.46},"min":{"direction":93.59,"speed":19.22}}]
     * skycon_08h_20h : [{"date":"2018-10-10","value":"RAIN"},{"date":"2018-10-11","value":"RAIN"},{"date":"2018-10-12","value":"RAIN"},{"date":"2018-10-13","value":"RAIN"},{"date":"2018-10-14","value":"RAIN"}]
     */

    public String status;
    public List<ColdRiskBean> coldRisk; //寒冷天气
    public List<Skycon20h32hBean> skycon_20h_32h;
    public List<TemperatureBeanX> temperature; //温度
    public List<SkyconBeanX> skycon; //天气状况
    public List<CloudrateBeanX> cloudrate; // 雾气情况
    public List<AqiBeanX> aqi; //空气质量指数
    public List<ComfortBean> comfort; //舒适度
    public List<HumidityBeanX> humidity; //湿度
    public List<AstroBean> astro; //夜晚时间
    public List<PresBeanX> pres; //大气压强
    public List<UltravioletBean> ultraviolet; //紫外线
    public List<Pm25BeanX> pm25; // PM2.5指数
    public List<DressingBean> dressing; //空气凉爽
    public List<CarWashingBean> carWashing; //洗车
    public List<PrecipitationBeanX> precipitation;  //降水量  单位 mm/h，0.05 ~ 0.9 小雨 0.9 ~ 2.87 中雨 >2.87大雨；
    public List<WindBeanX> wind; //风量
    public List<Skycon08h20hBean> skycon_08h_20h;

    public static class ColdRiskBean {
        /**
         * index : 3
         * desc : 易发
         * datetime : 2018-10-10
         */

        public String index;
        public String desc;
        public String datetime;
    }

    public static class Skycon20h32hBean {
        /**
         * date : 2018-10-10
         * value : RAIN
         */

        public String date;
        public String value;

    }

    public static class TemperatureBeanX {
        /**
         * date : 2018-10-10
         * max : 25
         * avg : 23.27
         * min : 22
         */

        public String date;
        public int max;
        public double avg;
        public int min;
    }

    public static class SkyconBeanX {
        /**
         * date : 2018-10-10
         * value : RAIN
         */

        public String date;
        public String value;

    }

    public static class CloudrateBeanX {
        /**
         * date : 2018-10-10
         * max : 0.99
         * avg : 0.89
         * min : 0.78
         */

        public String date;
        public double max;
        public double avg;
        public double min;
    }

    public static class AqiBeanX {
        /**
         * date : 2018-10-10
         * max : 20
         * avg : 16.82
         * min : 14
         */

        public String date;
        public int max;
        public double avg;
        public int min;
    }

    public static class ComfortBean {
        /**
         * index : 3
         * desc : 热
         * datetime : 2018-10-10
         */

        public String index;
        public String desc;
        public String datetime;
    }

    public static class HumidityBeanX {
        /**
         * date : 2018-10-10
         * max : 0.88
         * avg : 0.85
         * min : 0.79
         */

        public String date;
        public double max;
        public double avg;
        public double min;

    }

    public static class AstroBean {
        /**
         * date : 2018-10-10
         * sunset : {"time":"17:31"}
         * sunrise : {"time":"05:49"}
         */

        public String date;
        public SunsetBean sunset;
        public SunriseBean sunrise;


        public static class SunsetBean {
            /**
             * time : 17:31
             */

            public String time;
        }

        public static class SunriseBean {
            /**
             * time : 05:49
             */

            public String time;
        }
    }

    public static class PresBeanX {
        /**
         * date : 2018-10-10
         * max : 100204.1
         * avg : 100076.49
         * min : 99887.44
         */

        public String date;
        public double max;
        public double avg;
        public double min;

    }

    public static class UltravioletBean {
        /**
         * index : 1
         * desc : 最弱
         * datetime : 2018-10-10
         */

        public String index;
        public String desc;
        public String datetime;
    }

    public static class Pm25BeanX {
        /**
         * date : 2018-10-10
         * max : 13
         * avg : 11.18
         * min : 7
         */

        public String date;
        public int max;
        public double avg;
        public int min;
    }

    public static class DressingBean {
        /**
         * index : 4
         * desc : 温暖
         * datetime : 2018-10-10
         */

        public String index;
        public String desc;
        public String datetime;

    }

    public static class CarWashingBean {
        /**
         * index : 3
         * desc : 较不适宜
         * datetime : 2018-10-10
         */

        public String index;
        public String desc;
        public String datetime;
    }

    public static class PrecipitationBeanX {
        /**
         * date : 2018-10-10
         * max : 0.8485
         * avg : 0.4638
         * min : 0
         */

        public String date;
        public double max;
        public double avg;
        public int min;
    }

    public static class WindBeanX {
        /**
         * date : 2018-10-10
         * max : {"direction":56.57,"speed":23.33}
         * avg : {"direction":55.62,"speed":19.96}
         * min : {"direction":66.03,"speed":14.97}
         */

        public String date;
        public MaxBean max;
        public AvgBean avg;
        public MinBean min;

        public static class MaxBean {
            /**
             * direction : 56.57
             * speed : 23.33
             */

            public double direction;
            public double speed;

        }

        public static class AvgBean {
            /**
             * direction : 55.62
             * speed : 19.96
             */

            public double direction;
            public double speed;

        }

        public static class MinBean {
            /**
             * direction : 66.03
             * speed : 14.97
             */

            public double direction;
            public double speed;

        }
    }

    public static class Skycon08h20hBean {
        /**
         * date : 2018-10-10
         * value : RAIN
         */

        public String date;
        public String value;
    }
}