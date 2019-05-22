package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.List;

public class PatientTransfer implements Serializable {

    private Integer sepasId;
    private Integer parNo;
    private Integer bastaryNum;
    private String compositionUid;
    private String patientUid;
    private boolean send;
    private Integer status;
    private String kDate;
    private Timestamp kTime;
    private Short operNo;
    private String kDateSend;
    private Timestamp kTimeSend;
    private Integer admissionVoId;
    private Integer billSummaryVoId;
    private List<Integer> diagnosisVosIds;
    private Integer dischargeVoId;
    private List<Integer> healthcareProviderVosIdes;
    private Integer hospitalWardVoId;
    private List<Integer> insuranceVosIds;
    private Integer personInfoVoId;

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public Integer getParNo() {
        return parNo;
    }

    public void setParNo(Integer parNo) {
        this.parNo = parNo;
    }

    public Integer getBastaryNum() {
        return bastaryNum;
    }

    public void setBastaryNum(Integer bastaryNum) {
        this.bastaryNum = bastaryNum;
    }

    public String getCompositionUid() {
        return compositionUid;
    }

    public void setCompositionUid(String compositionUid) {
        this.compositionUid = compositionUid;
    }

    public String getPatientUid() {
        return patientUid;
    }

    public void setPatientUid(String patientUid) {
        this.patientUid = patientUid;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getkDate() {
        return kDate;
    }

    public void setkDate(String kDate) {
        this.kDate = kDate;
    }

    public Timestamp getkTime() {
        return kTime;
    }

    public void setkTime(Timestamp kTime) {
        this.kTime = kTime;
    }

    public Short getOperNo() {
        return operNo;
    }

    public void setOperNo(Short operNo) {
        this.operNo = operNo;
    }

    public String getkDateSend() {
        return kDateSend;
    }

    public void setkDateSend(String kDateSend) {
        this.kDateSend = kDateSend;
    }

    public Timestamp getkTimeSend() {
        return kTimeSend;
    }

    public void setkTimeSend(Timestamp kTimeSend) {
        this.kTimeSend = kTimeSend;
    }

    public Integer getAdmissionVoId() {
        return admissionVoId;
    }

    public void setAdmissionVoId(Integer admissionVoId) {
        this.admissionVoId = admissionVoId;
    }

    public Integer getBillSummaryVoId() {
        return billSummaryVoId;
    }

    public void setBillSummaryVoId(Integer billSummaryVoId) {
        this.billSummaryVoId = billSummaryVoId;
    }

    public List<Integer> getDiagnosisVosIds() {
        return diagnosisVosIds;
    }

    public void setDiagnosisVosIds(List<Integer> diagnosisVosIds) {
        this.diagnosisVosIds = diagnosisVosIds;
    }

    public Integer getDischargeVoId() {
        return dischargeVoId;
    }

    public void setDischargeVoId(Integer dischargeVoId) {
        this.dischargeVoId = dischargeVoId;
    }

    public List<Integer> getHealthcareProviderVosIdes() {
        return healthcareProviderVosIdes;
    }

    public void setHealthcareProviderVosIdes(List<Integer> healthcareProviderVosIdes) {
        this.healthcareProviderVosIdes = healthcareProviderVosIdes;
    }

    public Integer getHospitalWardVoId() {
        return hospitalWardVoId;
    }

    public void setHospitalWardVoId(Integer hospitalWardVoId) {
        this.hospitalWardVoId = hospitalWardVoId;
    }

    public List<Integer> getInsuranceVosIds() {
        return insuranceVosIds;
    }

    public void setInsuranceVosIds(List<Integer> insuranceVosIds) {
        this.insuranceVosIds = insuranceVosIds;
    }

    public Integer getPersonInfoVoId() {
        return personInfoVoId;
    }

    public void setPersonInfoVoId(Integer personInfoVoId) {
        this.personInfoVoId = personInfoVoId;
    }

    @Override
    public String toString() {
        return "PatientTransfer{" +
                "sepasId=" + sepasId +
                ", parNo=" + parNo +
                ", bastaryNum=" + bastaryNum +
                ", compositionUid='" + compositionUid + '\'' +
                ", patientUid='" + patientUid + '\'' +
                ", send=" + send +
                ", status=" + status +
                ", kDate='" + kDate + '\'' +
                ", kTime=" + kTime +
                ", operNo=" + operNo +
                ", kDateSend='" + kDateSend + '\'' +
                ", kTimeSend=" + kTimeSend +
                ", admissionVoId=" + admissionVoId +
                ", billSummaryVoId=" + billSummaryVoId +
                ", diagnosisVosIds=" + diagnosisVosIds +
                ", dischargeVoId=" + dischargeVoId +
                ", healthcareProviderVosIdes=" + healthcareProviderVosIdes +
                ", hospitalWardVoId=" + hospitalWardVoId +
                ", insuranceVosIds=" + insuranceVosIds +
                ", personInfoVoId=" + personInfoVoId +
                '}';
    }
}
