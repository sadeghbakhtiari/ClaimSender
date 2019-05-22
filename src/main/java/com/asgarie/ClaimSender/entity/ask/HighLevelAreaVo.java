package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class HighLevelAreaVo implements Serializable {
    private int highLevelAreaVofk;
    private String cityCode;
    private String countryCode;
    private String districtCode;
    private String nationalAreaCode;
    private String provinceCode;
    private String ruralAreaCode;
    private String townCode;
    private String villageCode;

    public int getHighLevelAreaVofk() {
        return highLevelAreaVofk;
    }

    public void setHighLevelAreaVofk(int highLevelAreaVofk) {
        this.highLevelAreaVofk = highLevelAreaVofk;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getNationalAreaCode() {
        return nationalAreaCode;
    }

    public void setNationalAreaCode(String nationalAreaCode) {
        this.nationalAreaCode = nationalAreaCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getRuralAreaCode() {
        return ruralAreaCode;
    }

    public void setRuralAreaCode(String ruralAreaCode) {
        this.ruralAreaCode = ruralAreaCode;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

}
