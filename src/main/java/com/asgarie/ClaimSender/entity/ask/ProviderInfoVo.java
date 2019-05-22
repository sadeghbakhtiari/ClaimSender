package com.asgarie.ClaimSender.entity.ask;

import javax.persistence.*;
import java.io.Serializable;

public class ProviderInfoVo implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String identifierIssuer;
    private String identifierAssigner;
    private String identifierType;
    private String identifierId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
