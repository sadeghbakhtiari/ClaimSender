package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class OrganizationVo implements Serializable {
    private String idOrgan;
    private String name;
    private Integer type;
    private String location;
    private String systemId;
    private Integer hospitalAccreditation;

    public String getIdOrgan() {
        return idOrgan;
    }

    public void setIdOrgan(String idOrgan) {
        this.idOrgan = idOrgan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Integer getHospitalAccreditation() {
        return hospitalAccreditation;
    }

    public void setHospitalAccreditation(Integer hospitalAccreditation) {
        this.hospitalAccreditation = hospitalAccreditation;
    }

}
