package com.asgarie.ClaimSender.entity.asg;

import javax.persistence.*;

@Entity
@Table(name = "HospitalWardVO")
public class HospitalWardVo {
    private int hospitalWardVofk;
    private String bed;
    private String name;
    private String room;
    private String typeCode;
    private int sepasId;
    private PatientTransfer patientTransferBySepasId;

    @Basic
    @Column(name = "HospitalWardVOFK")
    public int getHospitalWardVofk() {
        return hospitalWardVofk;
    }

    public void setHospitalWardVofk(int hospitalWardVofk) {
        this.hospitalWardVofk = hospitalWardVofk;
    }

    @Basic
    @Column(name = "Bed")
    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
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
    @Column(name = "Room")
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Basic
    @Column(name = "TypeCode")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Id
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

        HospitalWardVo that = (HospitalWardVo) o;

        if (hospitalWardVofk != that.hospitalWardVofk) return false;
        if (sepasId != that.sepasId) return false;
        if (bed != null ? !bed.equals(that.bed) : that.bed != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (room != null ? !room.equals(that.room) : that.room != null) return false;
        if (typeCode != null ? !typeCode.equals(that.typeCode) : that.typeCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hospitalWardVofk;
        result = 31 * result + (bed != null ? bed.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (typeCode != null ? typeCode.hashCode() : 0);
        result = 31 * result + sepasId;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "SepasID", referencedColumnName = "SepasID", nullable = false)
    public PatientTransfer getPatientTransferBySepasId() {
        return patientTransferBySepasId;
    }

    public void setPatientTransferBySepasId(PatientTransfer patientTransferBySepasId) {
        this.patientTransferBySepasId = patientTransferBySepasId;
    }
}
