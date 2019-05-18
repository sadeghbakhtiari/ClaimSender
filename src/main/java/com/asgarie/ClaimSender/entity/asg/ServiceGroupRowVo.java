package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(ServiceGroupRowVoPK.class)
public class ServiceGroupRowVo {
    private int sepasId;
    private int id;
    private Double patientContribution;
    private Double basicInsuranceContribution;
    private Double totalCharge;
    private Float serviceType;
    private Double serviceCountMagnitude;
    private String serviceCount;
    private Integer otherCostQuantitiesFk;
    private String serviceTitle;
    private Double tCost;
    private Double dCost;
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

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PatientContribution")
    public Double getPatientContribution() {
        return patientContribution;
    }

    public void setPatientContribution(Double patientContribution) {
        this.patientContribution = patientContribution;
    }

    @Basic
    @Column(name = "BasicInsuranceContribution")
    public Double getBasicInsuranceContribution() {
        return basicInsuranceContribution;
    }

    public void setBasicInsuranceContribution(Double basicInsuranceContribution) {
        this.basicInsuranceContribution = basicInsuranceContribution;
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
    @Column(name = "ServiceType")
    public Float getServiceType() {
        return serviceType;
    }

    public void setServiceType(Float serviceType) {
        this.serviceType = serviceType;
    }

    @Basic
    @Column(name = "ServiceCountMagnitude")
    public Double getServiceCountMagnitude() {
        return serviceCountMagnitude;
    }

    public void setServiceCountMagnitude(Double serviceCountMagnitude) {
        this.serviceCountMagnitude = serviceCountMagnitude;
    }

    @Basic
    @Column(name = "ServiceCount")
    public String getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(String serviceCount) {
        this.serviceCount = serviceCount;
    }

    @Basic
    @Column(name = "OtherCost_QuantitiesFK")
    public Integer getOtherCostQuantitiesFk() {
        return otherCostQuantitiesFk;
    }

    public void setOtherCostQuantitiesFk(Integer otherCostQuantitiesFk) {
        this.otherCostQuantitiesFk = otherCostQuantitiesFk;
    }

    @Basic
    @Column(name = "ServiceTitle")
    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
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
    @Column(name = "D_Cost")
    public Double getdCost() {
        return dCost;
    }

    public void setdCost(Double dCost) {
        this.dCost = dCost;
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

        ServiceGroupRowVo that = (ServiceGroupRowVo) o;

        if (sepasId != that.sepasId) return false;
        if (id != that.id) return false;
        if (patientContribution != null ? !patientContribution.equals(that.patientContribution) : that.patientContribution != null)
            return false;
        if (basicInsuranceContribution != null ? !basicInsuranceContribution.equals(that.basicInsuranceContribution) : that.basicInsuranceContribution != null)
            return false;
        if (totalCharge != null ? !totalCharge.equals(that.totalCharge) : that.totalCharge != null) return false;
        if (serviceType != null ? !serviceType.equals(that.serviceType) : that.serviceType != null) return false;
        if (serviceCountMagnitude != null ? !serviceCountMagnitude.equals(that.serviceCountMagnitude) : that.serviceCountMagnitude != null)
            return false;
        if (serviceCount != null ? !serviceCount.equals(that.serviceCount) : that.serviceCount != null) return false;
        if (otherCostQuantitiesFk != null ? !otherCostQuantitiesFk.equals(that.otherCostQuantitiesFk) : that.otherCostQuantitiesFk != null)
            return false;
        if (serviceTitle != null ? !serviceTitle.equals(that.serviceTitle) : that.serviceTitle != null) return false;
        if (tCost != null ? !tCost.equals(that.tCost) : that.tCost != null) return false;
        if (dCost != null ? !dCost.equals(that.dCost) : that.dCost != null) return false;
        if (takmiliCost != null ? !takmiliCost.equals(that.takmiliCost) : that.takmiliCost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + id;
        result = 31 * result + (patientContribution != null ? patientContribution.hashCode() : 0);
        result = 31 * result + (basicInsuranceContribution != null ? basicInsuranceContribution.hashCode() : 0);
        result = 31 * result + (totalCharge != null ? totalCharge.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        result = 31 * result + (serviceCountMagnitude != null ? serviceCountMagnitude.hashCode() : 0);
        result = 31 * result + (serviceCount != null ? serviceCount.hashCode() : 0);
        result = 31 * result + (otherCostQuantitiesFk != null ? otherCostQuantitiesFk.hashCode() : 0);
        result = 31 * result + (serviceTitle != null ? serviceTitle.hashCode() : 0);
        result = 31 * result + (tCost != null ? tCost.hashCode() : 0);
        result = 31 * result + (dCost != null ? dCost.hashCode() : 0);
        result = 31 * result + (takmiliCost != null ? takmiliCost.hashCode() : 0);
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
