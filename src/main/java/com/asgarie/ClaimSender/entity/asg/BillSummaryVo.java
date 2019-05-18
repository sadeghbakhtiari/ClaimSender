package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "BillSummaryVO")
public class BillSummaryVo {
    private int sepasId;
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

    @Basic
    @Column(name = "TotalOtherCosts_QuantitiesFK")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillSummaryVo that = (BillSummaryVo) o;

        if (sepasId != that.sepasId) return false;
        if (hospitalAccreditation != null ? !hospitalAccreditation.equals(that.hospitalAccreditation) : that.hospitalAccreditation != null)
            return false;
        if (insurerCode != null ? !insurerCode.equals(that.insurerCode) : that.insurerCode != null) return false;
        if (insuranceBoxCode != null ? !insuranceBoxCode.equals(that.insuranceBoxCode) : that.insuranceBoxCode != null)
            return false;
        if (medicalRecordTypeCode != null ? !medicalRecordTypeCode.equals(that.medicalRecordTypeCode) : that.medicalRecordTypeCode != null)
            return false;
        if (totalBasicInsuranceContribution != null ? !totalBasicInsuranceContribution.equals(that.totalBasicInsuranceContribution) : that.totalBasicInsuranceContribution != null)
            return false;
        if (totalPatientContribution != null ? !totalPatientContribution.equals(that.totalPatientContribution) : that.totalPatientContribution != null)
            return false;
        if (totalCharge != null ? !totalCharge.equals(that.totalCharge) : that.totalCharge != null) return false;
        if (totalOtherCostsQuantitiesFk != null ? !totalOtherCostsQuantitiesFk.equals(that.totalOtherCostsQuantitiesFk) : that.totalOtherCostsQuantitiesFk != null)
            return false;
        if (globalPackage != null ? !globalPackage.equals(that.globalPackage) : that.globalPackage != null)
            return false;
        if (dCost != null ? !dCost.equals(that.dCost) : that.dCost != null) return false;
        if (tCost != null ? !tCost.equals(that.tCost) : that.tCost != null) return false;
        if (takhfif != null ? !takhfif.equals(that.takhfif) : that.takhfif != null) return false;
        if (takmiliCost != null ? !takmiliCost.equals(that.takmiliCost) : that.takmiliCost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + (hospitalAccreditation != null ? hospitalAccreditation.hashCode() : 0);
        result = 31 * result + (insurerCode != null ? insurerCode.hashCode() : 0);
        result = 31 * result + (insuranceBoxCode != null ? insuranceBoxCode.hashCode() : 0);
        result = 31 * result + (medicalRecordTypeCode != null ? medicalRecordTypeCode.hashCode() : 0);
        result = 31 * result + (totalBasicInsuranceContribution != null ? totalBasicInsuranceContribution.hashCode() : 0);
        result = 31 * result + (totalPatientContribution != null ? totalPatientContribution.hashCode() : 0);
        result = 31 * result + (totalCharge != null ? totalCharge.hashCode() : 0);
        result = 31 * result + (totalOtherCostsQuantitiesFk != null ? totalOtherCostsQuantitiesFk.hashCode() : 0);
        result = 31 * result + (globalPackage != null ? globalPackage.hashCode() : 0);
        result = 31 * result + (dCost != null ? dCost.hashCode() : 0);
        result = 31 * result + (tCost != null ? tCost.hashCode() : 0);
        result = 31 * result + (takhfif != null ? takhfif.hashCode() : 0);
        result = 31 * result + (takmiliCost != null ? takmiliCost.hashCode() : 0);
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
