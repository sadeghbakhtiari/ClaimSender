package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "InsuranceVo")
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
    @Column(name = "InsuranceBookletSerialNumber")
    public String getInsuranceBookletSerialNumber() {
        return insuranceBookletSerialNumber;
    }

    public void setInsuranceBookletSerialNumber(String insuranceBookletSerialNumber) {
        this.insuranceBookletSerialNumber = insuranceBookletSerialNumber;
    }

    @Basic
    @Column(name = "InsuranceExpirationYear")
    public Integer getInsuranceExpirationYear() {
        return insuranceExpirationYear;
    }

    public void setInsuranceExpirationYear(Integer insuranceExpirationYear) {
        this.insuranceExpirationYear = insuranceExpirationYear;
    }

    @Basic
    @Column(name = "InsuranceExpirationMonth")
    public Integer getInsuranceExpirationMonth() {
        return insuranceExpirationMonth;
    }

    public void setInsuranceExpirationMonth(Integer insuranceExpirationMonth) {
        this.insuranceExpirationMonth = insuranceExpirationMonth;
    }

    @Basic
    @Column(name = "InsuranceExpirationDay")
    public Integer getInsuranceExpirationDay() {
        return insuranceExpirationDay;
    }

    public void setInsuranceExpirationDay(Integer insuranceExpirationDay) {
        this.insuranceExpirationDay = insuranceExpirationDay;
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
    @Column(name = "InsuredNumber")
    public String getInsuredNumber() {
        return insuredNumber;
    }

    public void setInsuredNumber(String insuredNumber) {
        this.insuredNumber = insuredNumber;
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
    @Column(name = "SHEBAD")
    public String getShebad() {
        return shebad;
    }

    public void setShebad(String shebad) {
        this.shebad = shebad;
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
