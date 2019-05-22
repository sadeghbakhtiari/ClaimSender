package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class ServiceDetailesVo implements Serializable {
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

    public Double getBasicInsuranceContribution() {
        return basicInsuranceContribution;
    }

    public void setBasicInsuranceContribution(Double basicInsuranceContribution) {
        this.basicInsuranceContribution = basicInsuranceContribution;
    }

    public Double getPatientContribution() {
        return patientContribution;
    }

    public void setPatientContribution(Double patientContribution) {
        this.patientContribution = patientContribution;
    }

    public Double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public Integer getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
    }

    public Integer getStartSecond() {
        return startSecond;
    }

    public void setStartSecond(Integer startSecond) {
        this.startSecond = startSecond;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(Integer endMonth) {
        this.endMonth = endMonth;
    }

    public Integer getEndDay() {
        return endDay;
    }

    public void setEndDay(Integer endDay) {
        this.endDay = endDay;
    }

    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    public Integer getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(Integer endMinute) {
        this.endMinute = endMinute;
    }

    public Integer getEndSecond() {
        return endSecond;
    }

    public void setEndSecond(Integer endSecond) {
        this.endSecond = endSecond;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceTerminology() {
        return serviceTerminology;
    }

    public void setServiceTerminology(String serviceTerminology) {
        this.serviceTerminology = serviceTerminology;
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

    public Float getServiceType() {
        return serviceType;
    }

    public void setServiceType(Float serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
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

    public Double getZaribFani() {
        return zaribFani;
    }

    public void setZaribFani(Double zaribFani) {
        this.zaribFani = zaribFani;
    }

    public Double getZaribHerfei() {
        return zaribHerfei;
    }

    public void setZaribHerfei(Double zaribHerfei) {
        this.zaribHerfei = zaribHerfei;
    }

    public String getTerminology() {
        return terminology;
    }

    public void setTerminology(String terminology) {
        this.terminology = terminology;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
