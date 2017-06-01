package com.example.ppweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by asus-pc on 2017/5/24.
 */

public class HttpUtil {

    //用okhttp与服务器进行请求
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
