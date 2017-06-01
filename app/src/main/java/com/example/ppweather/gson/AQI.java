package com.example.ppweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus-pc on 2017/5/27.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
