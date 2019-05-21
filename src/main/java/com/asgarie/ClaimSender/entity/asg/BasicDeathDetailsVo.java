package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "BasicDeathDetailsVO")
public class BasicDeathDetailsVo {
    private Integer sepasId;
    private Integer deathYear;
    private Integer deathMonth;
    private Integer deathDay;
    private Integer deathHour;
    private Integer deathMinute;
    private Integer deathSecond;
    private String deathLocationCode;
    private HospitalWardVo hospitalWardVo;

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    @Basic
    @Column(name = "DeathYear")
    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    @Basic
    @Column(name = "DeathMonth")
    public Integer getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(Integer deathMonth) {
        this.deathMonth = deathMonth;
    }

    @Basic
    @Column(name = "DeathDay")
    public Integer getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(Integer deathDay) {
        this.deathDay = deathDay;
    }

    @Basic
    @Column(name = "DeathHour")
    public Integer getDeathHour() {
        return deathHour;
    }

    public void setDeathHour(Integer deathHour) {
        this.deathHour = deathHour;
    }

    @Basic
    @Column(name = "DeathMinute")
    public Integer getDeathMinute() {
        return deathMinute;
    }

    public void setDeathMinute(Integer deathMinute) {
        this.deathMinute = deathMinute;
    }

    @Basic
    @Column(name = "DeathSecond")
    public Integer getDeathSecond() {
        return deathSecond;
    }

    public void setDeathSecond(Integer deathSecond) {
        this.deathSecond = deathSecond;
    }

    @Basic
    @Column(name = "DeathLocationCode")
    public String getDeathLocationCode() {
        return deathLocationCode;
    }

    public void setDeathLocationCode(String deathLocationCode) {
        this.deathLocationCode = deathLocationCode;
    }

    @Basic
    @Column(name = "HospitalWard_HospitalWardVOFK")
    public HospitalWardVo getHospitalWardVo() {
        return hospitalWardVo;
    }

    public void setHospitalWardVo(HospitalWardVo hospitalWardVo) {
        this.hospitalWardVo = hospitalWardVo;
    }

}
