package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "BasicDeathDetailsVO")
public class BasicDeathDetailsVo {
    private int sepasId;
    private Integer deathYear;
    private Integer deathMonth;
    private Integer deathDay;
    private Integer deathHour;
    private Integer deathMinute;
    private Integer deathSecond;
    private String deathLocationCode;
    private Integer hospitalWardHospitalWardVofk;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
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
    public Integer getHospitalWardHospitalWardVofk() {
        return hospitalWardHospitalWardVofk;
    }

    public void setHospitalWardHospitalWardVofk(Integer hospitalWardHospitalWardVofk) {
        this.hospitalWardHospitalWardVofk = hospitalWardHospitalWardVofk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasicDeathDetailsVo that = (BasicDeathDetailsVo) o;

        if (sepasId != that.sepasId) return false;
        if (deathYear != null ? !deathYear.equals(that.deathYear) : that.deathYear != null) return false;
        if (deathMonth != null ? !deathMonth.equals(that.deathMonth) : that.deathMonth != null) return false;
        if (deathDay != null ? !deathDay.equals(that.deathDay) : that.deathDay != null) return false;
        if (deathHour != null ? !deathHour.equals(that.deathHour) : that.deathHour != null) return false;
        if (deathMinute != null ? !deathMinute.equals(that.deathMinute) : that.deathMinute != null) return false;
        if (deathSecond != null ? !deathSecond.equals(that.deathSecond) : that.deathSecond != null) return false;
        if (deathLocationCode != null ? !deathLocationCode.equals(that.deathLocationCode) : that.deathLocationCode != null)
            return false;
        if (hospitalWardHospitalWardVofk != null ? !hospitalWardHospitalWardVofk.equals(that.hospitalWardHospitalWardVofk) : that.hospitalWardHospitalWardVofk != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + (deathYear != null ? deathYear.hashCode() : 0);
        result = 31 * result + (deathMonth != null ? deathMonth.hashCode() : 0);
        result = 31 * result + (deathDay != null ? deathDay.hashCode() : 0);
        result = 31 * result + (deathHour != null ? deathHour.hashCode() : 0);
        result = 31 * result + (deathMinute != null ? deathMinute.hashCode() : 0);
        result = 31 * result + (deathSecond != null ? deathSecond.hashCode() : 0);
        result = 31 * result + (deathLocationCode != null ? deathLocationCode.hashCode() : 0);
        result = 31 * result + (hospitalWardHospitalWardVofk != null ? hospitalWardHospitalWardVofk.hashCode() : 0);
        return result;
    }
}
