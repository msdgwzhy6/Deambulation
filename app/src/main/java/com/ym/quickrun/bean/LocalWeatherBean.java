package com.ym.quickrun.bean;

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

    private String status;
    private String lang;
    private int server_time;
    private int tzshift;
    private String unit;
    private ResultBean result;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

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

        private String status;
        private int o3;
        private double co;
        private double temperature;
        private int pm10;
        private String skycon;
        private int cloudrate;
        private int aqi;
        private ComfortBean comfort;
        private int no2;
        private double visibility;
        private double humidity;
        private double pres;
        private UltravioletBean ultraviolet;
        private int pm25;
        private int so2;
        private PrecipitationBean precipitation;
        private WindBean wind;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getO3() {
            return o3;
        }

        public void setO3(int o3) {
            this.o3 = o3;
        }

        public double getCo() {
            return co;
        }

        public void setCo(double co) {
            this.co = co;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public int getPm10() {
            return pm10;
        }

        public void setPm10(int pm10) {
            this.pm10 = pm10;
        }

        public String getSkycon() {
            return skycon;
        }

        public void setSkycon(String skycon) {
            this.skycon = skycon;
        }

        public int getCloudrate() {
            return cloudrate;
        }

        public void setCloudrate(int cloudrate) {
            this.cloudrate = cloudrate;
        }

        public int getAqi() {
            return aqi;
        }

        public void setAqi(int aqi) {
            this.aqi = aqi;
        }

        public ComfortBean getComfort() {
            return comfort;
        }

        public void setComfort(ComfortBean comfort) {
            this.comfort = comfort;
        }

        public int getNo2() {
            return no2;
        }

        public void setNo2(int no2) {
            this.no2 = no2;
        }

        public double getVisibility() {
            return visibility;
        }

        public void setVisibility(double visibility) {
            this.visibility = visibility;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getPres() {
            return pres;
        }

        public void setPres(double pres) {
            this.pres = pres;
        }

        public UltravioletBean getUltraviolet() {
            return ultraviolet;
        }

        public void setUltraviolet(UltravioletBean ultraviolet) {
            this.ultraviolet = ultraviolet;
        }

        public int getPm25() {
            return pm25;
        }

        public void setPm25(int pm25) {
            this.pm25 = pm25;
        }

        public int getSo2() {
            return so2;
        }

        public void setSo2(int so2) {
            this.so2 = so2;
        }

        public PrecipitationBean getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(PrecipitationBean precipitation) {
            this.precipitation = precipitation;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public static class ComfortBean {
            /**
             * index : 7
             * desc : 冷
             */

            private int index;
            private String desc;

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }
        }

        public static class UltravioletBean {
            /**
             * index : 7
             * desc : 强
             */

            private int index;
            private String desc;

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }
        }

        public static class PrecipitationBean {
            /**
             * nearest : {"status":"ok","distance":46.03,"intensity":0.1875}
             * local : {"status":"ok","intensity":0,"datasource":"radar"}
             */

            private NearestBean nearest;
            private LocalBean local;

            public NearestBean getNearest() {
                return nearest;
            }

            public void setNearest(NearestBean nearest) {
                this.nearest = nearest;
            }

            public LocalBean getLocal() {
                return local;
            }

            public void setLocal(LocalBean local) {
                this.local = local;
            }

            public static class NearestBean {
                /**
                 * status : ok
                 * distance : 46.03
                 * intensity : 0.1875
                 */

                private String status;
                private double distance;
                private double intensity;

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public double getDistance() {
                    return distance;
                }

                public void setDistance(double distance) {
                    this.distance = distance;
                }

                public double getIntensity() {
                    return intensity;
                }

                public void setIntensity(double intensity) {
                    this.intensity = intensity;
                }
            }

            public static class LocalBean {
                /**
                 * status : ok
                 * intensity : 0
                 * datasource : radar
                 */

                private String status;
                private int intensity;
                private String datasource;

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getIntensity() {
                    return intensity;
                }

                public void setIntensity(int intensity) {
                    this.intensity = intensity;
                }

                public String getDatasource() {
                    return datasource;
                }

                public void setDatasource(String datasource) {
                    this.datasource = datasource;
                }
            }
        }

        public static class WindBean {
            /**
             * direction : 328.35
             * speed : 6.5
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
}
