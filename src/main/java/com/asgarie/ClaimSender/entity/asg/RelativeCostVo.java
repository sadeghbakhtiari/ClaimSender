package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "RelativeCostVo")
public class RelativeCostVo {
    private int relativeCostFk;
    private String kTypeCode;
    private Float kValue;
    private Integer sepasId;

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
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }
}
