package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "PersonInfoVO")
public class PersonInfoVo {
    private int sepasId;
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
    private PatientTransfer patientTransferBySepasId;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonInfoVo that = (PersonInfoVo) o;

        if (sepasId != that.sepasId) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (maritalStatusCode != null ? !maritalStatusCode.equals(that.maritalStatusCode) : that.maritalStatusCode != null)
            return false;
        if (nationalityCode != null ? !nationalityCode.equals(that.nationalityCode) : that.nationalityCode != null)
            return false;
        if (birthYear != null ? !birthYear.equals(that.birthYear) : that.birthYear != null) return false;
        if (birthMonth != null ? !birthMonth.equals(that.birthMonth) : that.birthMonth != null) return false;
        if (birthDay != null ? !birthDay.equals(that.birthDay) : that.birthDay != null) return false;
        if (birthHour != null ? !birthHour.equals(that.birthHour) : that.birthHour != null) return false;
        if (birthMinute != null ? !birthMinute.equals(that.birthMinute) : that.birthMinute != null) return false;
        if (birthSecond != null ? !birthSecond.equals(that.birthSecond) : that.birthSecond != null) return false;
        if (birthDateAccuracyCode != null ? !birthDateAccuracyCode.equals(that.birthDateAccuracyCode) : that.birthDateAccuracyCode != null)
            return false;
        if (fatherFirstName != null ? !fatherFirstName.equals(that.fatherFirstName) : that.fatherFirstName != null)
            return false;
        if (fatherLastName != null ? !fatherLastName.equals(that.fatherLastName) : that.fatherLastName != null)
            return false;
        if (motherFirstName != null ? !motherFirstName.equals(that.motherFirstName) : that.motherFirstName != null)
            return false;
        if (motherLastName != null ? !motherLastName.equals(that.motherLastName) : that.motherLastName != null)
            return false;
        if (fullAddress != null ? !fullAddress.equals(that.fullAddress) : that.fullAddress != null) return false;
        if (idCardNumber != null ? !idCardNumber.equals(that.idCardNumber) : that.idCardNumber != null) return false;
        if (nationalCode != null ? !nationalCode.equals(that.nationalCode) : that.nationalCode != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (genderCode != null ? !genderCode.equals(that.genderCode) : that.genderCode != null) return false;
        if (homeTel != null ? !homeTel.equals(that.homeTel) : that.homeTel != null) return false;
        if (mobileNumber != null ? !mobileNumber.equals(that.mobileNumber) : that.mobileNumber != null) return false;
        if (educationLevelCode != null ? !educationLevelCode.equals(that.educationLevelCode) : that.educationLevelCode != null)
            return false;
        if (jobCode != null ? !jobCode.equals(that.jobCode) : that.jobCode != null) return false;
        if (jobDescription != null ? !jobDescription.equals(that.jobDescription) : that.jobDescription != null)
            return false;
        if (livingPlaceAreaHighLevelAreaVofk != null ? !livingPlaceAreaHighLevelAreaVofk.equals(that.livingPlaceAreaHighLevelAreaVofk) : that.livingPlaceAreaHighLevelAreaVofk != null)
            return false;
        if (birthPlaceAreaHighLevelAreaVofk != null ? !birthPlaceAreaHighLevelAreaVofk.equals(that.birthPlaceAreaHighLevelAreaVofk) : that.birthPlaceAreaHighLevelAreaVofk != null)
            return false;
        if (idIssuePlaceAreaHighLevelAreaVofk != null ? !idIssuePlaceAreaHighLevelAreaVofk.equals(that.idIssuePlaceAreaHighLevelAreaVofk) : that.idIssuePlaceAreaHighLevelAreaVofk != null)
            return false;
        if (religionCode != null ? !religionCode.equals(that.religionCode) : that.religionCode != null) return false;
        if (otherIdentifiersFk != null ? !otherIdentifiersFk.equals(that.otherIdentifiersFk) : that.otherIdentifiersFk != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (maritalStatusCode != null ? maritalStatusCode.hashCode() : 0);
        result = 31 * result + (nationalityCode != null ? nationalityCode.hashCode() : 0);
        result = 31 * result + (birthYear != null ? birthYear.hashCode() : 0);
        result = 31 * result + (birthMonth != null ? birthMonth.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 31 * result + (birthHour != null ? birthHour.hashCode() : 0);
        result = 31 * result + (birthMinute != null ? birthMinute.hashCode() : 0);
        result = 31 * result + (birthSecond != null ? birthSecond.hashCode() : 0);
        result = 31 * result + (birthDateAccuracyCode != null ? birthDateAccuracyCode.hashCode() : 0);
        result = 31 * result + (fatherFirstName != null ? fatherFirstName.hashCode() : 0);
        result = 31 * result + (fatherLastName != null ? fatherLastName.hashCode() : 0);
        result = 31 * result + (motherFirstName != null ? motherFirstName.hashCode() : 0);
        result = 31 * result + (motherLastName != null ? motherLastName.hashCode() : 0);
        result = 31 * result + (fullAddress != null ? fullAddress.hashCode() : 0);
        result = 31 * result + (idCardNumber != null ? idCardNumber.hashCode() : 0);
        result = 31 * result + (nationalCode != null ? nationalCode.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (genderCode != null ? genderCode.hashCode() : 0);
        result = 31 * result + (homeTel != null ? homeTel.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (educationLevelCode != null ? educationLevelCode.hashCode() : 0);
        result = 31 * result + (jobCode != null ? jobCode.hashCode() : 0);
        result = 31 * result + (jobDescription != null ? jobDescription.hashCode() : 0);
        result = 31 * result + (livingPlaceAreaHighLevelAreaVofk != null ? livingPlaceAreaHighLevelAreaVofk.hashCode() : 0);
        result = 31 * result + (birthPlaceAreaHighLevelAreaVofk != null ? birthPlaceAreaHighLevelAreaVofk.hashCode() : 0);
        result = 31 * result + (idIssuePlaceAreaHighLevelAreaVofk != null ? idIssuePlaceAreaHighLevelAreaVofk.hashCode() : 0);
        result = 31 * result + (religionCode != null ? religionCode.hashCode() : 0);
        result = 31 * result + (otherIdentifiersFk != null ? otherIdentifiersFk.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransferBySepasId() {
        return patientTransferBySepasId;
    }

    public void setPatientTransferBySepasId(PatientTransfer patientTransferBySepasId) {
        this.patientTransferBySepasId = patientTransferBySepasId;
    }
}
