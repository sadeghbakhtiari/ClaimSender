package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "DischargeVO")
public class DischargeVo {
    private int sepasId;
    private String conditionOnDischargeCode;
    private Integer dischargeYear;
    private Integer dischargeMonth;
    private Integer dischargeDay;
    private Integer dischargeHour;
    private Integer dischargeMinute;
    private Integer dischargeSecond;
    private PatientTransfer patientTransferBySepasId;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DischargeVo that = (DischargeVo) o;

        if (sepasId != that.sepasId) return false;
        if (conditionOnDischargeCode != null ? !conditionOnDischargeCode.equals(that.conditionOnDischargeCode) : that.conditionOnDischargeCode != null)
            return false;
        if (dischargeYear != null ? !dischargeYear.equals(that.dischargeYear) : that.dischargeYear != null)
            return false;
        if (dischargeMonth != null ? !dischargeMonth.equals(that.dischargeMonth) : that.dischargeMonth != null)
            return false;
        if (dischargeDay != null ? !dischargeDay.equals(that.dischargeDay) : that.dischargeDay != null) return false;
        if (dischargeHour != null ? !dischargeHour.equals(that.dischargeHour) : that.dischargeHour != null)
            return false;
        if (dischargeMinute != null ? !dischargeMinute.equals(that.dischargeMinute) : that.dischargeMinute != null)
            return false;
        if (dischargeSecond != null ? !dischargeSecond.equals(that.dischargeSecond) : that.dischargeSecond != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + (conditionOnDischargeCode != null ? conditionOnDischargeCode.hashCode() : 0);
        result = 31 * result + (dischargeYear != null ? dischargeYear.hashCode() : 0);
        result = 31 * result + (dischargeMonth != null ? dischargeMonth.hashCode() : 0);
        result = 31 * result + (dischargeDay != null ? dischargeDay.hashCode() : 0);
        result = 31 * result + (dischargeHour != null ? dischargeHour.hashCode() : 0);
        result = 31 * result + (dischargeMinute != null ? dischargeMinute.hashCode() : 0);
        result = 31 * result + (dischargeSecond != null ? dischargeSecond.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransferBySepasId() {
        return patientTransferBySepasId;
    }

    public void setPatientTransferBySepasId(PatientTransfer patientTransferBySepasId) {
        this.patientTransferBySepasId = patientTransferBySepasId;
    }
}
