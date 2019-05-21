package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BillSummaryVO")
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

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    @Basic
    @Column(name = "HospitalAccreditation")
    public Integer getHospitalAccreditation() {
        return hospitalAccreditation;
    }

    public void setHospitalAccreditation(Integer hospitalAccreditation) {
        this.hospitalAccreditation = hospitalAccreditation;
    }

    @Basic
    @Column(name = "InsurerCode")
    public String getInsurerCode() {
        return insurerCode;
    }

    public void setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
    }

    @Basic
    @Column(name = "InsuranceBoxCode")
    public String getInsuranceBoxCode() {
        return insuranceBoxCode;
    }

    public void setInsuranceBoxCode(String insuranceBoxCode) {
        this.insuranceBoxCode = insuranceBoxCode;
    }

    @Basic
    @Column(name = "MedicalRecordTypeCode")
    public String getMedicalRecordTypeCode() {
        return medicalRecordTypeCode;
    }

    public void setMedicalRecordTypeCode(String medicalRecordTypeCode) {
        this.medicalRecordTypeCode = medicalRecordTypeCode;
    }

    @Basic
    @Column(name = "TotalBasicInsuranceContribution")
    public Double getTotalBasicInsuranceContribution() {
        return totalBasicInsuranceContribution;
    }

    public void setTotalBasicInsuranceContribution(Double totalBasicInsuranceContribution) {
        this.totalBasicInsuranceContribution = totalBasicInsuranceContribution;
    }

    @Basic
    @Column(name = "TotalPatientContribution")
    public Double getTotalPatientContribution() {
        return totalPatientContribution;
    }

    public void setTotalPatientContribution(Double totalPatientContribution) {
        this.totalPatientContribution = totalPatientContribution;
    }

    @Basic
    @Column(name = "TotalCharge")
    public Double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Double totalCharge) {
        this.totalCharge = totalCharge;
    }

//    @Basic
//    @Column(name = "TotalOtherCosts_QuantitiesFK")
    @Transient
    public Integer getTotalOtherCostsQuantitiesFk() {
        return totalOtherCostsQuantitiesFk;
    }

    public void setTotalOtherCostsQuantitiesFk(Integer totalOtherCostsQuantitiesFk) {
        this.totalOtherCostsQuantitiesFk = totalOtherCostsQuantitiesFk;
    }

    @Basic
    @Column(name = "GlobalPackage")
    public String getGlobalPackage() {
        return globalPackage;
    }

    public void setGlobalPackage(String globalPackage) {
        this.globalPackage = globalPackage;
    }

    @Basic
    @Column(name = "D_Cost")
    public Double getdCost() {
        return dCost;
    }

    public void setdCost(Double dCost) {
        this.dCost = dCost;
    }

    @Basic
    @Column(name = "T_Cost")
    public Double gettCost() {
        return tCost;
    }

    public void settCost(Double tCost) {
        this.tCost = tCost;
    }

    @Basic
    @Column(name = "Takhfif")
    public Double getTakhfif() {
        return takhfif;
    }

    public void setTakhfif(Double takhfif) {
        this.takhfif = takhfif;
    }

    @Basic
    @Column(name = "TakmiliCost")
    public Double getTakmiliCost() {
        return takmiliCost;
    }

    public void setTakmiliCost(Double takmiliCost) {
        this.takmiliCost = takmiliCost;
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
