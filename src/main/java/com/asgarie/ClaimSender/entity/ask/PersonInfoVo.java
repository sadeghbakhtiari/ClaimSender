package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class PersonInfoVo implements Serializable {
    private Integer sepasId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String maritalStatusCode;
    private String nationalityCode;
    private Integer birthYear;
    private Integer birthMonth;
    private Integer birthDay;
    private Integer birthHour;
    private Integer birthMinute;
    private Integer birthSecond;
    private String birthDateAccuracyCode;
    private String fatherFirstName;
    private String fatherLastName;
    private String motherFirstName;
    private String motherLastName;
    private String fullAddress;
    private String idCardNumber;
    private String nationalCode;
    private String postalCode;
    private String genderCode;
    private String homeTel;
    private String mobileNumber;
    private String educationLevelCode;
    private String jobCode;
    private String jobDescription;
    private Integer livingPlaceAreaHighLevelAreaVofk;
    private Integer birthPlaceAreaHighLevelAreaVofk;
    private Integer idIssuePlaceAreaHighLevelAreaVofk;
    private String religionCode;
    private Integer otherIdentifiersFk;
    private PatientTransfer patientTransfer;

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getBirthHour() {
        return birthHour;
    }

    public void setBirthHour(Integer birthHour) {
        this.birthHour = birthHour;
    }

    public Integer getBirthMinute() {
        return birthMinute;
    }

    public void setBirthMinute(Integer birthMinute) {
        this.birthMinute = birthMinute;
    }

    public Integer getBirthSecond() {
        return birthSecond;
    }

    public void setBirthSecond(Integer birthSecond) {
        this.birthSecond = birthSecond;
    }

    public String getBirthDateAccuracyCode() {
        return birthDateAccuracyCode;
    }

    public void setBirthDateAccuracyCode(String birthDateAccuracyCode) {
        this.birthDateAccuracyCode = birthDateAccuracyCode;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEducationLevelCode() {
        return educationLevelCode;
    }

    public void setEducationLevelCode(String educationLevelCode) {
        this.educationLevelCode = educationLevelCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Integer getLivingPlaceAreaHighLevelAreaVofk() {
        return livingPlaceAreaHighLevelAreaVofk;
    }

    public void setLivingPlaceAreaHighLevelAreaVofk(Integer livingPlaceAreaHighLevelAreaVofk) {
        this.livingPlaceAreaHighLevelAreaVofk = livingPlaceAreaHighLevelAreaVofk;
    }

    public Integer getBirthPlaceAreaHighLevelAreaVofk() {
        return birthPlaceAreaHighLevelAreaVofk;
    }

    public void setBirthPlaceAreaHighLevelAreaVofk(Integer birthPlaceAreaHighLevelAreaVofk) {
        this.birthPlaceAreaHighLevelAreaVofk = birthPlaceAreaHighLevelAreaVofk;
    }

    public Integer getIdIssuePlaceAreaHighLevelAreaVofk() {
        return idIssuePlaceAreaHighLevelAreaVofk;
    }

    public void setIdIssuePlaceAreaHighLevelAreaVofk(Integer idIssuePlaceAreaHighLevelAreaVofk) {
        this.idIssuePlaceAreaHighLevelAreaVofk = idIssuePlaceAreaHighLevelAreaVofk;
    }

    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }

    public Integer getOtherIdentifiersFk() {
        return otherIdentifiersFk;
    }

    public void setOtherIdentifiersFk(Integer otherIdentifiersFk) {
        this.otherIdentifiersFk = otherIdentifiersFk;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
