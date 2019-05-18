package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class RelativeCostVoPK implements Serializable {
    private int relativeCostFk;
    private int sepasId;

    @Column(name = "RelativeCostFK")
    @Id
    public int getRelativeCostFk() {
        return relativeCostFk;
    }

    public void setRelativeCostFk(int relativeCostFk) {
        this.relativeCostFk = relativeCostFk;
    }

    @Column(name = "SepasID")
    @Id
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

        RelativeCostVoPK that = (RelativeCostVoPK) o;

        if (relativeCostFk != that.relativeCostFk) return false;
        if (sepasId != that.sepasId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relativeCostFk;
        result = 31 * result + sepasId;
        return result;
    }
}
