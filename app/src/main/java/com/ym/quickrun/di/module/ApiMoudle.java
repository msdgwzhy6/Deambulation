package com.ym.quickrun.di.module;

import com.ym.quickrun.network.api.HttpApi;
import com.ym.quickrun.network.helper.OkHttpHelper;
import com.ym.quickrun.network.helper.RetrofitHelper;
import com.ym.quickrun.network.support.ApiConstants;

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
public class ApiMoudle {
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
    public Retrofit.Builder provideRetrofitBuilder(){
        return new Retrofit.Builder();
    }


    @Provides
    @Singleton
    public RetrofitHelper provideRetrofitHelper(HttpApi httpApi){
        return new RetrofitHelper(httpApi);
    }


    @Singleton
    @Provides
    public Retrofit provideAppRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder, client, ApiConstants.APP_BASE_URL);
    }

    @Singleton
    @Provides
    public HttpApi provideHttpApi(Retrofit retrofit){
        return retrofit.create(HttpApi.class);
    }
}
