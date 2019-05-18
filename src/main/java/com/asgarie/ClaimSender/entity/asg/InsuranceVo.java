package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(InsuranceVoPK.class)
public class InsuranceVo {
    private int sepasId;
    private int id;
    private String insuranceBookletSerialNumber;
    private Integer insuranceExpirationYear;
    private Integer insuranceExpirationMonth;
    private Integer insuranceExpirationDay;
    private String insuranceBoxCode;
    private String insuredNumber;
    private String insurerCode;
    private String shebad;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsuranceVo that = (InsuranceVo) o;

        if (sepasId != that.sepasId) return false;
        if (id != that.id) return false;
        if (insuranceBookletSerialNumber != null ? !insuranceBookletSerialNumber.equals(that.insuranceBookletSerialNumber) : that.insuranceBookletSerialNumber != null)
            return false;
        if (insuranceExpirationYear != null ? !insuranceExpirationYear.equals(that.insuranceExpirationYear) : that.insuranceExpirationYear != null)
            return false;
        if (insuranceExpirationMonth != null ? !insuranceExpirationMonth.equals(that.insuranceExpirationMonth) : that.insuranceExpirationMonth != null)
            return false;
        if (insuranceExpirationDay != null ? !insuranceExpirationDay.equals(that.insuranceExpirationDay) : that.insuranceExpirationDay != null)
            return false;
        if (insuranceBoxCode != null ? !insuranceBoxCode.equals(that.insuranceBoxCode) : that.insuranceBoxCode != null)
            return false;
        if (insuredNumber != null ? !insuredNumber.equals(that.insuredNumber) : that.insuredNumber != null)
            return false;
        if (insurerCode != null ? !insurerCode.equals(that.insurerCode) : that.insurerCode != null) return false;
        if (shebad != null ? !shebad.equals(that.shebad) : that.shebad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + id;
        result = 31 * result + (insuranceBookletSerialNumber != null ? insuranceBookletSerialNumber.hashCode() : 0);
        result = 31 * result + (insuranceExpirationYear != null ? insuranceExpirationYear.hashCode() : 0);
        result = 31 * result + (insuranceExpirationMonth != null ? insuranceExpirationMonth.hashCode() : 0);
        result = 31 * result + (insuranceExpirationDay != null ? insuranceExpirationDay.hashCode() : 0);
        result = 31 * result + (insuranceBoxCode != null ? insuranceBoxCode.hashCode() : 0);
        result = 31 * result + (insuredNumber != null ? insuredNumber.hashCode() : 0);
        result = 31 * result + (insurerCode != null ? insurerCode.hashCode() : 0);
        result = 31 * result + (shebad != null ? shebad.hashCode() : 0);
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
