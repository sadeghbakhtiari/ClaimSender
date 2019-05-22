package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.PatientTransfer;

import java.util.List;

public interface PatientTransferDao {
//    PatientTransfer getPatientTransfer(Integer sepasId);

    List<PatientTransfer> getAllPatientTransferList();

}
