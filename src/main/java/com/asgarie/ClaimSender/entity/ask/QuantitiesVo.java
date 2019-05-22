package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class QuantitiesVo implements Serializable {
    private int id;
    private int quantitiesFk;
    private String nameCode;
    private Double value;
    private Integer sepasId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantitiesFk() {
        return quantitiesFk;
    }

    public void setQuantitiesFk(int quantitiesFk) {
        this.quantitiesFk = quantitiesFk;
    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }
}
