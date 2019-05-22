package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class BillSummaryVo implements Serializable {
    private Integer sepasId;
    private Integer hospitalAccreditation;
    private String insurerCode;
    private String insuranceBoxCode;
    private String medicalRecordTypeCode;
    private Double totalBasicInsuranceContribution;
    private Double totalPatientContribution;
    private Double totalCharge;
    private Integer totalOtherCostsQuantitiesFk;
    private String globalPackage;
    private Double dCost;
    private Double tCost;
    private Double takhfif;
    private Double takmiliCost;
    private PatientTransfer patientTransfer;

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public Integer getHospitalAccreditation() {
        return hospitalAccreditation;
    }

    public void setHospitalAccreditation(Integer hospitalAccreditation) {
        this.hospitalAccreditation = hospitalAccreditation;
    }

    public String getInsurerCode() {
        return insurerCode;
    }

    public void setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
    }

    public String getInsuranceBoxCode() {
        return insuranceBoxCode;
    }

    public void setInsuranceBoxCode(String insuranceBoxCode) {
        this.insuranceBoxCode = insuranceBoxCode;
    }

    public String getMedicalRecordTypeCode() {
        return medicalRecordTypeCode;
    }

    public void setMedicalRecordTypeCode(String medicalRecordTypeCode) {
        this.medicalRecordTypeCode = medicalRecordTypeCode;
    }

    public Double getTotalBasicInsuranceContribution() {
        return totalBasicInsuranceContribution;
    }

    public void setTotalBasicInsuranceContribution(Double totalBasicInsuranceContribution) {
        this.totalBasicInsuranceContribution = totalBasicInsuranceContribution;
    }

    public Double getTotalPatientContribution() {
        return totalPatientContribution;
    }

    public void setTotalPatientContribution(Double totalPatientContribution) {
        this.totalPatientContribution = totalPatientContribution;
    }

    public Double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Integer getTotalOtherCostsQuantitiesFk() {
        return totalOtherCostsQuantitiesFk;
    }

    public void setTotalOtherCostsQuantitiesFk(Integer totalOtherCostsQuantitiesFk) {
        this.totalOtherCostsQuantitiesFk = totalOtherCostsQuantitiesFk;
    }

    public String getGlobalPackage() {
        return globalPackage;
    }

    public void setGlobalPackage(String globalPackage) {
        this.globalPackage = globalPackage;
    }

    public Double getdCost() {
        return dCost;
    }

    public void setdCost(Double dCost) {
        this.dCost = dCost;
    }

    public Double gettCost() {
        return tCost;
    }

    public void settCost(Double tCost) {
        this.tCost = tCost;
    }

    public Double getTakhfif() {
        return takhfif;
    }

    public void setTakhfif(Double takhfif) {
        this.takhfif = takhfif;
    }

    public Double getTakmiliCost() {
        return takmiliCost;
    }

    public void setTakmiliCost(Double takmiliCost) {
        this.takmiliCost = takmiliCost;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
