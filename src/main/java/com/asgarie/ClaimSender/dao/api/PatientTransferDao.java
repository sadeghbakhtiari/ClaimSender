package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.PatientTransfer;

import java.util.List;

public interface PatientTransferDao {
//    PatientTransfer getHospitalWardVOFK(Integer sepasId);

    List<PatientTransfer> getAllPatientTransferList();

}
