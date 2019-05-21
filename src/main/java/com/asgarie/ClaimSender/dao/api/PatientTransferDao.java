package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.asg.PatientTransfer;

public interface PatientTransferDao {
    PatientTransfer getPatientTransfer(Integer sepasId);
}
