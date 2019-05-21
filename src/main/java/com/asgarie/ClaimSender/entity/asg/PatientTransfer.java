package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.List;

@Entity
@Table(name = "PatientTransfer")
@NamedQueries(value = {
        @NamedQuery(name = PatientTransfer.FIRST, query = "")
})
public class PatientTransfer implements Serializable {

    public static final String FIRST = "FIRST";

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
    private AdmissionVo admissionVo;
    private BillSummaryVo billSummaryVo;
    private List<DiagnosisVo> diagnosisVos;
    private DischargeVo dischargeVo;
    private List<HealthcareProviderVo> healthcareProviderVos;
    private HospitalWardVo hospitalWardVo;
    private List<InsuranceVo> insuranceVos;
    private PersonInfoVo personInfoVo;

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    @Basic
    @Column(name = "Par_No")
    public Integer getParNo() {
        return parNo;
    }

    public void setParNo(Integer parNo) {
        this.parNo = parNo;
    }

    @Basic
    @Column(name = "Bastary_Num")
    public Integer getBastaryNum() {
        return bastaryNum;
    }

    public void setBastaryNum(Integer bastaryNum) {
        this.bastaryNum = bastaryNum;
    }

    @Basic
    @Column(name = "CompositionUID")
    public String getCompositionUid() {
        return compositionUid;
    }

    public void setCompositionUid(String compositionUid) {
        this.compositionUid = compositionUid;
    }

    @Basic
    @Column(name = "PatientUID")
    public String getPatientUid() {
        return patientUid;
    }

    public void setPatientUid(String patientUid) {
        this.patientUid = patientUid;
    }

    @Basic
    @Column(name = "Send")
    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "KDate")
    public String getkDate() {
        return kDate;
    }

    public void setkDate(String kDate) {
        this.kDate = kDate;
    }

    @Basic
    @Column(name = "KTime")
    public Timestamp getkTime() {
        return kTime;
    }

    public void setkTime(Timestamp kTime) {
        this.kTime = kTime;
    }

    @Basic
    @Column(name = "Oper_No")
    public Short getOperNo() {
        return operNo;
    }

    public void setOperNo(Short operNo) {
        this.operNo = operNo;
    }

    @Basic
    @Column(name = "KdateSend")
    public String getkDateSend() {
        return kDateSend;
    }

    public void setkDateSend(String kDateSend) {
        this.kDateSend = kDateSend;
    }

    @Basic
    @Column(name = "KtimeSend")
    public Timestamp getkTimeSend() {
        return kTimeSend;
    }

    public void setkTimeSend(Timestamp kTimeSend) {
        this.kTimeSend = kTimeSend;
    }
    

    @OneToOne(mappedBy = "patientTransfer")
    public AdmissionVo getAdmissionVo() {
        return admissionVo;
    }

    public void setAdmissionVo(AdmissionVo admissionVo) {
        this.admissionVo = admissionVo;
    }

    @OneToOne(mappedBy = "patientTransfer")
    public BillSummaryVo getBillSummaryVo() {
        return billSummaryVo;
    }

    public void setBillSummaryVo(BillSummaryVo billSummaryVo) {
        this.billSummaryVo = billSummaryVo;
    }

    @OneToMany(mappedBy = "patientTransfer")
    public List<DiagnosisVo> getDiagnosisVos() {
        return diagnosisVos;
    }

    public void setDiagnosisVos(List<DiagnosisVo> diagnosisVos) {
        this.diagnosisVos = diagnosisVos;
    }

    @OneToOne(mappedBy = "patientTransfer")
    public DischargeVo getDischargeVo() {
        return dischargeVo;
    }

    public void setDischargeVo(DischargeVo dischargeVo) {
        this.dischargeVo = dischargeVo;
    }

    @OneToMany(mappedBy = "patientTransfer")
    public List<HealthcareProviderVo> getHealthcareProviderVos() {
        return healthcareProviderVos;
    }

    public void setHealthcareProviderVos(List<HealthcareProviderVo> healthcareProviderVos) {
        this.healthcareProviderVos = healthcareProviderVos;
    }

    @OneToOne(mappedBy = "patientTransfer")
    public HospitalWardVo getHospitalWardVo() {
        return hospitalWardVo;
    }

    public void setHospitalWardVo(HospitalWardVo hospitalWardVo) {
        this.hospitalWardVo = hospitalWardVo;
    }

    @OneToMany(mappedBy = "patientTransfer")
    public List<InsuranceVo> getInsuranceVos() {
        return insuranceVos;
    }

    public void setInsuranceVos(List<InsuranceVo> insuranceVos) {
        this.insuranceVos = insuranceVos;
    }

    @OneToOne(mappedBy = "patientTransfer")
    public PersonInfoVo getPersonInfoVo() {
        return personInfoVo;
    }

    public void setPersonInfoVo(PersonInfoVo personInfoVo) {
        this.personInfoVo = personInfoVo;
    }
}
