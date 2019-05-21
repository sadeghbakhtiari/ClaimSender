package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OrganizationVO")
public class OrganizationVo implements Serializable {
    private String idOrgan;
    private String name;
    private Integer type;
    private String location;
    private String systemId;
    private Integer hospitalAccreditation;

    @Id
    @Column(name = "IDOrgan")
    public String getIdOrgan() {
        return idOrgan;
    }

    public void setIdOrgan(String idOrgan) {
        this.idOrgan = idOrgan;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "SystemID")
    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @Basic
    @Column(name = "HospitalAccreditation")
    public Integer getHospitalAccreditation() {
        return hospitalAccreditation;
    }

    public void setHospitalAccreditation(Integer hospitalAccreditation) {
        this.hospitalAccreditation = hospitalAccreditation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationVo that = (OrganizationVo) o;

        if (idOrgan != null ? !idOrgan.equals(that.idOrgan) : that.idOrgan != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (systemId != null ? !systemId.equals(that.systemId) : that.systemId != null) return false;
        if (hospitalAccreditation != null ? !hospitalAccreditation.equals(that.hospitalAccreditation) : that.hospitalAccreditation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrgan != null ? idOrgan.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (systemId != null ? systemId.hashCode() : 0);
        result = 31 * result + (hospitalAccreditation != null ? hospitalAccreditation.hashCode() : 0);
        return result;
    }
}
