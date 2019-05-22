package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class DischargeVo implements Serializable {
    private Integer sepasId;
    private String conditionOnDischargeCode;
    private Integer dischargeYear;
    private Integer dischargeMonth;
    private Integer dischargeDay;
    private Integer dischargeHour;
    private Integer dischargeMinute;
    private Integer dischargeSecond;
    private PatientTransfer patientTransfer;

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public String getConditionOnDischargeCode() {
        return conditionOnDischargeCode;
    }

    public void setConditionOnDischargeCode(String conditionOnDischargeCode) {
        this.conditionOnDischargeCode = conditionOnDischargeCode;
    }

    public Integer getDischargeYear() {
        return dischargeYear;
    }

    public void setDischargeYear(Integer dischargeYear) {
        this.dischargeYear = dischargeYear;
    }

    public Integer getDischargeMonth() {
        return dischargeMonth;
    }

    public void setDischargeMonth(Integer dischargeMonth) {
        this.dischargeMonth = dischargeMonth;
    }

    public Integer getDischargeDay() {
        return dischargeDay;
    }

    public void setDischargeDay(Integer dischargeDay) {
        this.dischargeDay = dischargeDay;
    }

    public Integer getDischargeHour() {
        return dischargeHour;
    }

    public void setDischargeHour(Integer dischargeHour) {
        this.dischargeHour = dischargeHour;
    }

    public Integer getDischargeMinute() {
        return dischargeMinute;
    }

    public void setDischargeMinute(Integer dischargeMinute) {
        this.dischargeMinute = dischargeMinute;
    }

    public Integer getDischargeSecond() {
        return dischargeSecond;
    }

    public void setDischargeSecond(Integer dischargeSecond) {
        this.dischargeSecond = dischargeSecond;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
