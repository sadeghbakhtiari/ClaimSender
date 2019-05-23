package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class BasicDeathDetailsVo implements Serializable {
    private Integer sepasId;
    private Integer deathYear;
    private Integer deathMonth;
    private Integer deathDay;
    private Integer deathHour;
    private Integer deathMinute;
    private Integer deathSecond;
    private String deathLocationCode;
    private Integer hospitalWardVo;

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public Integer getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(Integer deathMonth) {
        this.deathMonth = deathMonth;
    }

    public Integer getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(Integer deathDay) {
        this.deathDay = deathDay;
    }

    public Integer getDeathHour() {
        return deathHour;
    }

    public void setDeathHour(Integer deathHour) {
        this.deathHour = deathHour;
    }

    public Integer getDeathMinute() {
        return deathMinute;
    }

    public void setDeathMinute(Integer deathMinute) {
        this.deathMinute = deathMinute;
    }

    public Integer getDeathSecond() {
        return deathSecond;
    }

    public void setDeathSecond(Integer deathSecond) {
        this.deathSecond = deathSecond;
    }

    public String getDeathLocationCode() {
        return deathLocationCode;
    }

    public void setDeathLocationCode(String deathLocationCode) {
        this.deathLocationCode = deathLocationCode;
    }

    public Integer getHospitalWardVo() {
        return hospitalWardVo;
    }

    public void setHospitalWardVo(Integer hospitalWardVo) {
        this.hospitalWardVo = hospitalWardVo;
    }

}
