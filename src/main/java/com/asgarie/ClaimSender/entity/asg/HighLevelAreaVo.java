package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "highlevelareavo")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HighLevelAreaVo that = (HighLevelAreaVo) o;

        if (highLevelAreaVofk != that.highLevelAreaVofk) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (districtCode != null ? !districtCode.equals(that.districtCode) : that.districtCode != null) return false;
        if (nationalAreaCode != null ? !nationalAreaCode.equals(that.nationalAreaCode) : that.nationalAreaCode != null)
            return false;
        if (provinceCode != null ? !provinceCode.equals(that.provinceCode) : that.provinceCode != null) return false;
        if (ruralAreaCode != null ? !ruralAreaCode.equals(that.ruralAreaCode) : that.ruralAreaCode != null)
            return false;
        if (townCode != null ? !townCode.equals(that.townCode) : that.townCode != null) return false;
        if (villageCode != null ? !villageCode.equals(that.villageCode) : that.villageCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = highLevelAreaVofk;
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (districtCode != null ? districtCode.hashCode() : 0);
        result = 31 * result + (nationalAreaCode != null ? nationalAreaCode.hashCode() : 0);
        result = 31 * result + (provinceCode != null ? provinceCode.hashCode() : 0);
        result = 31 * result + (ruralAreaCode != null ? ruralAreaCode.hashCode() : 0);
        result = 31 * result + (townCode != null ? townCode.hashCode() : 0);
        result = 31 * result + (villageCode != null ? villageCode.hashCode() : 0);
        return result;
    }
}
