package com.asgarie.ClaimSender.dao.api;

import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import model.ws.ir.gov.behdasht.thrita.vm.ResultVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PatientTransferDao {
//    PatientTransfer getHospitalWardVOFK(Integer sepasId);

    List<PatientTransfer> getAllPatientTransferList();

    @Transactional(readOnly = true)
    List<PatientTransfer> getNewPatientTransferList();

    void updatePatientTransfer(Integer sepasId, ResultVO resultVO);
}
