package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class AdmissionVo implements Serializable {
    private Integer sepasId;
    private Integer admissionYear;
    private Integer admissionMonth;
    private Integer admissionDay;
    private Integer admissionHour;
    private Integer admissionMinute;
    private Integer admissionSecond;
    private String admissionTypeCode;
    private Integer attendingDoctorId;
    private Integer admittingDoctorId;
    private Integer referringDoctorId;
    private String medicalRecordNumber;
    private String reasonForEncounterCode;
    private Integer organizationVoId;
    private Integer hospitalWardVoId;
    private String emsId;
    private Integer patientTransferId;

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public Integer getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(Integer admissionYear) {
        this.admissionYear = admissionYear;
    }

    public Integer getAdmissionMonth() {
        return admissionMonth;
    }

    public void setAdmissionMonth(Integer admissionMonth) {
        this.admissionMonth = admissionMonth;
    }

    public Integer getAdmissionDay() {
        return admissionDay;
    }

    public void setAdmissionDay(Integer admissionDay) {
        this.admissionDay = admissionDay;
    }

    public Integer getAdmissionHour() {
        return admissionHour;
    }

    public void setAdmissionHour(Integer admissionHour) {
        this.admissionHour = admissionHour;
    }

    public Integer getAdmissionMinute() {
        return admissionMinute;
    }

    public void setAdmissionMinute(Integer admissionMinute) {
        this.admissionMinute = admissionMinute;
    }

    public Integer getAdmissionSecond() {
        return admissionSecond;
    }

    public void setAdmissionSecond(Integer admissionSecond) {
        this.admissionSecond = admissionSecond;
    }

    public String getAdmissionTypeCode() {
        return admissionTypeCode;
    }

    public void setAdmissionTypeCode(String admissionTypeCode) {
        this.admissionTypeCode = admissionTypeCode;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getReasonForEncounterCode() {
        return reasonForEncounterCode;
    }

    public void setReasonForEncounterCode(String reasonForEncounterCode) {
        this.reasonForEncounterCode = reasonForEncounterCode;
    }

    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId;
    }

    public Integer getAttendingDoctorId() {
        return attendingDoctorId;
    }

    public void setAttendingDoctorId(Integer attendingDoctorId) {
        this.attendingDoctorId = attendingDoctorId;
    }

    public Integer getAdmittingDoctorId() {
        return admittingDoctorId;
    }

    public void setAdmittingDoctorId(Integer admittingDoctorId) {
        this.admittingDoctorId = admittingDoctorId;
    }

    public Integer getReferringDoctorId() {
        return referringDoctorId;
    }

    public void setReferringDoctorId(Integer referringDoctorId) {
        this.referringDoctorId = referringDoctorId;
    }

    public Integer getOrganizationVoId() {
        return organizationVoId;
    }

    public void setOrganizationVoId(Integer organizationVoId) {
        this.organizationVoId = organizationVoId;
    }

    public Integer getHospitalWardVoId() {
        return hospitalWardVoId;
    }

    public void setHospitalWardVoId(Integer hospitalWardVoId) {
        this.hospitalWardVoId = hospitalWardVoId;
    }

    public Integer getPatientTransferId() {
        return patientTransferId;
    }

    public void setPatientTransferId(Integer patientTransferId) {
        this.patientTransferId = patientTransferId;
    }

    @Override
    public String toString() {
        return "AdmissionVo{" +
                "sepasId=" + sepasId +
                ", admissionYear=" + admissionYear +
                ", admissionMonth=" + admissionMonth +
                ", admissionDay=" + admissionDay +
                ", admissionHour=" + admissionHour +
                ", admissionMinute=" + admissionMinute +
                ", admissionSecond=" + admissionSecond +
                ", admissionTypeCode='" + admissionTypeCode + '\'' +
                ", attendingDoctorId=" + attendingDoctorId +
                ", admittingDoctorId=" + admittingDoctorId +
                ", referringDoctorId=" + referringDoctorId +
                ", medicalRecordNumber='" + medicalRecordNumber + '\'' +
                ", reasonForEncounterCode='" + reasonForEncounterCode + '\'' +
                ", organizationVoId=" + organizationVoId +
                ", hospitalWardVoId=" + hospitalWardVoId +
                ", emsId='" + emsId + '\'' +
                ", patientTransferId=" + patientTransferId +
                '}';
    }
}
