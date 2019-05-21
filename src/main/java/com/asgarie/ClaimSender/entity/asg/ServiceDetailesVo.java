package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "ServiceDetailesVo")
public class ServiceDetailesVo {
    private Integer sepasId;
    private int id;
    private Double basicInsuranceContribution;
    private Double patientContribution;
    private Double totalCharge;
    private String bed;
    private String room;
    private Integer startYear;
    private Integer startMonth;
    private Integer startDay;
    private Integer startHour;
    private Integer startMinute;
    private Integer startSecond;
    private Integer endYear;
    private Integer endMonth;
    private Integer endDay;
    private Integer endHour;
    private Integer endMinute;
    private Integer endSecond;
    private String serviceCode;
    private String serviceTerminology;
    private Double serviceCountMagnitude;
    private String serviceCount;
    private Float serviceType;
    private String serviceTitle;
    private String wardName;
    private String wardType;
    private String pkid;
    private Double tCost;
    private Double dCost;
    private Double takmiliCost;
    private Double zaribFani;
    private Double zaribHerfei;
    private String terminology;
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
    @Column(name = "BasicInsuranceContribution")
    public Double getBasicInsuranceContribution() {
        return basicInsuranceContribution;
    }

    public void setBasicInsuranceContribution(Double basicInsuranceContribution) {
        this.basicInsuranceContribution = basicInsuranceContribution;
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
    @Column(name = "TotalCharge")
    public Double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Double totalCharge) {
        this.totalCharge = totalCharge;
    }

    @Basic
    @Column(name = "Bed")
    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    @Basic
    @Column(name = "Room")
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "StartYear")
    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    @Basic
    @Column(name = "StartMonth")
    public Integer getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
    }

    @Basic
    @Column(name = "StartDay")
    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    @Basic
    @Column(name = "StartHour")
    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    @Basic
    @Column(name = "StartMinute")
    public Integer getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
    }

    @Basic
    @Column(name = "StartSecond")
    public Integer getStartSecond() {
        return startSecond;
    }

    public void setStartSecond(Integer startSecond) {
        this.startSecond = startSecond;
    }

    @Basic
    @Column(name = "EndYear")
    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    @Basic
    @Column(name = "EndMonth")
    public Integer getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(Integer endMonth) {
        this.endMonth = endMonth;
    }

    @Basic
    @Column(name = "EndDay")
    public Integer getEndDay() {
        return endDay;
    }

    public void setEndDay(Integer endDay) {
        this.endDay = endDay;
    }

    @Basic
    @Column(name = "EndHour")
    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    @Basic
    @Column(name = "EndMinute")
    public Integer getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(Integer endMinute) {
        this.endMinute = endMinute;
    }

    @Basic
    @Column(name = "EndSecond")
    public Integer getEndSecond() {
        return endSecond;
    }

    public void setEndSecond(Integer endSecond) {
        this.endSecond = endSecond;
    }

    @Basic
    @Column(name = "ServiceCode")
    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Basic
    @Column(name = "ServiceTerminology")
    public String getServiceTerminology() {
        return serviceTerminology;
    }

    public void setServiceTerminology(String serviceTerminology) {
        this.serviceTerminology = serviceTerminology;
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
    @Column(name = "ServiceType")
    public Float getServiceType() {
        return serviceType;
    }

    public void setServiceType(Float serviceType) {
        this.serviceType = serviceType;
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
    @Column(name = "WardName")
    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    @Basic
    @Column(name = "WardType")
    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    @Basic
    @Column(name = "PKID")
    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
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

    @Basic
    @Column(name = "ZaribFani")
    public Double getZaribFani() {
        return zaribFani;
    }

    public void setZaribFani(Double zaribFani) {
        this.zaribFani = zaribFani;
    }

    @Basic
    @Column(name = "ZaribHerfei")
    public Double getZaribHerfei() {
        return zaribHerfei;
    }

    public void setZaribHerfei(Double zaribHerfei) {
        this.zaribHerfei = zaribHerfei;
    }

    @Basic
    @Column(name = "Terminology")
    public String getTerminology() {
        return terminology;
    }

    public void setTerminology(String terminology) {
        this.terminology = terminology;
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
