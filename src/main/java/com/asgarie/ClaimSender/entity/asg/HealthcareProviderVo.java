package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "HealthcareProviderVo")
public class HealthcareProviderVo {
    private Integer sepasId;
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
    private PatientTransfer patientTransfer;

    @Id
    @Column(name = "SepasID")
    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
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

    @ManyToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
