package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class BillPatientCompositionVo implements Serializable {
    private String compositionUid;
    private String patientUid;
    private Integer sepasId;

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

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

}
