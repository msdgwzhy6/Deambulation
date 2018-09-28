package com.ym.quickrun.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.telephony.TelephonyManager;

import com.ym.quickrun.widget.NetworkService;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/27
 * desc: 网络实时监听
 */
public class NetworkUtils {

    private static final String TAG = NetworkUtils.class.getSimpleName();
    public static final String NET_BROADCAST_ACTION = "com.network.state.action";
    public static final String NET_STATE_NAME = "network_state";

    public enum NetType {
        /**
         * 当前网络状态
         */
        None(1, "无网络连接"),
        Mobile(2, "移动网络"),
        Wifi(4, "Wifi网络"),
        Other(8, "未知网络");

        public int value;
        public String desc;

        NetType(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }
    }


    /**
     * 获取ConnectivityManager
     */
    private static ConnectivityManager getConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    /**
     * 获取TelephonyManager
     */
    public static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    }

    /**
     * 判断网络是否连接
     */
    public static boolean isConnected(Context context) {
        NetworkInfo networkInfo = getConnectivityManager(context).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    /**
     * 判断当前网络是否正在连接中或则已连接
     */
    public static boolean isConnectedOrConnecting(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Network[] nets = getConnectivityManager(context).getAllNetworks();
            if (nets != null) {
                for (Network network : nets) {
                    NetworkInfo networkInfo = getConnectivityManager(context).getNetworkInfo(network);
                    if (networkInfo.isConnectedOrConnecting()) {
                        return true;
                    }
                }
            }
        } else {
            NetworkInfo[] nets = getConnectivityManager(context).getAllNetworkInfo();
            if (nets != null) {
                for (NetworkInfo networkInfo : nets) {
                    if (networkInfo.isConnectedOrConnecting()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 获取当前网络类型（移动网络还是Wifi）
     */
    public static NetType getConnectedType(Context context) {
        NetworkInfo NET = getConnectivityManager(context).getActiveNetworkInfo();
        if (NET != null) {
            switch (NET.getType()) {
                case ConnectivityManager.TYPE_WIFI:
                    return NetType.Wifi;
                case ConnectivityManager.TYPE_MOBILE:
                    return NetType.Mobile;
                default:
                    return NetType.Other;
            }
        }
        return NetType.None;
    }

    /**
     * 获取当前是否存在有效的Wifi连接
     */
    public static boolean isWifiConnected(Context context) {
        NetworkInfo networkInfo = getConnectivityManager(context).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_WIFI && networkInfo.isConnected();
    }

    /**
     * 获取当前是否存在有效的网络连接
     */
    public static boolean isMobileConnected(Context context) {
        NetworkInfo networkInfo = getConnectivityManager(context).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_MOBILE && networkInfo.isConnected();
    }


    /**
     * 开启服务,实时监听网络变化（需要在清单文件配置Service）
     */
    public static void startNetService(final Context context) {
        //注册广播
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(NET_BROADCAST_ACTION);
        context.registerReceiver(mReceiver, intentFilter);
        //开启服务
        Intent intent = new Intent(context, NetworkService.class);
        context.bindService(intent, new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {

            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        }, Context.BIND_AUTO_CREATE);
    }

    /**
     * 接受服务上发过来的广播
     */
    private static BroadcastReceiver mReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                /*
                  -1 为无网络连接
                   1 为WIFI
                   2 为移动网络
                */
                int CURRENT_NETWORK_STATE = intent.getIntExtra(NET_STATE_NAME,-1);
                switch (CURRENT_NETWORK_STATE) {
                    case -1:
                        ToastUtils.showSingleLongToast("当前没有网络,请检查网络后重试！");
                        LogUtils.i(TAG, "网络更改为 无网络  CURRENT_NETWORK_STATE =" + CURRENT_NETWORK_STATE);
                        break;
                    case 1:
                        LogUtils.i(TAG, "网络更改为 WIFI网络  CURRENT_NETWORK_STATE=" + CURRENT_NETWORK_STATE);
                        break;
                    case 2:
                        LogUtils.i(TAG, "网络更改为 移动网络  CURRENT_NETWORK_STATE =" + CURRENT_NETWORK_STATE);
                        break;
                    default:
                        break;
                }
            }
        }
    };

}
