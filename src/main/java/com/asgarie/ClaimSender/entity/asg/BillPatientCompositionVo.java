package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "BillPatientCompositionVO")
public class BillPatientCompositionVo {
    private String compositionUid;
    private String patientUid;
    private int sepasId;

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

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillPatientCompositionVo that = (BillPatientCompositionVo) o;

        if (sepasId != that.sepasId) return false;
        if (compositionUid != null ? !compositionUid.equals(that.compositionUid) : that.compositionUid != null)
            return false;
        if (patientUid != null ? !patientUid.equals(that.patientUid) : that.patientUid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = compositionUid != null ? compositionUid.hashCode() : 0;
        result = 31 * result + (patientUid != null ? patientUid.hashCode() : 0);
        result = 31 * result + sepasId;
        return result;
    }
}
