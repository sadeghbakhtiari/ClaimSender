package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BillPatientCompositionVO")
public class BillPatientCompositionVo implements Serializable {
    private String compositionUid;
    private String patientUid;
    private Integer sepasId;

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
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

}
