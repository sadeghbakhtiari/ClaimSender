package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class ServiceGroupRowVo implements Serializable {
    private Integer sepasId;
    private int id;
    private Double patientContribution;
    private Double basicInsuranceContribution;
    private Double totalCharge;
    private Float serviceType;
    private Double serviceCountMagnitude;
    private String serviceCount;
    private String serviceTitle;
    private Double tCost;
    private Double dCost;
    private Double takmiliCost;
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

    public Double getPatientContribution() {
        return patientContribution;
    }

    public void setPatientContribution(Double patientContribution) {
        this.patientContribution = patientContribution;
    }

    public Double getBasicInsuranceContribution() {
        return basicInsuranceContribution;
    }

    public void setBasicInsuranceContribution(Double basicInsuranceContribution) {
        this.basicInsuranceContribution = basicInsuranceContribution;
    }

    public Double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Float getServiceType() {
        return serviceType;
    }

    public void setServiceType(Float serviceType) {
        this.serviceType = serviceType;
    }

    public Double getServiceCountMagnitude() {
        return serviceCountMagnitude;
    }

    public void setServiceCountMagnitude(Double serviceCountMagnitude) {
        this.serviceCountMagnitude = serviceCountMagnitude;
    }

    public String getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(String serviceCount) {
        this.serviceCount = serviceCount;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public Double gettCost() {
        return tCost;
    }

    public void settCost(Double tCost) {
        this.tCost = tCost;
    }

    public Double getdCost() {
        return dCost;
    }

    public void setdCost(Double dCost) {
        this.dCost = dCost;
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
