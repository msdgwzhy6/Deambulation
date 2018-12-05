package com.ym.deambulation.di.module;

import com.ym.deambulation.di.qualifier.AppUrl;
import com.ym.deambulation.di.qualifier.WeatherUrl;
import com.ym.deambulation.utils.network.api.ApiService;
import com.ym.deambulation.utils.network.api.WeatherService;
import com.ym.deambulation.utils.network.helper.OkHttpHelper;
import com.ym.deambulation.utils.network.helper.RetrofitHelper;
import com.ym.deambulation.utils.network.support.ApiConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc:Api网络模型
 */
@Module
public class ApiModule {
    public Retrofit createRetrofit(Retrofit.Builder builder, OkHttpClient client, String baseUrl) {
        return builder
                .baseUrl(baseUrl)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        return OkHttpHelper.getInstance().getOkHttpClient();
    }

    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofitBuilder() {
        return new Retrofit.Builder();
    }


    @Provides
    @Singleton
    public RetrofitHelper provideRetrofitHelper(ApiService apiService, WeatherService weatherService) {
        return new RetrofitHelper(apiService, weatherService);
    }


    @Singleton
    @Provides
    @AppUrl
    public Retrofit provideAppRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder, client, ApiConstants.APP_BASE_URL);
    }

    @Singleton
    @Provides
    public ApiService provideApiService(@AppUrl Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Singleton
    @Provides
    @WeatherUrl
    public Retrofit provideWeatherRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder, client, ApiConstants.APP_WEATHER_URL);
    }

    @Singleton
    @Provides
    public WeatherService provideWeatherService(@WeatherUrl Retrofit retrofit) {
        return retrofit.create(WeatherService.class);
    }


}
