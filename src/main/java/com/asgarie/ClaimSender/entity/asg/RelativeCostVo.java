package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(RelativeCostVoPK.class)
public class RelativeCostVo {
    private int relativeCostFk;
    private String kTypeCode;
    private Float kValue;
    private int sepasId;

    @Id
    @Column(name = "RelativeCostFK")
    public int getRelativeCostFk() {
        return relativeCostFk;
    }

    public void setRelativeCostFk(int relativeCostFk) {
        this.relativeCostFk = relativeCostFk;
    }

    @Basic
    @Column(name = "KTypeCode")
    public String getkTypeCode() {
        return kTypeCode;
    }

    public void setkTypeCode(String kTypeCode) {
        this.kTypeCode = kTypeCode;
    }

    @Basic
    @Column(name = "KValue")
    public Float getkValue() {
        return kValue;
    }

    public void setkValue(Float kValue) {
        this.kValue = kValue;
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

        RelativeCostVo that = (RelativeCostVo) o;

        if (relativeCostFk != that.relativeCostFk) return false;
        if (sepasId != that.sepasId) return false;
        if (kTypeCode != null ? !kTypeCode.equals(that.kTypeCode) : that.kTypeCode != null) return false;
        if (kValue != null ? !kValue.equals(that.kValue) : that.kValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = relativeCostFk;
        result = 31 * result + (kTypeCode != null ? kTypeCode.hashCode() : 0);
        result = 31 * result + (kValue != null ? kValue.hashCode() : 0);
        result = 31 * result + sepasId;
        return result;
    }
}
