package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class HealthcareProviderVo implements Serializable {
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

    public Integer getSepasId() {
        return sepasId;
    }

    public void setSepasId(Integer sepasId) {
        this.sepasId = sepasId;
    }

    public int getHealthcareProviderFk() {
        return healthcareProviderFk;
    }

    public void setHealthcareProviderFk(int healthcareProviderFk) {
        this.healthcareProviderFk = healthcareProviderFk;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentifierIssuer() {
        return identifierIssuer;
    }

    public void setIdentifierIssuer(String identifierIssuer) {
        this.identifierIssuer = identifierIssuer;
    }

    public String getIdentifierAssigner() {
        return identifierAssigner;
    }

    public void setIdentifierAssigner(String identifierAssigner) {
        this.identifierAssigner = identifierAssigner;
    }

    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public String getIdentifierId() {
        return identifierId;
    }

    public void setIdentifierId(String identifierId) {
        this.identifierId = identifierId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getSpecialtyCode() {
        return specialtyCode;
    }

    public void setSpecialtyCode(String specialtyCode) {
        this.specialtyCode = specialtyCode;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public PatientTransfer getPatientTransfer() {
        return patientTransfer;
    }

    public void setPatientTransfer(PatientTransfer patientTransfer) {
        this.patientTransfer = patientTransfer;
    }
}
