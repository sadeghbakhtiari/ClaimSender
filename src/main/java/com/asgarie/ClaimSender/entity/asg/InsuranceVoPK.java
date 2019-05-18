package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class InsuranceVoPK implements Serializable {
    private int sepasId;
    private int id;

    @Column(name = "SepasID")
    @Id
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Column(name = "ID")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsuranceVoPK that = (InsuranceVoPK) o;

        if (sepasId != that.sepasId) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + id;
        return result;
    }
}
