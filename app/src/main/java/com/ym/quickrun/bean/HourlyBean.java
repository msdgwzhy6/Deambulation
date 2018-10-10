package com.ym.quickrun.bean;

import java.util.List;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/10
 * desc: 未来48小时的天气状况
 */
public class HourlyBean {
    /**
     * status : ok
     * description : 小雨，明天上午11点钟后转大雨
     * skycon : [{"value":"RAIN","datetime":"2018-10-10 13:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2018-10-10 14:00"},{"value":"CLOUDY","datetime":"2018-10-10 15:00"},{"value":"RAIN","datetime":"2018-10-10 16:00"},{"value":"RAIN","datetime":"2018-10-10 17:00"},{"value":"RAIN","datetime":"2018-10-10 18:00"},{"value":"RAIN","datetime":"2018-10-10 19:00"},{"value":"RAIN","datetime":"2018-10-10 20:00"},{"value":"RAIN","datetime":"2018-10-10 21:00"},{"value":"RAIN","datetime":"2018-10-10 22:00"},{"value":"RAIN","datetime":"2018-10-10 23:00"},{"value":"RAIN","datetime":"2018-10-11 00:00"},{"value":"RAIN","datetime":"2018-10-11 01:00"},{"value":"RAIN","datetime":"2018-10-11 02:00"},{"value":"RAIN","datetime":"2018-10-11 03:00"},{"value":"RAIN","datetime":"2018-10-11 04:00"},{"value":"RAIN","datetime":"2018-10-11 05:00"},{"value":"RAIN","datetime":"2018-10-11 06:00"},{"value":"RAIN","datetime":"2018-10-11 07:00"},{"value":"RAIN","datetime":"2018-10-11 08:00"},{"value":"RAIN","datetime":"2018-10-11 09:00"},{"value":"RAIN","datetime":"2018-10-11 10:00"},{"value":"RAIN","datetime":"2018-10-11 11:00"},{"value":"RAIN","datetime":"2018-10-11 12:00"},{"value":"RAIN","datetime":"2018-10-11 13:00"},{"value":"RAIN","datetime":"2018-10-11 14:00"},{"value":"RAIN","datetime":"2018-10-11 15:00"},{"value":"RAIN","datetime":"2018-10-11 16:00"},{"value":"RAIN","datetime":"2018-10-11 17:00"},{"value":"RAIN","datetime":"2018-10-11 18:00"},{"value":"RAIN","datetime":"2018-10-11 19:00"},{"value":"RAIN","datetime":"2018-10-11 20:00"},{"value":"RAIN","datetime":"2018-10-11 21:00"},{"value":"RAIN","datetime":"2018-10-11 22:00"},{"value":"RAIN","datetime":"2018-10-11 23:00"},{"value":"RAIN","datetime":"2018-10-12 00:00"},{"value":"RAIN","datetime":"2018-10-12 01:00"},{"value":"RAIN","datetime":"2018-10-12 02:00"},{"value":"RAIN","datetime":"2018-10-12 03:00"},{"value":"RAIN","datetime":"2018-10-12 04:00"},{"value":"RAIN","datetime":"2018-10-12 05:00"},{"value":"RAIN","datetime":"2018-10-12 06:00"},{"value":"RAIN","datetime":"2018-10-12 07:00"},{"value":"RAIN","datetime":"2018-10-12 08:00"},{"value":"RAIN","datetime":"2018-10-12 09:00"},{"value":"RAIN","datetime":"2018-10-12 10:00"},{"value":"RAIN","datetime":"2018-10-12 11:00"},{"value":"RAIN","datetime":"2018-10-12 12:00"}]
     * cloudrate : [{"value":0.78,"datetime":"2018-10-10 13:00"},{"value":0.79,"datetime":"2018-10-10 14:00"},{"value":0.84,"datetime":"2018-10-10 15:00"},{"value":0.89,"datetime":"2018-10-10 16:00"},{"value":0.93,"datetime":"2018-10-10 17:00"},{"value":0.92,"datetime":"2018-10-10 18:00"},{"value":0.9,"datetime":"2018-10-10 19:00"},{"value":0.89,"datetime":"2018-10-10 20:00"},{"value":0.91,"datetime":"2018-10-10 21:00"},{"value":0.95,"datetime":"2018-10-10 22:00"},{"value":0.99,"datetime":"2018-10-10 23:00"},{"value":1,"datetime":"2018-10-11 00:00"},{"value":1,"datetime":"2018-10-11 01:00"},{"value":0.99,"datetime":"2018-10-11 02:00"},{"value":0.99,"datetime":"2018-10-11 03:00"},{"value":0.99,"datetime":"2018-10-11 04:00"},{"value":1,"datetime":"2018-10-11 05:00"},{"value":1,"datetime":"2018-10-11 06:00"},{"value":1,"datetime":"2018-10-11 07:00"},{"value":1,"datetime":"2018-10-11 08:00"},{"value":1,"datetime":"2018-10-11 09:00"},{"value":1,"datetime":"2018-10-11 10:00"},{"value":1,"datetime":"2018-10-11 11:00"},{"value":1,"datetime":"2018-10-11 12:00"},{"value":1,"datetime":"2018-10-11 13:00"},{"value":1,"datetime":"2018-10-11 14:00"},{"value":1,"datetime":"2018-10-11 15:00"},{"value":1,"datetime":"2018-10-11 16:00"},{"value":1,"datetime":"2018-10-11 17:00"},{"value":1,"datetime":"2018-10-11 18:00"},{"value":1,"datetime":"2018-10-11 19:00"},{"value":1,"datetime":"2018-10-11 20:00"},{"value":1,"datetime":"2018-10-11 21:00"},{"value":1,"datetime":"2018-10-11 22:00"},{"value":1,"datetime":"2018-10-11 23:00"},{"value":1,"datetime":"2018-10-12 00:00"},{"value":1,"datetime":"2018-10-12 01:00"},{"value":0.99,"datetime":"2018-10-12 02:00"},{"value":0.99,"datetime":"2018-10-12 03:00"},{"value":0.99,"datetime":"2018-10-12 04:00"},{"value":0.98,"datetime":"2018-10-12 05:00"},{"value":0.98,"datetime":"2018-10-12 06:00"},{"value":0.98,"datetime":"2018-10-12 07:00"},{"value":0.97,"datetime":"2018-10-12 08:00"},{"value":0.94,"datetime":"2018-10-12 09:00"},{"value":0.92,"datetime":"2018-10-12 10:00"},{"value":0.9,"datetime":"2018-10-12 11:00"},{"value":0.9,"datetime":"2018-10-12 12:00"}]
     * aqi : [{"value":20,"datetime":"2018-10-10 13:00"},{"value":19,"datetime":"2018-10-10 14:00"},{"value":17,"datetime":"2018-10-10 15:00"},{"value":16,"datetime":"2018-10-10 16:00"},{"value":15,"datetime":"2018-10-10 17:00"},{"value":15,"datetime":"2018-10-10 18:00"},{"value":15,"datetime":"2018-10-10 19:00"},{"value":15,"datetime":"2018-10-10 20:00"},{"value":17,"datetime":"2018-10-10 21:00"},{"value":18,"datetime":"2018-10-10 22:00"},{"value":18,"datetime":"2018-10-10 23:00"},{"value":19,"datetime":"2018-10-11 00:00"},{"value":18,"datetime":"2018-10-11 01:00"},{"value":17,"datetime":"2018-10-11 02:00"},{"value":16,"datetime":"2018-10-11 03:00"},{"value":15,"datetime":"2018-10-11 04:00"},{"value":14,"datetime":"2018-10-11 05:00"},{"value":15,"datetime":"2018-10-11 06:00"},{"value":15,"datetime":"2018-10-11 07:00"},{"value":15,"datetime":"2018-10-11 08:00"},{"value":15,"datetime":"2018-10-11 09:00"},{"value":14,"datetime":"2018-10-11 10:00"},{"value":13,"datetime":"2018-10-11 11:00"},{"value":11,"datetime":"2018-10-11 12:00"},{"value":10,"datetime":"2018-10-11 13:00"},{"value":10,"datetime":"2018-10-11 14:00"},{"value":10,"datetime":"2018-10-11 15:00"},{"value":10,"datetime":"2018-10-11 16:00"},{"value":11,"datetime":"2018-10-11 17:00"},{"value":12,"datetime":"2018-10-11 18:00"},{"value":12,"datetime":"2018-10-11 19:00"},{"value":13,"datetime":"2018-10-11 20:00"},{"value":15,"datetime":"2018-10-11 21:00"},{"value":16,"datetime":"2018-10-11 22:00"},{"value":16,"datetime":"2018-10-11 23:00"},{"value":17,"datetime":"2018-10-12 00:00"},{"value":16,"datetime":"2018-10-12 01:00"},{"value":15,"datetime":"2018-10-12 02:00"},{"value":14,"datetime":"2018-10-12 03:00"},{"value":13,"datetime":"2018-10-12 04:00"},{"value":13,"datetime":"2018-10-12 05:00"},{"value":14,"datetime":"2018-10-12 06:00"},{"value":14,"datetime":"2018-10-12 07:00"},{"value":14,"datetime":"2018-10-12 08:00"},{"value":14,"datetime":"2018-10-12 09:00"},{"value":13,"datetime":"2018-10-12 10:00"},{"value":12,"datetime":"2018-10-12 11:00"},{"value":12,"datetime":"2018-10-12 12:00"}]
     * humidity : [{"value":0.8,"datetime":"2018-10-10 13:00"},{"value":0.82,"datetime":"2018-10-10 14:00"},{"value":0.83,"datetime":"2018-10-10 15:00"},{"value":0.85,"datetime":"2018-10-10 16:00"},{"value":0.86,"datetime":"2018-10-10 17:00"},{"value":0.86,"datetime":"2018-10-10 18:00"},{"value":0.86,"datetime":"2018-10-10 19:00"},{"value":0.87,"datetime":"2018-10-10 20:00"},{"value":0.87,"datetime":"2018-10-10 21:00"},{"value":0.87,"datetime":"2018-10-10 22:00"},{"value":0.87,"datetime":"2018-10-10 23:00"},{"value":0.87,"datetime":"2018-10-11 00:00"},{"value":0.87,"datetime":"2018-10-11 01:00"},{"value":0.87,"datetime":"2018-10-11 02:00"},{"value":0.88,"datetime":"2018-10-11 03:00"},{"value":0.89,"datetime":"2018-10-11 04:00"},{"value":0.9,"datetime":"2018-10-11 05:00"},{"value":0.9,"datetime":"2018-10-11 06:00"},{"value":0.89,"datetime":"2018-10-11 07:00"},{"value":0.89,"datetime":"2018-10-11 08:00"},{"value":0.89,"datetime":"2018-10-11 09:00"},{"value":0.89,"datetime":"2018-10-11 10:00"},{"value":0.89,"datetime":"2018-10-11 11:00"},{"value":0.89,"datetime":"2018-10-11 12:00"},{"value":0.89,"datetime":"2018-10-11 13:00"},{"value":0.88,"datetime":"2018-10-11 14:00"},{"value":0.87,"datetime":"2018-10-11 15:00"},{"value":0.86,"datetime":"2018-10-11 16:00"},{"value":0.86,"datetime":"2018-10-11 17:00"},{"value":0.85,"datetime":"2018-10-11 18:00"},{"value":0.84,"datetime":"2018-10-11 19:00"},{"value":0.84,"datetime":"2018-10-11 20:00"},{"value":0.83,"datetime":"2018-10-11 21:00"},{"value":0.83,"datetime":"2018-10-11 22:00"},{"value":0.82,"datetime":"2018-10-11 23:00"},{"value":0.82,"datetime":"2018-10-12 00:00"},{"value":0.81,"datetime":"2018-10-12 01:00"},{"value":0.81,"datetime":"2018-10-12 02:00"},{"value":0.8,"datetime":"2018-10-12 03:00"},{"value":0.8,"datetime":"2018-10-12 04:00"},{"value":0.8,"datetime":"2018-10-12 05:00"},{"value":0.79,"datetime":"2018-10-12 06:00"},{"value":0.79,"datetime":"2018-10-12 07:00"},{"value":0.79,"datetime":"2018-10-12 08:00"},{"value":0.79,"datetime":"2018-10-12 09:00"},{"value":0.79,"datetime":"2018-10-12 10:00"},{"value":0.8,"datetime":"2018-10-12 11:00"},{"value":0.8,"datetime":"2018-10-12 12:00"}]
     * pres : [{"value":99995.9856906134,"datetime":"2018-10-10 13:00"},{"value":99970.2641723201,"datetime":"2018-10-10 14:00"},{"value":99966.0244324808,"datetime":"2018-10-10 15:00"},{"value":99982.3111440301,"datetime":"2018-10-10 16:00"},{"value":100014.9439867401,"datetime":"2018-10-10 17:00"},{"value":100059.1153227342,"datetime":"2018-10-10 18:00"},{"value":100107.5082435408,"datetime":"2018-10-10 19:00"},{"value":100152.1785230401,"datetime":"2018-10-10 20:00"},{"value":100185.8724573351,"datetime":"2018-10-10 21:00"},{"value":100204.0984314219,"datetime":"2018-10-10 22:00"},{"value":100203.0553525201,"datetime":"2018-10-10 23:00"},{"value":100182.1248145654,"datetime":"2018-10-11 00:00"},{"value":100153.4191583594,"datetime":"2018-10-11 01:00"},{"value":100132.2334114201,"datetime":"2018-10-11 02:00"},{"value":100130.8412521832,"datetime":"2018-10-11 03:00"},{"value":100149.4309627552,"datetime":"2018-10-11 04:00"},{"value":100185.1694761601,"datetime":"2018-10-11 05:00"},{"value":100235.0875866305,"datetime":"2018-10-11 06:00"},{"value":100295.6715332324,"datetime":"2018-10-11 07:00"},{"value":100363.2714162401,"datetime":"2018-10-11 08:00"},{"value":100431.7450696051,"datetime":"2018-10-11 09:00"},{"value":100484.9812619865,"datetime":"2018-10-11 10:00"},{"value":100504.3764957201,"datetime":"2018-10-11 11:00"},{"value":100479.03848328,"datetime":"2018-10-11 12:00"},{"value":100428.919777692,"datetime":"2018-10-11 13:00"},{"value":100381.6841421201,"datetime":"2018-10-11 14:00"},{"value":100360.2453448334,"datetime":"2018-10-11 15:00"},{"value":100368.5171745216,"datetime":"2018-10-11 16:00"},{"value":100405.6634249801,"datetime":"2018-10-11 17:00"},{"value":100467.9018991146,"datetime":"2018-10-11 18:00"},{"value":100539.6664362745,"datetime":"2018-10-11 19:00"},{"value":100602.4448849201,"datetime":"2018-10-11 20:00"},{"value":100641.1806880651,"datetime":"2018-10-11 21:00"},{"value":100654.6396669377,"datetime":"2018-10-11 22:00"},{"value":100645.04323732,"datetime":"2018-10-11 23:00"},{"value":100615.9940678398,"datetime":"2018-10-12 00:00"},{"value":100576.6198385076,"datetime":"2018-10-12 01:00"},{"value":100537.4294821801,"datetime":"2018-10-12 02:00"},{"value":100507.9606027304,"datetime":"2018-10-12 03:00"},{"value":100493.8654880983,"datetime":"2018-10-12 04:00"},{"value":100499.8250972401,"datetime":"2018-10-12 05:00"},{"value":100527.7897043629,"datetime":"2018-10-12 06:00"},{"value":100568.7868446762,"datetime":"2018-10-12 07:00"},{"value":100611.1133686401,"datetime":"2018-10-12 08:00"},{"value":100643.1853923296,"datetime":"2018-10-12 09:00"},{"value":100653.8960942797,"datetime":"2018-10-12 10:00"},{"value":100632.25791864,"datetime":"2018-10-12 11:00"},{"value":100573.6509669769,"datetime":"2018-10-12 12:00"}]
     * pm25 : [{"value":12,"datetime":"2018-10-10 13:00"},{"value":11,"datetime":"2018-10-10 14:00"},{"value":11,"datetime":"2018-10-10 15:00"},{"value":10,"datetime":"2018-10-10 16:00"},{"value":10,"datetime":"2018-10-10 17:00"},{"value":11,"datetime":"2018-10-10 18:00"},{"value":11,"datetime":"2018-10-10 19:00"},{"value":11,"datetime":"2018-10-10 20:00"},{"value":11,"datetime":"2018-10-10 21:00"},{"value":12,"datetime":"2018-10-10 22:00"},{"value":13,"datetime":"2018-10-10 23:00"},{"value":14,"datetime":"2018-10-11 00:00"},{"value":13,"datetime":"2018-10-11 01:00"},{"value":12,"datetime":"2018-10-11 02:00"},{"value":12,"datetime":"2018-10-11 03:00"},{"value":11,"datetime":"2018-10-11 04:00"},{"value":11,"datetime":"2018-10-11 05:00"},{"value":11,"datetime":"2018-10-11 06:00"},{"value":11,"datetime":"2018-10-11 07:00"},{"value":11,"datetime":"2018-10-11 08:00"},{"value":11,"datetime":"2018-10-11 09:00"},{"value":10,"datetime":"2018-10-11 10:00"},{"value":9,"datetime":"2018-10-11 11:00"},{"value":9,"datetime":"2018-10-11 12:00"},{"value":8,"datetime":"2018-10-11 13:00"},{"value":7,"datetime":"2018-10-11 14:00"},{"value":6,"datetime":"2018-10-11 15:00"},{"value":6,"datetime":"2018-10-11 16:00"},{"value":7,"datetime":"2018-10-11 17:00"},{"value":8,"datetime":"2018-10-11 18:00"},{"value":8,"datetime":"2018-10-11 19:00"},{"value":10,"datetime":"2018-10-11 20:00"},{"value":10,"datetime":"2018-10-11 21:00"},{"value":11,"datetime":"2018-10-11 22:00"},{"value":12,"datetime":"2018-10-11 23:00"},{"value":12,"datetime":"2018-10-12 00:00"},{"value":11,"datetime":"2018-10-12 01:00"},{"value":10,"datetime":"2018-10-12 02:00"},{"value":10,"datetime":"2018-10-12 03:00"},{"value":9,"datetime":"2018-10-12 04:00"},{"value":9,"datetime":"2018-10-12 05:00"},{"value":10,"datetime":"2018-10-12 06:00"},{"value":10,"datetime":"2018-10-12 07:00"},{"value":10,"datetime":"2018-10-12 08:00"},{"value":10,"datetime":"2018-10-12 09:00"},{"value":9,"datetime":"2018-10-12 10:00"},{"value":9,"datetime":"2018-10-12 11:00"},{"value":9,"datetime":"2018-10-12 12:00"}]
     * precipitation : [{"value":0.0869,"datetime":"2018-10-10 13:00"},{"value":0.0429,"datetime":"2018-10-10 14:00"},{"value":0,"datetime":"2018-10-10 15:00"},{"value":0.0884,"datetime":"2018-10-10 16:00"},{"value":0.5571,"datetime":"2018-10-10 17:00"},{"value":0.596,"datetime":"2018-10-10 18:00"},{"value":0.6225,"datetime":"2018-10-10 19:00"},{"value":0.6696,"datetime":"2018-10-10 20:00"},{"value":0.755,"datetime":"2018-10-10 21:00"},{"value":0.8346,"datetime":"2018-10-10 22:00"},{"value":0.8485,"datetime":"2018-10-10 23:00"},{"value":0.7647,"datetime":"2018-10-11 00:00"},{"value":0.6615,"datetime":"2018-10-11 01:00"},{"value":0.6447,"datetime":"2018-10-11 02:00"},{"value":0.7816,"datetime":"2018-10-11 03:00"},{"value":0.9853,"datetime":"2018-10-11 04:00"},{"value":1.1302,"datetime":"2018-10-11 05:00"},{"value":1.1521,"datetime":"2018-10-11 06:00"},{"value":1.2326,"datetime":"2018-10-11 07:00"},{"value":1.6143,"datetime":"2018-10-11 08:00"},{"value":2.4335,"datetime":"2018-10-11 09:00"},{"value":3.4006,"datetime":"2018-10-11 10:00"},{"value":4.1195,"datetime":"2018-10-11 11:00"},{"value":4.2824,"datetime":"2018-10-11 12:00"},{"value":3.934,"datetime":"2018-10-11 13:00"},{"value":3.2075,"datetime":"2018-10-11 14:00"},{"value":2.257,"datetime":"2018-10-11 15:00"},{"value":1.3209,"datetime":"2018-10-11 16:00"},{"value":0.6584,"datetime":"2018-10-11 17:00"},{"value":0.447,"datetime":"2018-10-11 18:00"},{"value":0.5368,"datetime":"2018-10-11 19:00"},{"value":0.6961,"datetime":"2018-10-11 20:00"},{"value":0.7431,"datetime":"2018-10-11 21:00"},{"value":0.6955,"datetime":"2018-10-11 22:00"},{"value":0.621,"datetime":"2018-10-11 23:00"},{"value":0.5718,"datetime":"2018-10-12 00:00"},{"value":0.5395,"datetime":"2018-10-12 01:00"},{"value":0.5004,"datetime":"2018-10-12 02:00"},{"value":0.4378,"datetime":"2018-10-12 03:00"},{"value":0.3644,"datetime":"2018-10-12 04:00"},{"value":0.2995,"datetime":"2018-10-12 05:00"},{"value":0.2579,"datetime":"2018-10-12 06:00"},{"value":0.2342,"datetime":"2018-10-12 07:00"},{"value":0.2184,"datetime":"2018-10-12 08:00"},{"value":0.2031,"datetime":"2018-10-12 09:00"},{"value":0.1936,"datetime":"2018-10-12 10:00"},{"value":0.1981,"datetime":"2018-10-12 11:00"},{"value":0.2211,"datetime":"2018-10-12 12:00"}]
     * wind : [{"direction":56.57,"speed":23.33,"datetime":"2018-10-10 13:00"},{"direction":56.08,"speed":23.29,"datetime":"2018-10-10 14:00"},{"direction":53.74,"speed":23.15,"datetime":"2018-10-10 15:00"},{"direction":50.86,"speed":23,"datetime":"2018-10-10 16:00"},{"direction":49.32,"speed":22.83,"datetime":"2018-10-10 17:00"},{"direction":50.39,"speed":22.57,"datetime":"2018-10-10 18:00"},{"direction":52.7,"speed":22.23,"datetime":"2018-10-10 19:00"},{"direction":54.13,"speed":21.77,"datetime":"2018-10-10 20:00"},{"direction":53,"speed":21.11,"datetime":"2018-10-10 21:00"},{"direction":50.01,"speed":20.33,"datetime":"2018-10-10 22:00"},{"direction":46.6,"speed":19.5,"datetime":"2018-10-10 23:00"},{"direction":43.93,"speed":18.7,"datetime":"2018-10-11 00:00"},{"direction":41.18,"speed":18.34,"datetime":"2018-10-11 01:00"},{"direction":37.29,"speed":19.02,"datetime":"2018-10-11 02:00"},{"direction":32.41,"speed":21.19,"datetime":"2018-10-11 03:00"},{"direction":28.61,"speed":24.44,"datetime":"2018-10-11 04:00"},{"direction":27,"speed":27.96,"datetime":"2018-10-11 05:00"},{"direction":27.47,"speed":30.98,"datetime":"2018-10-11 06:00"},{"direction":28.71,"speed":32.89,"datetime":"2018-10-11 07:00"},{"direction":29.58,"speed":33.08,"datetime":"2018-10-11 08:00"},{"direction":29.38,"speed":31.27,"datetime":"2018-10-11 09:00"},{"direction":28.51,"speed":28.51,"datetime":"2018-10-11 10:00"},{"direction":27.82,"speed":26.19,"datetime":"2018-10-11 11:00"},{"direction":28.34,"speed":25.33,"datetime":"2018-10-11 12:00"},{"direction":29.97,"speed":25.58,"datetime":"2018-10-11 13:00"},{"direction":32.18,"speed":26.25,"datetime":"2018-10-11 14:00"},{"direction":34.59,"speed":26.78,"datetime":"2018-10-11 15:00"},{"direction":36.96,"speed":27.18,"datetime":"2018-10-11 16:00"},{"direction":39.01,"speed":27.54,"datetime":"2018-10-11 17:00"},{"direction":40.55,"speed":27.92,"datetime":"2018-10-11 18:00"},{"direction":41.7,"speed":28.09,"datetime":"2018-10-11 19:00"},{"direction":42.71,"speed":27.82,"datetime":"2018-10-11 20:00"},{"direction":43.75,"speed":26.98,"datetime":"2018-10-11 21:00"},{"direction":44.69,"speed":25.89,"datetime":"2018-10-11 22:00"},{"direction":45.21,"speed":25.01,"datetime":"2018-10-11 23:00"},{"direction":45.14,"speed":24.66,"datetime":"2018-10-12 00:00"},{"direction":45.23,"speed":24.76,"datetime":"2018-10-12 01:00"},{"direction":46.43,"speed":25.11,"datetime":"2018-10-12 02:00"},{"direction":49.25,"speed":25.59,"datetime":"2018-10-12 03:00"},{"direction":52.72,"speed":26.1,"datetime":"2018-10-12 04:00"},{"direction":55.62,"speed":26.43,"datetime":"2018-10-12 05:00"},{"direction":57.18,"speed":26.37,"datetime":"2018-10-12 06:00"},{"direction":57.75,"speed":25.92,"datetime":"2018-10-12 07:00"},{"direction":57.9,"speed":25.2,"datetime":"2018-10-12 08:00"},{"direction":58.06,"speed":24.36,"datetime":"2018-10-12 09:00"},{"direction":58.19,"speed":23.55,"datetime":"2018-10-12 10:00"},{"direction":58.05,"speed":22.94,"datetime":"2018-10-12 11:00"},{"direction":57.57,"speed":22.64,"datetime":"2018-10-12 12:00"}]
     * temperature : [{"value":25,"datetime":"2018-10-10 13:00"},{"value":25,"datetime":"2018-10-10 14:00"},{"value":24,"datetime":"2018-10-10 15:00"},{"value":24,"datetime":"2018-10-10 16:00"},{"value":24,"datetime":"2018-10-10 17:00"},{"value":23,"datetime":"2018-10-10 18:00"},{"value":23,"datetime":"2018-10-10 19:00"},{"value":22,"datetime":"2018-10-10 20:00"},{"value":22,"datetime":"2018-10-10 21:00"},{"value":22,"datetime":"2018-10-10 22:00"},{"value":22,"datetime":"2018-10-10 23:00"},{"value":22.1,"datetime":"2018-10-11 00:00"},{"value":21.4,"datetime":"2018-10-11 01:00"},{"value":21.6,"datetime":"2018-10-11 02:00"},{"value":21.8,"datetime":"2018-10-11 03:00"},{"value":22,"datetime":"2018-10-11 04:00"},{"value":22.1,"datetime":"2018-10-11 05:00"},{"value":22.2,"datetime":"2018-10-11 06:00"},{"value":22.3,"datetime":"2018-10-11 07:00"},{"value":22.4,"datetime":"2018-10-11 08:00"},{"value":23,"datetime":"2018-10-11 09:00"},{"value":21.7,"datetime":"2018-10-11 10:00"},{"value":21.4,"datetime":"2018-10-11 11:00"},{"value":21.1,"datetime":"2018-10-11 12:00"},{"value":21.43,"datetime":"2018-10-11 13:00"},{"value":20,"datetime":"2018-10-11 14:00"},{"value":20.97,"datetime":"2018-10-11 15:00"},{"value":20.82,"datetime":"2018-10-11 16:00"},{"value":20.69,"datetime":"2018-10-11 17:00"},{"value":20.64,"datetime":"2018-10-11 18:00"},{"value":20.62,"datetime":"2018-10-11 19:00"},{"value":20.75,"datetime":"2018-10-11 20:00"},{"value":20.84,"datetime":"2018-10-11 21:00"},{"value":20.9,"datetime":"2018-10-11 22:00"},{"value":20.94,"datetime":"2018-10-11 23:00"},{"value":21,"datetime":"2018-10-12 00:00"},{"value":21,"datetime":"2018-10-12 01:00"},{"value":21,"datetime":"2018-10-12 02:00"},{"value":21,"datetime":"2018-10-12 03:00"},{"value":21,"datetime":"2018-10-12 04:00"},{"value":21,"datetime":"2018-10-12 05:00"},{"value":21,"datetime":"2018-10-12 06:00"},{"value":21.03,"datetime":"2018-10-12 07:00"},{"value":21.12,"datetime":"2018-10-12 08:00"},{"value":21.23,"datetime":"2018-10-12 09:00"},{"value":21.35,"datetime":"2018-10-12 10:00"},{"value":21.45,"datetime":"2018-10-12 11:00"},{"value":21.75,"datetime":"2018-10-12 12:00"}]
     */

    private String status;
    private String description;
    private List<SkyconBean> skycon; //天气状况
    private List<CloudrateBean> cloudrate; // 雾气情况
    private List<AqiBean> aqi; //空气质量指数
    private List<HumidityBean> humidity; //湿度
    private List<PresBean> pres; //大气压强
    private List<Pm25Bean> pm25; // PM2.5指数
    private List<PrecipitationBean> precipitation; //降水量  单位 mm/h，0.05 ~ 0.9 小雨 0.9 ~ 2.87 中雨 >2.87大雨；
    private List<WindBean> wind; //风量
    private List<TemperatureBean> temperature; //温度

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

    public List<SkyconBean> getSkycon() {
        return skycon;
    }

    public void setSkycon(List<SkyconBean> skycon) {
        this.skycon = skycon;
    }

    public List<CloudrateBean> getCloudrate() {
        return cloudrate;
    }

    public void setCloudrate(List<CloudrateBean> cloudrate) {
        this.cloudrate = cloudrate;
    }

    public List<AqiBean> getAqi() {
        return aqi;
    }

    public void setAqi(List<AqiBean> aqi) {
        this.aqi = aqi;
    }

    public List<HumidityBean> getHumidity() {
        return humidity;
    }

    public void setHumidity(List<HumidityBean> humidity) {
        this.humidity = humidity;
    }

    public List<PresBean> getPres() {
        return pres;
    }

    public void setPres(List<PresBean> pres) {
        this.pres = pres;
    }

    public List<Pm25Bean> getPm25() {
        return pm25;
    }

    public void setPm25(List<Pm25Bean> pm25) {
        this.pm25 = pm25;
    }

    public List<PrecipitationBean> getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(List<PrecipitationBean> precipitation) {
        this.precipitation = precipitation;
    }

    public List<WindBean> getWind() {
        return wind;
    }

    public void setWind(List<WindBean> wind) {
        this.wind = wind;
    }

    public List<TemperatureBean> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<TemperatureBean> temperature) {
        this.temperature = temperature;
    }

    public static class SkyconBean {
        /**
         * value : RAIN
         * datetime : 2018-10-10 13:00
         */

        private String value;
        private String datetime;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class CloudrateBean {
        /**
         * value : 0.78
         * datetime : 2018-10-10 13:00
         */

        private double value;
        private String datetime;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class AqiBean {
        /**
         * value : 20
         * datetime : 2018-10-10 13:00
         */

        private int value;
        private String datetime;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class HumidityBean {
        /**
         * value : 0.8
         * datetime : 2018-10-10 13:00
         */

        private double value;
        private String datetime;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class PresBean {
        /**
         * value : 99995.9856906134
         * datetime : 2018-10-10 13:00
         */

        private double value;
        private String datetime;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class Pm25Bean {
        /**
         * value : 12
         * datetime : 2018-10-10 13:00
         */

        private int value;
        private String datetime;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class PrecipitationBean {
        /**
         * value : 0.0869
         * datetime : 2018-10-10 13:00
         */

        private double value;
        private String datetime;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class WindBean {
        /**
         * direction : 56.57
         * speed : 23.33
         * datetime : 2018-10-10 13:00
         */

        private double direction;
        private double speed;
        private String datetime;

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

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }

    public static class TemperatureBean {
        /**
         * value : 25
         * datetime : 2018-10-10 13:00
         */

        private int value;
        private String datetime;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }
    }
}