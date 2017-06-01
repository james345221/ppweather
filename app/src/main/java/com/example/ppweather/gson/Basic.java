package com.example.ppweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus-pc on 2017/5/27.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
