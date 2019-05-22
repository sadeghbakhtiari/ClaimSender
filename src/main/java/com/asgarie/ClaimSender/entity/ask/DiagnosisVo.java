package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class DiagnosisVo implements Serializable {
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

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public Integer getDiagnosisYear() {
        return diagnosisYear;
    }

    public void setDiagnosisYear(Integer diagnosisYear) {
        this.diagnosisYear = diagnosisYear;
    }

    public Integer getDiagnosisMonth() {
        return diagnosisMonth;
    }

    public void setDiagnosisMonth(Integer diagnosisMonth) {
        this.diagnosisMonth = diagnosisMonth;
    }

    public Integer getDiagnosisDay() {
        return diagnosisDay;
    }

    public void setDiagnosisDay(Integer diagnosisDay) {
        this.diagnosisDay = diagnosisDay;
    }

    public Integer getDiagnosisHour() {
        return diagnosisHour;
    }

    public void setDiagnosisHour(Integer diagnosisHour) {
        this.diagnosisHour = diagnosisHour;
    }

    public Integer getDiagnosisMinute() {
        return diagnosisMinute;
    }

    public void setDiagnosisMinute(Integer diagnosisMinute) {
        this.diagnosisMinute = diagnosisMinute;
    }

    public Integer getDiagnosisSecond() {
        return diagnosisSecond;
    }

    public void setDiagnosisSecond(Integer diagnosisSecond) {
        this.diagnosisSecond = diagnosisSecond;
    }

    public Integer getSeverityValue() {
        return severityValue;
    }

    public void setSeverityValue(Integer severityValue) {
        this.severityValue = severityValue;
    }

    public String getSeveritySymbolCode() {
        return severitySymbolCode;
    }

    public void setSeveritySymbolCode(String severitySymbolCode) {
        this.severitySymbolCode = severitySymbolCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
