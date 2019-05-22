package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class RelativeCostVo implements Serializable {
    private int relativeCostFk;
    private String kTypeCode;
    private Float kValue;
    private Integer sepasId;

    public int getRelativeCostFk() {
        return relativeCostFk;
    }

    public void setRelativeCostFk(int relativeCostFk) {
        this.relativeCostFk = relativeCostFk;
    }

    public String getkTypeCode() {
        return kTypeCode;
    }

    public void setkTypeCode(String kTypeCode) {
        this.kTypeCode = kTypeCode;
    }

    public Float getkValue() {
        return kValue;
    }

    public void setkValue(Float kValue) {
        this.kValue = kValue;
    }

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }
}
