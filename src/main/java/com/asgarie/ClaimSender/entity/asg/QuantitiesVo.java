package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "QuantitiesVO")
public class QuantitiesVo {
    private int id;
    private int quantitiesFk;
    private String nameCode;
    private Double value;
    private Integer sepasId;

    @Id
    public int getId() {
        return id;
    }

    @Basic
    @Column(name = "QuantitiesFK")
    public int getQuantitiesFk() {
        return quantitiesFk;
    }

    public void setQuantitiesFk(int quantitiesFk) {
        this.quantitiesFk = quantitiesFk;
    }

    @Basic
    @Column(name = "NameCode")
    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    @Basic
    @Column(name = "Value")
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Basic
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }
}
