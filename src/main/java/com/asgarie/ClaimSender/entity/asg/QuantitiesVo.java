package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "QuantitiesVO")
public class QuantitiesVo {
    private int id;
    private int quantitiesFk;
    private String nameCode;
    private Double value;
    private int sepasId;

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

        QuantitiesVo that = (QuantitiesVo) o;

        if (quantitiesFk != that.quantitiesFk) return false;
        if (sepasId != that.sepasId) return false;
        if (nameCode != null ? !nameCode.equals(that.nameCode) : that.nameCode != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quantitiesFk;
        result = 31 * result + (nameCode != null ? nameCode.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + sepasId;
        return result;
    }
}
