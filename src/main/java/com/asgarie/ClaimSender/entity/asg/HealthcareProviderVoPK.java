package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HealthcareProviderVoPK implements Serializable {
    private int sepasId;
    private int healthcareProviderFk;

    @Column(name = "SepasID")
    @Id
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Column(name = "HealthcareProviderFK")
    @Id
    public int getHealthcareProviderFk() {
        return healthcareProviderFk;
    }

    public void setHealthcareProviderFk(int healthcareProviderFk) {
        this.healthcareProviderFk = healthcareProviderFk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HealthcareProviderVoPK that = (HealthcareProviderVoPK) o;

        if (sepasId != that.sepasId) return false;
        if (healthcareProviderFk != that.healthcareProviderFk) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + healthcareProviderFk;
        return result;
    }
}
