package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "Highlevelareavo")
public class HighLevelAreaVo {
    private int highLevelAreaVofk;
    private String cityCode;
    private String countryCode;
    private String districtCode;
    private String nationalAreaCode;
    private String provinceCode;
    private String ruralAreaCode;
    private String townCode;
    private String villageCode;

    @Id
    @Column(name = "HighLevelAreaVOFK")
    public int getHighLevelAreaVofk() {
        return highLevelAreaVofk;
    }

    public void setHighLevelAreaVofk(int highLevelAreaVofk) {
        this.highLevelAreaVofk = highLevelAreaVofk;
    }

    @Basic
    @Column(name = "CityCode")
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "DistrictCode")
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    @Basic
    @Column(name = "NationalAreaCode")
    public String getNationalAreaCode() {
        return nationalAreaCode;
    }

    public void setNationalAreaCode(String nationalAreaCode) {
        this.nationalAreaCode = nationalAreaCode;
    }

    @Basic
    @Column(name = "ProvinceCode")
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "RuralAreaCode")
    public String getRuralAreaCode() {
        return ruralAreaCode;
    }

    public void setRuralAreaCode(String ruralAreaCode) {
        this.ruralAreaCode = ruralAreaCode;
    }

    @Basic
    @Column(name = "TownCode")
    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    @Basic
    @Column(name = "VillageCode")
    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

}
