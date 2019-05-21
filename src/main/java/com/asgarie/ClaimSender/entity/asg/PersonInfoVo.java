package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "PersonInfoVO")
public class PersonInfoVo {
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

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "FullName")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "MaritalStatusCode")
    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    @Basic
    @Column(name = "NationalityCode")
    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    @Basic
    @Column(name = "BirthYear")
    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @Basic
    @Column(name = "BirthMonth")
    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    @Basic
    @Column(name = "BirthDay")
    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    @Basic
    @Column(name = "BirthHour")
    public Integer getBirthHour() {
        return birthHour;
    }

    public void setBirthHour(Integer birthHour) {
        this.birthHour = birthHour;
    }

    @Basic
    @Column(name = "BirthMinute")
    public Integer getBirthMinute() {
        return birthMinute;
    }

    public void setBirthMinute(Integer birthMinute) {
        this.birthMinute = birthMinute;
    }

    @Basic
    @Column(name = "BirthSecond")
    public Integer getBirthSecond() {
        return birthSecond;
    }

    public void setBirthSecond(Integer birthSecond) {
        this.birthSecond = birthSecond;
    }

    @Basic
    @Column(name = "BirthDateAccuracyCode")
    public String getBirthDateAccuracyCode() {
        return birthDateAccuracyCode;
    }

    public void setBirthDateAccuracyCode(String birthDateAccuracyCode) {
        this.birthDateAccuracyCode = birthDateAccuracyCode;
    }

    @Basic
    @Column(name = "Father_FirstName")
    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    @Basic
    @Column(name = "Father_LastName")
    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    @Basic
    @Column(name = "Mother_FirstName")
    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    @Basic
    @Column(name = "Mother_LastName")
    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    @Basic
    @Column(name = "FullAddress")
    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Basic
    @Column(name = "IDCardNumber")
    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    @Basic
    @Column(name = "NationalCode")
    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Basic
    @Column(name = "PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "GenderCode")
    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    @Basic
    @Column(name = "HomeTel")
    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    @Basic
    @Column(name = "MobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "EducationLevelCode")
    public String getEducationLevelCode() {
        return educationLevelCode;
    }

    public void setEducationLevelCode(String educationLevelCode) {
        this.educationLevelCode = educationLevelCode;
    }

    @Basic
    @Column(name = "JobCode")
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    @Basic
    @Column(name = "JobDescription")
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Basic
    @Column(name = "LivingPlaceArea_HighLevelAreaVOFK")
    public Integer getLivingPlaceAreaHighLevelAreaVofk() {
        return livingPlaceAreaHighLevelAreaVofk;
    }

    public void setLivingPlaceAreaHighLevelAreaVofk(Integer livingPlaceAreaHighLevelAreaVofk) {
        this.livingPlaceAreaHighLevelAreaVofk = livingPlaceAreaHighLevelAreaVofk;
    }

    @Basic
    @Column(name = "BirthPlaceArea_HighLevelAreaVOFK")
    public Integer getBirthPlaceAreaHighLevelAreaVofk() {
        return birthPlaceAreaHighLevelAreaVofk;
    }

    public void setBirthPlaceAreaHighLevelAreaVofk(Integer birthPlaceAreaHighLevelAreaVofk) {
        this.birthPlaceAreaHighLevelAreaVofk = birthPlaceAreaHighLevelAreaVofk;
    }

    @Basic
    @Column(name = "IDIssuePlaceArea_HighLevelAreaVOFK")
    public Integer getIdIssuePlaceAreaHighLevelAreaVofk() {
        return idIssuePlaceAreaHighLevelAreaVofk;
    }

    public void setIdIssuePlaceAreaHighLevelAreaVofk(Integer idIssuePlaceAreaHighLevelAreaVofk) {
        this.idIssuePlaceAreaHighLevelAreaVofk = idIssuePlaceAreaHighLevelAreaVofk;
    }

    @Basic
    @Column(name = "ReligionCode")
    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }

    @Basic
    @Column(name = "OtherIdentifiersFK")
    public Integer getOtherIdentifiersFk() {
        return otherIdentifiersFk;
    }

    public void setOtherIdentifiersFk(Integer otherIdentifiersFk) {
        this.otherIdentifiersFk = otherIdentifiersFk;
    }

    @OneToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
