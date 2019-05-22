package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class InsuranceVo implements Serializable {
    private Integer sepasId;
    private int id;
    private String insuranceBookletSerialNumber;
    private Integer insuranceExpirationYear;
    private Integer insuranceExpirationMonth;
    private Integer insuranceExpirationDay;
    private String insuranceBoxCode;
    private String insuredNumber;
    private String insurerCode;
    private String shebad;
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

    public String getInsuranceBookletSerialNumber() {
        return insuranceBookletSerialNumber;
    }

    public void setInsuranceBookletSerialNumber(String insuranceBookletSerialNumber) {
        this.insuranceBookletSerialNumber = insuranceBookletSerialNumber;
    }

    public Integer getInsuranceExpirationYear() {
        return insuranceExpirationYear;
    }

    public void setInsuranceExpirationYear(Integer insuranceExpirationYear) {
        this.insuranceExpirationYear = insuranceExpirationYear;
    }

    public Integer getInsuranceExpirationMonth() {
        return insuranceExpirationMonth;
    }

    public void setInsuranceExpirationMonth(Integer insuranceExpirationMonth) {
        this.insuranceExpirationMonth = insuranceExpirationMonth;
    }

    public Integer getInsuranceExpirationDay() {
        return insuranceExpirationDay;
    }

    public void setInsuranceExpirationDay(Integer insuranceExpirationDay) {
        this.insuranceExpirationDay = insuranceExpirationDay;
    }

    public String getInsuranceBoxCode() {
        return insuranceBoxCode;
    }

    public void setInsuranceBoxCode(String insuranceBoxCode) {
        this.insuranceBoxCode = insuranceBoxCode;
    }

    public String getInsuredNumber() {
        return insuredNumber;
    }

    public void setInsuredNumber(String insuredNumber) {
        this.insuredNumber = insuredNumber;
    }

    public String getInsurerCode() {
        return insurerCode;
    }

    public void setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
    }

    public String getShebad() {
        return shebad;
    }

    public void setShebad(String shebad) {
        this.shebad = shebad;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
