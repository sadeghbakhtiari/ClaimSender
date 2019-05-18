package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "PatientTransfer")
@NamedQueries(value = {
        @NamedQuery(name = PatientTransfer.FIRST, query = "")
})
public class PatientTransfer implements Serializable {

    public static final String FIRST = "FIRST";

    private int sepasId;
    private int parNo;
    private int bastaryNum;
    private String compositionUid;
    private String patientUid;
    private boolean send;
    private int status;
    private String kDate;
    private Timestamp kTime;
    private Short operNo;
    private String kdateSend;
    private Timestamp ktimeSend;
    private AdmissionVo admissionVoBySepasId;
    private BillSummaryVo billSummaryVoBySepasId;
    private Collection<DiagnosisVo> diagnosisVosBySepasId;
    private DischargeVo dischargeVoBySepasId;
    private Collection<HealthcareProviderVo> healthcareProviderVosBySepasId;
    private HospitalWardVo hospitalWardVoBySepasId;
    private Collection<InsuranceVo> insuranceVosBySepasId;
    private PatientTransfer patientTransferBySepasId;
    private PatientTransfer patientTransferBySepasId_0;
    private PersonInfoVo personInfoVoBySepasId;
    private Collection<ServiceDetailesVo> serviceDetailesVosBySepasId;
    private Collection<ServiceGroupRowVo> serviceGroupRowVosBySepasId;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Basic
    @Column(name = "Par_No")
    public int getParNo() {
        return parNo;
    }

    public void setParNo(int parNo) {
        this.parNo = parNo;
    }

    @Basic
    @Column(name = "Bastary_Num")
    public int getBastaryNum() {
        return bastaryNum;
    }

    public void setBastaryNum(int bastaryNum) {
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
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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
    public String getKdateSend() {
        return kdateSend;
    }

    public void setKdateSend(String kdateSend) {
        this.kdateSend = kdateSend;
    }

    @Basic
    @Column(name = "KtimeSend")
    public Timestamp getKtimeSend() {
        return ktimeSend;
    }

    public void setKtimeSend(Timestamp ktimeSend) {
        this.ktimeSend = ktimeSend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientTransfer that = (PatientTransfer) o;

        if (sepasId != that.sepasId) return false;
        if (parNo != that.parNo) return false;
        if (bastaryNum != that.bastaryNum) return false;
        if (send != that.send) return false;
        if (status != that.status) return false;
        if (compositionUid != null ? !compositionUid.equals(that.compositionUid) : that.compositionUid != null)
            return false;
        if (patientUid != null ? !patientUid.equals(that.patientUid) : that.patientUid != null) return false;
        if (kDate != null ? !kDate.equals(that.kDate) : that.kDate != null) return false;
        if (kTime != null ? !kTime.equals(that.kTime) : that.kTime != null) return false;
        if (operNo != null ? !operNo.equals(that.operNo) : that.operNo != null) return false;
        if (kdateSend != null ? !kdateSend.equals(that.kdateSend) : that.kdateSend != null) return false;
        if (ktimeSend != null ? !ktimeSend.equals(that.ktimeSend) : that.ktimeSend != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + parNo;
        result = 31 * result + (int) bastaryNum;
        result = 31 * result + (compositionUid != null ? compositionUid.hashCode() : 0);
        result = 31 * result + (patientUid != null ? patientUid.hashCode() : 0);
        result = 31 * result + (send ? 1 : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (kDate != null ? kDate.hashCode() : 0);
        result = 31 * result + (kTime != null ? kTime.hashCode() : 0);
        result = 31 * result + (operNo != null ? operNo.hashCode() : 0);
        result = 31 * result + (kdateSend != null ? kdateSend.hashCode() : 0);
        result = 31 * result + (ktimeSend != null ? ktimeSend.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "patientTransferBySepasId")
    public AdmissionVo getAdmissionVoBySepasId() {
        return admissionVoBySepasId;
    }

    public void setAdmissionVoBySepasId(AdmissionVo admissionVoBySepasId) {
        this.admissionVoBySepasId = admissionVoBySepasId;
    }

    @OneToOne(mappedBy = "patientTransferBySepasId")
    public BillSummaryVo getBillSummaryVoBySepasId() {
        return billSummaryVoBySepasId;
    }

    public void setBillSummaryVoBySepasId(BillSummaryVo billSummaryVoBySepasId) {
        this.billSummaryVoBySepasId = billSummaryVoBySepasId;
    }

    @OneToMany(mappedBy = "patientTransferBySepasId")
    public Collection<DiagnosisVo> getDiagnosisVosBySepasId() {
        return diagnosisVosBySepasId;
    }

    public void setDiagnosisVosBySepasId(Collection<DiagnosisVo> diagnosisVosBySepasId) {
        this.diagnosisVosBySepasId = diagnosisVosBySepasId;
    }

    @OneToOne(mappedBy = "patientTransferBySepasId")
    public DischargeVo getDischargeVoBySepasId() {
        return dischargeVoBySepasId;
    }

    public void setDischargeVoBySepasId(DischargeVo dischargeVoBySepasId) {
        this.dischargeVoBySepasId = dischargeVoBySepasId;
    }

    @OneToMany(mappedBy = "patientTransferBySepasId")
    public Collection<HealthcareProviderVo> getHealthcareProviderVosBySepasId() {
        return healthcareProviderVosBySepasId;
    }

    public void setHealthcareProviderVosBySepasId(Collection<HealthcareProviderVo> healthcareProviderVosBySepasId) {
        this.healthcareProviderVosBySepasId = healthcareProviderVosBySepasId;
    }

    @OneToOne(mappedBy = "patientTransferBySepasId")
    public HospitalWardVo getHospitalWardVoBySepasId() {
        return hospitalWardVoBySepasId;
    }

    public void setHospitalWardVoBySepasId(HospitalWardVo hospitalWardVoBySepasId) {
        this.hospitalWardVoBySepasId = hospitalWardVoBySepasId;
    }

    @OneToMany(mappedBy = "patientTransferBySepasId")
    public Collection<InsuranceVo> getInsuranceVosBySepasId() {
        return insuranceVosBySepasId;
    }

    public void setInsuranceVosBySepasId(Collection<InsuranceVo> insuranceVosBySepasId) {
        this.insuranceVosBySepasId = insuranceVosBySepasId;
    }

    @OneToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransferBySepasId() {
        return patientTransferBySepasId;
    }

    public void setPatientTransferBySepasId(PatientTransfer patientTransferBySepasId) {
        this.patientTransferBySepasId = patientTransferBySepasId;
    }

    @OneToOne(mappedBy = "patientTransferBySepasId")
    public PatientTransfer getPatientTransferBySepasId_0() {
        return patientTransferBySepasId_0;
    }

    public void setPatientTransferBySepasId_0(PatientTransfer patientTransferBySepasId_0) {
        this.patientTransferBySepasId_0 = patientTransferBySepasId_0;
    }

    @OneToOne(mappedBy = "patientTransferBySepasId")
    public PersonInfoVo getPersonInfoVoBySepasId() {
        return personInfoVoBySepasId;
    }

    public void setPersonInfoVoBySepasId(PersonInfoVo personInfoVoBySepasId) {
        this.personInfoVoBySepasId = personInfoVoBySepasId;
    }

    @OneToMany(mappedBy = "patientTransferBySepasId")
    public Collection<ServiceDetailesVo> getServiceDetailesVosBySepasId() {
        return serviceDetailesVosBySepasId;
    }

    public void setServiceDetailesVosBySepasId(Collection<ServiceDetailesVo> serviceDetailesVosBySepasId) {
        this.serviceDetailesVosBySepasId = serviceDetailesVosBySepasId;
    }

    @OneToMany(mappedBy = "patientTransferBySepasId")
    public Collection<ServiceGroupRowVo> getServiceGroupRowVosBySepasId() {
        return serviceGroupRowVosBySepasId;
    }

    public void setServiceGroupRowVosBySepasId(Collection<ServiceGroupRowVo> serviceGroupRowVosBySepasId) {
        this.serviceGroupRowVosBySepasId = serviceGroupRowVosBySepasId;
    }
}
