package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "AdmissionVO")
public class AdmissionVo {
    private Integer sepasId;
    private Integer admissionYear;
    private Integer admissionMonth;
    private Integer admissionDay;
    private Integer admissionHour;
    private Integer admissionMinute;
    private Integer admissionSecond;
    private String admissionTypeCode;
    private HealthcareProviderVo attendingDoctor;
    private HealthcareProviderVo admittingDoctor;
    private HealthcareProviderVo referringDoctor;
    private String medicalRecordNumber;
    private String reasonForEncounterCode;
    private OrganizationVo organizationVo;
    private HospitalWardVo hospitalWardVo;
    private String emsId;
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
    public HealthcareProviderVo getAttendingDoctor() {
        return attendingDoctor;
    }

    public void setAttendingDoctor(HealthcareProviderVo attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    @Basic
    @Column(name = "AdmittingDoctor_HealthcareProviderFK")
    public HealthcareProviderVo getAdmittingDoctor() {
        return admittingDoctor;
    }

    public void setAdmittingDoctor(HealthcareProviderVo admittingDoctor) {
        this.admittingDoctor = admittingDoctor;
    }

    @Basic
    @Column(name = "ReferringDoctor_HealthcareProviderFK")
    public HealthcareProviderVo getReferringDoctor() {
        return referringDoctor;
    }

    public void setReferringDoctor(HealthcareProviderVo referringDoctor) {
        this.referringDoctor = referringDoctor;
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
    public OrganizationVo getOrganizationVo() {
        return organizationVo;
    }

    public void setOrganizationVo(OrganizationVo organizationVo) {
        this.organizationVo = organizationVo;
    }

    @Basic
    @Column(name = "AdmissionWard_HospitalWardVOFK")
    public HospitalWardVo getAdmissionWardHospitalWardVofk() {
        return hospitalWardVo;
    }

    public void setAdmissionWardHospitalWardVofk(HospitalWardVo hospitalWardVo) {
        this.hospitalWardVo = hospitalWardVo;
    }

    @Basic
    @Column(name = "EMSID")
    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId;
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
