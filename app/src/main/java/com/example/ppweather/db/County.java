package com.example.ppweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus-pc on 2017/5/24.
 */

public class County extends DataSupport {


    private int Id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }


}
