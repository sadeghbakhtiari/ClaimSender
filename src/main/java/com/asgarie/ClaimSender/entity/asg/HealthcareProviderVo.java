package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@IdClass(HealthcareProviderVoPK.class)
public class HealthcareProviderVo {
    private int sepasId;
    private int healthcareProviderFk;
    private String firstName;
    private String lastName;
    private String fullName;
    private String identifierIssuer;
    private String identifierAssigner;
    private String identifierType;
    private String identifierId;
    private String roleCode;
    private String specialtyCode;
    private String role;
    private PatientTransfer patientTransferBySepasId;

    @Id
    @Column(name = "SepasID")
    public int getSepasId() {
        return sepasId;
    }

    public void setSepasId(int sepasId) {
        this.sepasId = sepasId;
    }

    @Id
    @Column(name = "HealthcareProviderFK")
    public int getHealthcareProviderFk() {
        return healthcareProviderFk;
    }

    public void setHealthcareProviderFk(int healthcareProviderFk) {
        this.healthcareProviderFk = healthcareProviderFk;
    }

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "FullName")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "IdentifierIssuer")
    public String getIdentifierIssuer() {
        return identifierIssuer;
    }

    public void setIdentifierIssuer(String identifierIssuer) {
        this.identifierIssuer = identifierIssuer;
    }

    @Basic
    @Column(name = "IdentifierAssigner")
    public String getIdentifierAssigner() {
        return identifierAssigner;
    }

    public void setIdentifierAssigner(String identifierAssigner) {
        this.identifierAssigner = identifierAssigner;
    }

    @Basic
    @Column(name = "IdentifierType")
    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    @Basic
    @Column(name = "IdentifierId")
    public String getIdentifierId() {
        return identifierId;
    }

    public void setIdentifierId(String identifierId) {
        this.identifierId = identifierId;
    }

    @Basic
    @Column(name = "RoleCode")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "SpecialtyCode")
    public String getSpecialtyCode() {
        return specialtyCode;
    }

    public void setSpecialtyCode(String specialtyCode) {
        this.specialtyCode = specialtyCode;
    }

    @Basic
    @Column(name = "Role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HealthcareProviderVo that = (HealthcareProviderVo) o;

        if (sepasId != that.sepasId) return false;
        if (healthcareProviderFk != that.healthcareProviderFk) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (identifierIssuer != null ? !identifierIssuer.equals(that.identifierIssuer) : that.identifierIssuer != null)
            return false;
        if (identifierAssigner != null ? !identifierAssigner.equals(that.identifierAssigner) : that.identifierAssigner != null)
            return false;
        if (identifierType != null ? !identifierType.equals(that.identifierType) : that.identifierType != null)
            return false;
        if (identifierId != null ? !identifierId.equals(that.identifierId) : that.identifierId != null) return false;
        if (roleCode != null ? !roleCode.equals(that.roleCode) : that.roleCode != null) return false;
        if (specialtyCode != null ? !specialtyCode.equals(that.specialtyCode) : that.specialtyCode != null)
            return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sepasId;
        result = 31 * result + healthcareProviderFk;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (identifierIssuer != null ? identifierIssuer.hashCode() : 0);
        result = 31 * result + (identifierAssigner != null ? identifierAssigner.hashCode() : 0);
        result = 31 * result + (identifierType != null ? identifierType.hashCode() : 0);
        result = 31 * result + (identifierId != null ? identifierId.hashCode() : 0);
        result = 31 * result + (roleCode != null ? roleCode.hashCode() : 0);
        result = 31 * result + (specialtyCode != null ? specialtyCode.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransferBySepasId() {
        return patientTransferBySepasId;
    }

    public void setPatientTransferBySepasId(PatientTransfer patientTransferBySepasId) {
        this.patientTransferBySepasId = patientTransferBySepasId;
    }
}
