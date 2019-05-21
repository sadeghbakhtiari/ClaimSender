package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "DiagnosisVo")
public class DiagnosisVo {
    private Integer sepasId;
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
    private PatientTransfer patientTransfer;

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
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

    @ManyToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
