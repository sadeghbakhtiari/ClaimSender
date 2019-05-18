package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(DiagnosisVoPK.class)
public class DiagnosisVo {
    private int sepasId;
    private int id;
    private String comment;
    private String diagnosisCode;
    private Integer diagnosisYear;
    private Integer diagnosisMonth;
    private Integer diagnosisDay;
    private Integer diagnosisHour;
    private Integer diagnosisMinute;
    private Integer diagnosisSecond;
    private Integer severityValue;
    private String severitySymbolCode;
    private String statusCode;
    private PatientTransfer patientTransferBySepasId;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "DiagnosisCode")
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    @Basic
    @Column(name = "DiagnosisYear")
    public Integer getDiagnosisYear() {
        return diagnosisYear;
    }

    public void setDiagnosisYear(Integer diagnosisYear) {
        this.diagnosisYear = diagnosisYear;
    }

    @Basic
    @Column(name = "DiagnosisMonth")
    public Integer getDiagnosisMonth() {
        return diagnosisMonth;
    }

    public void setDiagnosisMonth(Integer diagnosisMonth) {
        this.diagnosisMonth = diagnosisMonth;
    }

    @Basic
    @Column(name = "DiagnosisDay")
    public Integer getDiagnosisDay() {
        return diagnosisDay;
    }

    public void setDiagnosisDay(Integer diagnosisDay) {
        this.diagnosisDay = diagnosisDay;
    }

    @Basic
    @Column(name = "DiagnosisHour")
    public Integer getDiagnosisHour() {
        return diagnosisHour;
    }

    public void setDiagnosisHour(Integer diagnosisHour) {
        this.diagnosisHour = diagnosisHour;
    }

    @Basic
    @Column(name = "DiagnosisMinute")
    public Integer getDiagnosisMinute() {
        return diagnosisMinute;
    }

    public void setDiagnosisMinute(Integer diagnosisMinute) {
        this.diagnosisMinute = diagnosisMinute;
    }

    @Basic
    @Column(name = "DiagnosisSecond")
    public Integer getDiagnosisSecond() {
        return diagnosisSecond;
    }

    public void setDiagnosisSecond(Integer diagnosisSecond) {
        this.diagnosisSecond = diagnosisSecond;
    }

    @Basic
    @Column(name = "SeverityValue")
    public Integer getSeverityValue() {
        return severityValue;
    }

    public void setSeverityValue(Integer severityValue) {
        this.severityValue = severityValue;
    }

    @Basic
    @Column(name = "SeveritySymbolCode")
    public String getSeveritySymbolCode() {
        return severitySymbolCode;
    }

    public void setSeveritySymbolCode(String severitySymbolCode) {
        this.severitySymbolCode = severitySymbolCode;
    }

    @Basic
    @Column(name = "StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiagnosisVo that = (DiagnosisVo) o;

        if (sepasId != that.sepasId) return false;
        if (id != that.id) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (diagnosisCode != null ? !diagnosisCode.equals(that.diagnosisCode) : that.diagnosisCode != null)
            return false;
        if (diagnosisYear != null ? !diagnosisYear.equals(that.diagnosisYear) : that.diagnosisYear != null)
            return false;
        if (diagnosisMonth != null ? !diagnosisMonth.equals(that.diagnosisMonth) : that.diagnosisMonth != null)
            return false;
        if (diagnosisDay != null ? !diagnosisDay.equals(that.diagnosisDay) : that.diagnosisDay != null) return false;
        if (diagnosisHour != null ? !diagnosisHour.equals(that.diagnosisHour) : that.diagnosisHour != null)
            return false;
        if (diagnosisMinute != null ? !diagnosisMinute.equals(that.diagnosisMinute) : that.diagnosisMinute != null)
            return false;
        if (diagnosisSecond != null ? !diagnosisSecond.equals(that.diagnosisSecond) : that.diagnosisSecond != null)
            return false;
        if (severityValue != null ? !severityValue.equals(that.severityValue) : that.severityValue != null)
            return false;
        if (severitySymbolCode != null ? !severitySymbolCode.equals(that.severitySymbolCode) : that.severitySymbolCode != null)
            return false;
        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + id;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (diagnosisCode != null ? diagnosisCode.hashCode() : 0);
        result = 31 * result + (diagnosisYear != null ? diagnosisYear.hashCode() : 0);
        result = 31 * result + (diagnosisMonth != null ? diagnosisMonth.hashCode() : 0);
        result = 31 * result + (diagnosisDay != null ? diagnosisDay.hashCode() : 0);
        result = 31 * result + (diagnosisHour != null ? diagnosisHour.hashCode() : 0);
        result = 31 * result + (diagnosisMinute != null ? diagnosisMinute.hashCode() : 0);
        result = 31 * result + (diagnosisSecond != null ? diagnosisSecond.hashCode() : 0);
        result = 31 * result + (severityValue != null ? severityValue.hashCode() : 0);
        result = 31 * result + (severitySymbolCode != null ? severitySymbolCode.hashCode() : 0);
        result = 31 * result + (statusCode != null ? statusCode.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransferBySepasId() {
        return patientTransferBySepasId;
    }

    public void setPatientTransferBySepasId(PatientTransfer patientTransferBySepasId) {
        this.patientTransferBySepasId = patientTransferBySepasId;
    }
}
