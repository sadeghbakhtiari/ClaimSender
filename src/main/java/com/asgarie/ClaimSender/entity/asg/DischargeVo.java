package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DischargeVO")
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

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    @Basic
    @Column(name = "ConditionOnDischargeCode")
    public String getConditionOnDischargeCode() {
        return conditionOnDischargeCode;
    }

    public void setConditionOnDischargeCode(String conditionOnDischargeCode) {
        this.conditionOnDischargeCode = conditionOnDischargeCode;
    }

    @Basic
    @Column(name = "DischargeYear")
    public Integer getDischargeYear() {
        return dischargeYear;
    }

    public void setDischargeYear(Integer dischargeYear) {
        this.dischargeYear = dischargeYear;
    }

    @Basic
    @Column(name = "DischargeMonth")
    public Integer getDischargeMonth() {
        return dischargeMonth;
    }

    public void setDischargeMonth(Integer dischargeMonth) {
        this.dischargeMonth = dischargeMonth;
    }

    @Basic
    @Column(name = "DischargeDay")
    public Integer getDischargeDay() {
        return dischargeDay;
    }

    public void setDischargeDay(Integer dischargeDay) {
        this.dischargeDay = dischargeDay;
    }

    @Basic
    @Column(name = "DischargeHour")
    public Integer getDischargeHour() {
        return dischargeHour;
    }

    public void setDischargeHour(Integer dischargeHour) {
        this.dischargeHour = dischargeHour;
    }

    @Basic
    @Column(name = "DischargeMinute")
    public Integer getDischargeMinute() {
        return dischargeMinute;
    }

    public void setDischargeMinute(Integer dischargeMinute) {
        this.dischargeMinute = dischargeMinute;
    }

    @Basic
    @Column(name = "DischargeSecond")
    public Integer getDischargeSecond() {
        return dischargeSecond;
    }

    public void setDischargeSecond(Integer dischargeSecond) {
        this.dischargeSecond = dischargeSecond;
    }

    @OneToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
