package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "AdmissionVO")
public class AdmissionVo {
    private int sepasId;
    private Integer admissionYear;
    private Integer admissionMonth;
    private Integer admissionDay;
    private Integer admissionHour;
    private Integer admissionMinute;
    private Integer admissionSecond;
    private String admissionTypeCode;
    private Integer attendingDoctorHealthcareProviderFk;
    private Integer admittingDoctorHealthcareProviderFk;
    private Integer referringDoctorHealthcareProviderFk;
    private String medicalRecordNumber;
    private String reasonForEncounterCode;
    private Integer instituteOrganizationVofk;
    private Integer admissionWardHospitalWardVofk;
    private String emsid;
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
    @Column(name = "AdmissionYear")
    public Integer getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(Integer admissionYear) {
        this.admissionYear = admissionYear;
    }

    @Basic
    @Column(name = "AdmissionMonth")
    public Integer getAdmissionMonth() {
        return admissionMonth;
    }

    public void setAdmissionMonth(Integer admissionMonth) {
        this.admissionMonth = admissionMonth;
    }

    @Basic
    @Column(name = "AdmissionDay")
    public Integer getAdmissionDay() {
        return admissionDay;
    }

    public void setAdmissionDay(Integer admissionDay) {
        this.admissionDay = admissionDay;
    }

    @Basic
    @Column(name = "AdmissionHour")
    public Integer getAdmissionHour() {
        return admissionHour;
    }

    public void setAdmissionHour(Integer admissionHour) {
        this.admissionHour = admissionHour;
    }

    @Basic
    @Column(name = "AdmissionMinute")
    public Integer getAdmissionMinute() {
        return admissionMinute;
    }

    public void setAdmissionMinute(Integer admissionMinute) {
        this.admissionMinute = admissionMinute;
    }

    @Basic
    @Column(name = "AdmissionSecond")
    public Integer getAdmissionSecond() {
        return admissionSecond;
    }

    public void setAdmissionSecond(Integer admissionSecond) {
        this.admissionSecond = admissionSecond;
    }

    @Basic
    @Column(name = "AdmissionTypeCode")
    public String getAdmissionTypeCode() {
        return admissionTypeCode;
    }

    public void setAdmissionTypeCode(String admissionTypeCode) {
        this.admissionTypeCode = admissionTypeCode;
    }

    @Basic
    @Column(name = "AttendingDoctor_HealthcareProviderFK")
    public Integer getAttendingDoctorHealthcareProviderFk() {
        return attendingDoctorHealthcareProviderFk;
    }

    public void setAttendingDoctorHealthcareProviderFk(Integer attendingDoctorHealthcareProviderFk) {
        this.attendingDoctorHealthcareProviderFk = attendingDoctorHealthcareProviderFk;
    }

    @Basic
    @Column(name = "AdmittingDoctor_HealthcareProviderFK")
    public Integer getAdmittingDoctorHealthcareProviderFk() {
        return admittingDoctorHealthcareProviderFk;
    }

    public void setAdmittingDoctorHealthcareProviderFk(Integer admittingDoctorHealthcareProviderFk) {
        this.admittingDoctorHealthcareProviderFk = admittingDoctorHealthcareProviderFk;
    }

    @Basic
    @Column(name = "ReferringDoctor_HealthcareProviderFK")
    public Integer getReferringDoctorHealthcareProviderFk() {
        return referringDoctorHealthcareProviderFk;
    }

    public void setReferringDoctorHealthcareProviderFk(Integer referringDoctorHealthcareProviderFk) {
        this.referringDoctorHealthcareProviderFk = referringDoctorHealthcareProviderFk;
    }

    @Basic
    @Column(name = "MedicalRecordNumber")
    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    @Basic
    @Column(name = "ReasonForEncounterCode")
    public String getReasonForEncounterCode() {
        return reasonForEncounterCode;
    }

    public void setReasonForEncounterCode(String reasonForEncounterCode) {
        this.reasonForEncounterCode = reasonForEncounterCode;
    }

    @Basic
    @Column(name = "Institute_OrganizationVOFK")
    public Integer getInstituteOrganizationVofk() {
        return instituteOrganizationVofk;
    }

    public void setInstituteOrganizationVofk(Integer instituteOrganizationVofk) {
        this.instituteOrganizationVofk = instituteOrganizationVofk;
    }

    @Basic
    @Column(name = "AdmissionWard_HospitalWardVOFK")
    public Integer getAdmissionWardHospitalWardVofk() {
        return admissionWardHospitalWardVofk;
    }

    public void setAdmissionWardHospitalWardVofk(Integer admissionWardHospitalWardVofk) {
        this.admissionWardHospitalWardVofk = admissionWardHospitalWardVofk;
    }

    @Basic
    @Column(name = "EMSID")
    public String getEmsid() {
        return emsid;
    }

    public void setEmsid(String emsid) {
        this.emsid = emsid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdmissionVo that = (AdmissionVo) o;

        if (sepasId != that.sepasId) return false;
        if (admissionYear != null ? !admissionYear.equals(that.admissionYear) : that.admissionYear != null)
            return false;
        if (admissionMonth != null ? !admissionMonth.equals(that.admissionMonth) : that.admissionMonth != null)
            return false;
        if (admissionDay != null ? !admissionDay.equals(that.admissionDay) : that.admissionDay != null) return false;
        if (admissionHour != null ? !admissionHour.equals(that.admissionHour) : that.admissionHour != null)
            return false;
        if (admissionMinute != null ? !admissionMinute.equals(that.admissionMinute) : that.admissionMinute != null)
            return false;
        if (admissionSecond != null ? !admissionSecond.equals(that.admissionSecond) : that.admissionSecond != null)
            return false;
        if (admissionTypeCode != null ? !admissionTypeCode.equals(that.admissionTypeCode) : that.admissionTypeCode != null)
            return false;
        if (attendingDoctorHealthcareProviderFk != null ? !attendingDoctorHealthcareProviderFk.equals(that.attendingDoctorHealthcareProviderFk) : that.attendingDoctorHealthcareProviderFk != null)
            return false;
        if (admittingDoctorHealthcareProviderFk != null ? !admittingDoctorHealthcareProviderFk.equals(that.admittingDoctorHealthcareProviderFk) : that.admittingDoctorHealthcareProviderFk != null)
            return false;
        if (referringDoctorHealthcareProviderFk != null ? !referringDoctorHealthcareProviderFk.equals(that.referringDoctorHealthcareProviderFk) : that.referringDoctorHealthcareProviderFk != null)
            return false;
        if (medicalRecordNumber != null ? !medicalRecordNumber.equals(that.medicalRecordNumber) : that.medicalRecordNumber != null)
            return false;
        if (reasonForEncounterCode != null ? !reasonForEncounterCode.equals(that.reasonForEncounterCode) : that.reasonForEncounterCode != null)
            return false;
        if (instituteOrganizationVofk != null ? !instituteOrganizationVofk.equals(that.instituteOrganizationVofk) : that.instituteOrganizationVofk != null)
            return false;
        if (admissionWardHospitalWardVofk != null ? !admissionWardHospitalWardVofk.equals(that.admissionWardHospitalWardVofk) : that.admissionWardHospitalWardVofk != null)
            return false;
        if (emsid != null ? !emsid.equals(that.emsid) : that.emsid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + (admissionYear != null ? admissionYear.hashCode() : 0);
        result = 31 * result + (admissionMonth != null ? admissionMonth.hashCode() : 0);
        result = 31 * result + (admissionDay != null ? admissionDay.hashCode() : 0);
        result = 31 * result + (admissionHour != null ? admissionHour.hashCode() : 0);
        result = 31 * result + (admissionMinute != null ? admissionMinute.hashCode() : 0);
        result = 31 * result + (admissionSecond != null ? admissionSecond.hashCode() : 0);
        result = 31 * result + (admissionTypeCode != null ? admissionTypeCode.hashCode() : 0);
        result = 31 * result + (attendingDoctorHealthcareProviderFk != null ? attendingDoctorHealthcareProviderFk.hashCode() : 0);
        result = 31 * result + (admittingDoctorHealthcareProviderFk != null ? admittingDoctorHealthcareProviderFk.hashCode() : 0);
        result = 31 * result + (referringDoctorHealthcareProviderFk != null ? referringDoctorHealthcareProviderFk.hashCode() : 0);
        result = 31 * result + (medicalRecordNumber != null ? medicalRecordNumber.hashCode() : 0);
        result = 31 * result + (reasonForEncounterCode != null ? reasonForEncounterCode.hashCode() : 0);
        result = 31 * result + (instituteOrganizationVofk != null ? instituteOrganizationVofk.hashCode() : 0);
        result = 31 * result + (admissionWardHospitalWardVofk != null ? admissionWardHospitalWardVofk.hashCode() : 0);
        result = 31 * result + (emsid != null ? emsid.hashCode() : 0);
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
