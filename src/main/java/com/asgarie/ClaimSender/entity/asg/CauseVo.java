package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(CauseVoPK.class)
public class CauseVo {
    private int sepasId;
    private int id;
    private String causeCode;
    private String statusCode;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CauseCode")
    public String getCauseCode() {
        return causeCode;
    }

    public void setCauseCode(String causeCode) {
        this.causeCode = causeCode;
    }

    @Basic
    @Column(name = "StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CauseVo causeVo = (CauseVo) o;

        if (sepasId != causeVo.sepasId) return false;
        if (id != causeVo.id) return false;
        if (causeCode != null ? !causeCode.equals(causeVo.causeCode) : causeVo.causeCode != null) return false;
        if (statusCode != null ? !statusCode.equals(causeVo.statusCode) : causeVo.statusCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + id;
        result = 31 * result + (causeCode != null ? causeCode.hashCode() : 0);
        result = 31 * result + (statusCode != null ? statusCode.hashCode() : 0);
        return result;
    }
}
