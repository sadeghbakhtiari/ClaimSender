package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(ServiceDetailesVoPK.class)
public class ServiceDetailesVo {
    private int sepasId;
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
    private Integer otherCostsQuantitiesFk;
    private Integer relativeCostRelativeCostFk;
    private Integer serviceProviderHealthcareProviderFk;
    private String pkid;
    private Double tCost;
    private Double dCost;
    private Double takmiliCost;
    private Double zaribFani;
    private Double zaribHerfei;
    private String terminology;
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
    @Column(name = "OtherCosts_QuantitiesFK")
    public Integer getOtherCostsQuantitiesFk() {
        return otherCostsQuantitiesFk;
    }

    public void setOtherCostsQuantitiesFk(Integer otherCostsQuantitiesFk) {
        this.otherCostsQuantitiesFk = otherCostsQuantitiesFk;
    }

    @Basic
    @Column(name = "RelativeCost_RelativeCostFK")
    public Integer getRelativeCostRelativeCostFk() {
        return relativeCostRelativeCostFk;
    }

    public void setRelativeCostRelativeCostFk(Integer relativeCostRelativeCostFk) {
        this.relativeCostRelativeCostFk = relativeCostRelativeCostFk;
    }

    @Basic
    @Column(name = "ServiceProvider_HealthcareProviderFK")
    public Integer getServiceProviderHealthcareProviderFk() {
        return serviceProviderHealthcareProviderFk;
    }

    public void setServiceProviderHealthcareProviderFk(Integer serviceProviderHealthcareProviderFk) {
        this.serviceProviderHealthcareProviderFk = serviceProviderHealthcareProviderFk;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceDetailesVo that = (ServiceDetailesVo) o;

        if (sepasId != that.sepasId) return false;
        if (id != that.id) return false;
        if (basicInsuranceContribution != null ? !basicInsuranceContribution.equals(that.basicInsuranceContribution) : that.basicInsuranceContribution != null)
            return false;
        if (patientContribution != null ? !patientContribution.equals(that.patientContribution) : that.patientContribution != null)
            return false;
        if (totalCharge != null ? !totalCharge.equals(that.totalCharge) : that.totalCharge != null) return false;
        if (bed != null ? !bed.equals(that.bed) : that.bed != null) return false;
        if (room != null ? !room.equals(that.room) : that.room != null) return false;
        if (startYear != null ? !startYear.equals(that.startYear) : that.startYear != null) return false;
        if (startMonth != null ? !startMonth.equals(that.startMonth) : that.startMonth != null) return false;
        if (startDay != null ? !startDay.equals(that.startDay) : that.startDay != null) return false;
        if (startHour != null ? !startHour.equals(that.startHour) : that.startHour != null) return false;
        if (startMinute != null ? !startMinute.equals(that.startMinute) : that.startMinute != null) return false;
        if (startSecond != null ? !startSecond.equals(that.startSecond) : that.startSecond != null) return false;
        if (endYear != null ? !endYear.equals(that.endYear) : that.endYear != null) return false;
        if (endMonth != null ? !endMonth.equals(that.endMonth) : that.endMonth != null) return false;
        if (endDay != null ? !endDay.equals(that.endDay) : that.endDay != null) return false;
        if (endHour != null ? !endHour.equals(that.endHour) : that.endHour != null) return false;
        if (endMinute != null ? !endMinute.equals(that.endMinute) : that.endMinute != null) return false;
        if (endSecond != null ? !endSecond.equals(that.endSecond) : that.endSecond != null) return false;
        if (serviceCode != null ? !serviceCode.equals(that.serviceCode) : that.serviceCode != null) return false;
        if (serviceTerminology != null ? !serviceTerminology.equals(that.serviceTerminology) : that.serviceTerminology != null)
            return false;
        if (serviceCountMagnitude != null ? !serviceCountMagnitude.equals(that.serviceCountMagnitude) : that.serviceCountMagnitude != null)
            return false;
        if (serviceCount != null ? !serviceCount.equals(that.serviceCount) : that.serviceCount != null) return false;
        if (serviceType != null ? !serviceType.equals(that.serviceType) : that.serviceType != null) return false;
        if (serviceTitle != null ? !serviceTitle.equals(that.serviceTitle) : that.serviceTitle != null) return false;
        if (wardName != null ? !wardName.equals(that.wardName) : that.wardName != null) return false;
        if (wardType != null ? !wardType.equals(that.wardType) : that.wardType != null) return false;
        if (otherCostsQuantitiesFk != null ? !otherCostsQuantitiesFk.equals(that.otherCostsQuantitiesFk) : that.otherCostsQuantitiesFk != null)
            return false;
        if (relativeCostRelativeCostFk != null ? !relativeCostRelativeCostFk.equals(that.relativeCostRelativeCostFk) : that.relativeCostRelativeCostFk != null)
            return false;
        if (serviceProviderHealthcareProviderFk != null ? !serviceProviderHealthcareProviderFk.equals(that.serviceProviderHealthcareProviderFk) : that.serviceProviderHealthcareProviderFk != null)
            return false;
        if (pkid != null ? !pkid.equals(that.pkid) : that.pkid != null) return false;
        if (tCost != null ? !tCost.equals(that.tCost) : that.tCost != null) return false;
        if (dCost != null ? !dCost.equals(that.dCost) : that.dCost != null) return false;
        if (takmiliCost != null ? !takmiliCost.equals(that.takmiliCost) : that.takmiliCost != null) return false;
        if (zaribFani != null ? !zaribFani.equals(that.zaribFani) : that.zaribFani != null) return false;
        if (zaribHerfei != null ? !zaribHerfei.equals(that.zaribHerfei) : that.zaribHerfei != null) return false;
        if (terminology != null ? !terminology.equals(that.terminology) : that.terminology != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + id;
        result = 31 * result + (basicInsuranceContribution != null ? basicInsuranceContribution.hashCode() : 0);
        result = 31 * result + (patientContribution != null ? patientContribution.hashCode() : 0);
        result = 31 * result + (totalCharge != null ? totalCharge.hashCode() : 0);
        result = 31 * result + (bed != null ? bed.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (startYear != null ? startYear.hashCode() : 0);
        result = 31 * result + (startMonth != null ? startMonth.hashCode() : 0);
        result = 31 * result + (startDay != null ? startDay.hashCode() : 0);
        result = 31 * result + (startHour != null ? startHour.hashCode() : 0);
        result = 31 * result + (startMinute != null ? startMinute.hashCode() : 0);
        result = 31 * result + (startSecond != null ? startSecond.hashCode() : 0);
        result = 31 * result + (endYear != null ? endYear.hashCode() : 0);
        result = 31 * result + (endMonth != null ? endMonth.hashCode() : 0);
        result = 31 * result + (endDay != null ? endDay.hashCode() : 0);
        result = 31 * result + (endHour != null ? endHour.hashCode() : 0);
        result = 31 * result + (endMinute != null ? endMinute.hashCode() : 0);
        result = 31 * result + (endSecond != null ? endSecond.hashCode() : 0);
        result = 31 * result + (serviceCode != null ? serviceCode.hashCode() : 0);
        result = 31 * result + (serviceTerminology != null ? serviceTerminology.hashCode() : 0);
        result = 31 * result + (serviceCountMagnitude != null ? serviceCountMagnitude.hashCode() : 0);
        result = 31 * result + (serviceCount != null ? serviceCount.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        result = 31 * result + (serviceTitle != null ? serviceTitle.hashCode() : 0);
        result = 31 * result + (wardName != null ? wardName.hashCode() : 0);
        result = 31 * result + (wardType != null ? wardType.hashCode() : 0);
        result = 31 * result + (otherCostsQuantitiesFk != null ? otherCostsQuantitiesFk.hashCode() : 0);
        result = 31 * result + (relativeCostRelativeCostFk != null ? relativeCostRelativeCostFk.hashCode() : 0);
        result = 31 * result + (serviceProviderHealthcareProviderFk != null ? serviceProviderHealthcareProviderFk.hashCode() : 0);
        result = 31 * result + (pkid != null ? pkid.hashCode() : 0);
        result = 31 * result + (tCost != null ? tCost.hashCode() : 0);
        result = 31 * result + (dCost != null ? dCost.hashCode() : 0);
        result = 31 * result + (takmiliCost != null ? takmiliCost.hashCode() : 0);
        result = 31 * result + (zaribFani != null ? zaribFani.hashCode() : 0);
        result = 31 * result + (zaribHerfei != null ? zaribHerfei.hashCode() : 0);
        result = 31 * result + (terminology != null ? terminology.hashCode() : 0);
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
