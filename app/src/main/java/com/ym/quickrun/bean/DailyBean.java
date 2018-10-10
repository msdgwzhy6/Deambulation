package com.ym.quickrun.bean;

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

    private String status;
    private List<ColdRiskBean> coldRisk; //寒冷天气
    private List<Skycon20h32hBean> skycon_20h_32h;
    private List<TemperatureBeanX> temperature; //温度
    private List<SkyconBeanX> skycon; //天气状况
    private List<CloudrateBeanX> cloudrate; // 雾气情况
    private List<AqiBeanX> aqi; //空气质量指数
    private List<ComfortBean> comfort; //舒适度
    private List<HumidityBeanX> humidity; //湿度
    private List<AstroBean> astro; //夜晚时间
    private List<PresBeanX> pres; //大气压强
    private List<UltravioletBean> ultraviolet; //紫外线
    private List<Pm25BeanX> pm25; // PM2.5指数
    private List<DressingBean> dressing; //空气凉爽
    private List<CarWashingBean> carWashing; //洗车
    private List<PrecipitationBeanX> precipitation;  //降水量  单位 mm/h，0.05 ~ 0.9 小雨 0.9 ~ 2.87 中雨 >2.87大雨；
    private List<WindBeanX> wind; //风量
    private List<Skycon08h20hBean> skycon_08h_20h;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ColdRiskBean> getColdRisk() {
        return coldRisk;
    }

    public void setColdRisk(List<ColdRiskBean> coldRisk) {
        this.coldRisk = coldRisk;
    }

    public List<Skycon20h32hBean> getSkycon_20h_32h() {
        return skycon_20h_32h;
    }

    public void setSkycon_20h_32h(List<Skycon20h32hBean> skycon_20h_32h) {
        this.skycon_20h_32h = skycon_20h_32h;
    }

    public List<TemperatureBeanX> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<TemperatureBeanX> temperature) {
        this.temperature = temperature;
    }

    public List<SkyconBeanX> getSkycon() {
        return skycon;
    }

    public void setSkycon(List<SkyconBeanX> skycon) {
        this.skycon = skycon;
    }

    public List<CloudrateBeanX> getCloudrate() {
        return cloudrate;
    }

    public void setCloudrate(List<CloudrateBeanX> cloudrate) {
        this.cloudrate = cloudrate;
    }

    public List<AqiBeanX> getAqi() {
        return aqi;
    }

    public void setAqi(List<AqiBeanX> aqi) {
        this.aqi = aqi;
    }

    public List<ComfortBean> getComfort() {
        return comfort;
    }

    public void setComfort(List<ComfortBean> comfort) {
        this.comfort = comfort;
    }

    public List<HumidityBeanX> getHumidity() {
        return humidity;
    }

    public void setHumidity(List<HumidityBeanX> humidity) {
        this.humidity = humidity;
    }

    public List<AstroBean> getAstro() {
        return astro;
    }

    public void setAstro(List<AstroBean> astro) {
        this.astro = astro;
    }

    public List<PresBeanX> getPres() {
        return pres;
    }

    public void setPres(List<PresBeanX> pres) {
        this.pres = pres;
    }

    public List<UltravioletBean> getUltraviolet() {
        return ultraviolet;
    }

    public void setUltraviolet(List<UltravioletBean> ultraviolet) {
        this.ultraviolet = ultraviolet;
    }

    public List<Pm25BeanX> getPm25() {
        return pm25;
    }

    public void setPm25(List<Pm25BeanX> pm25) {
        this.pm25 = pm25;
    }

    public List<DressingBean> getDressing() {
        return dressing;
    }

    public void setDressing(List<DressingBean> dressing) {
        this.dressing = dressing;
    }

    public List<CarWashingBean> getCarWashing() {
        return carWashing;
    }

    public void setCarWashing(List<CarWashingBean> carWashing) {
        this.carWashing = carWashing;
    }

    public List<PrecipitationBeanX> getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(List<PrecipitationBeanX> precipitation) {
        this.precipitation = precipitation;
    }

    public List<WindBeanX> getWind() {
        return wind;
    }

    public void setWind(List<WindBeanX> wind) {
        this.wind = wind;
    }

    public List<Skycon08h20hBean> getSkycon_08h_20h() {
        return skycon_08h_20h;
    }

    public void setSkycon_08h_20h(List<Skycon08h20hBean> skycon_08h_20h) {
        this.skycon_08h_20h = skycon_08h_20h;
    }

    public static class ColdRiskBean {
        /**
         * index : 3
         * desc : 易发
         * datetime : 2018-10-10
         */

        private String index;
        private String desc;
        private String datetime;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class Skycon20h32hBean {
        /**
         * date : 2018-10-10
         * value : RAIN
         */

        private String date;
        private String value;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class TemperatureBeanX {
        /**
         * date : 2018-10-10
         * max : 25
         * avg : 23.27
         * min : 22
         */

        private String date;
        private int max;
        private double avg;
        private int min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class SkyconBeanX {
        /**
         * date : 2018-10-10
         * value : RAIN
         */

        private String date;
        private String value;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class CloudrateBeanX {
        /**
         * date : 2018-10-10
         * max : 0.99
         * avg : 0.89
         * min : 0.78
         */

        private String date;
        private double max;
        private double avg;
        private double min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public double getMin() {
            return min;
        }

        public void setMin(double min) {
            this.min = min;
        }
    }

    public static class AqiBeanX {
        /**
         * date : 2018-10-10
         * max : 20
         * avg : 16.82
         * min : 14
         */

        private String date;
        private int max;
        private double avg;
        private int min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ComfortBean {
        /**
         * index : 3
         * desc : 热
         * datetime : 2018-10-10
         */

        private String index;
        private String desc;
        private String datetime;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class HumidityBeanX {
        /**
         * date : 2018-10-10
         * max : 0.88
         * avg : 0.85
         * min : 0.79
         */

        private String date;
        private double max;
        private double avg;
        private double min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public double getMin() {
            return min;
        }

        public void setMin(double min) {
            this.min = min;
        }
    }

    public static class AstroBean {
        /**
         * date : 2018-10-10
         * sunset : {"time":"17:31"}
         * sunrise : {"time":"05:49"}
         */

        private String date;
        private SunsetBean sunset;
        private SunriseBean sunrise;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public SunsetBean getSunset() {
            return sunset;
        }

        public void setSunset(SunsetBean sunset) {
            this.sunset = sunset;
        }

        public SunriseBean getSunrise() {
            return sunrise;
        }

        public void setSunrise(SunriseBean sunrise) {
            this.sunrise = sunrise;
        }

        public static class SunsetBean {
            /**
             * time : 17:31
             */

            private String time;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class SunriseBean {
            /**
             * time : 05:49
             */

            private String time;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }

    public static class PresBeanX {
        /**
         * date : 2018-10-10
         * max : 100204.1
         * avg : 100076.49
         * min : 99887.44
         */

        private String date;
        private double max;
        private double avg;
        private double min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public double getMin() {
            return min;
        }

        public void setMin(double min) {
            this.min = min;
        }
    }

    public static class UltravioletBean {
        /**
         * index : 1
         * desc : 最弱
         * datetime : 2018-10-10
         */

        private String index;
        private String desc;
        private String datetime;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class Pm25BeanX {
        /**
         * date : 2018-10-10
         * max : 13
         * avg : 11.18
         * min : 7
         */

        private String date;
        private int max;
        private double avg;
        private int min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class DressingBean {
        /**
         * index : 4
         * desc : 温暖
         * datetime : 2018-10-10
         */

        private String index;
        private String desc;
        private String datetime;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class CarWashingBean {
        /**
         * index : 3
         * desc : 较不适宜
         * datetime : 2018-10-10
         */

        private String index;
        private String desc;
        private String datetime;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class PrecipitationBeanX {
        /**
         * date : 2018-10-10
         * max : 0.8485
         * avg : 0.4638
         * min : 0
         */

        private String date;
        private double max;
        private double avg;
        private int min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class WindBeanX {
        /**
         * date : 2018-10-10
         * max : {"direction":56.57,"speed":23.33}
         * avg : {"direction":55.62,"speed":19.96}
         * min : {"direction":66.03,"speed":14.97}
         */

        private String date;
        private MaxBean max;
        private AvgBean avg;
        private MinBean min;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public MaxBean getMax() {
            return max;
        }

        public void setMax(MaxBean max) {
            this.max = max;
        }

        public AvgBean getAvg() {
            return avg;
        }

        public void setAvg(AvgBean avg) {
            this.avg = avg;
        }

        public MinBean getMin() {
            return min;
        }

        public void setMin(MinBean min) {
            this.min = min;
        }

        public static class MaxBean {
            /**
             * direction : 56.57
             * speed : 23.33
             */

            private double direction;
            private double speed;

            public double getDirection() {
                return direction;
            }

            public void setDirection(double direction) {
                this.direction = direction;
            }

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }
        }

        public static class AvgBean {
            /**
             * direction : 55.62
             * speed : 19.96
             */

            private double direction;
            private double speed;

            public double getDirection() {
                return direction;
            }

            public void setDirection(double direction) {
                this.direction = direction;
            }

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }
        }

        public static class MinBean {
            /**
             * direction : 66.03
             * speed : 14.97
             */

            private double direction;
            private double speed;

            public double getDirection() {
                return direction;
            }

            public void setDirection(double direction) {
                this.direction = direction;
            }

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }
        }
    }

    public static class Skycon08h20hBean {
        /**
         * date : 2018-10-10
         * value : RAIN
         */

        private String date;
        private String value;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}