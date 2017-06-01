package com.example.ppweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus-pc on 2017/5/27.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
