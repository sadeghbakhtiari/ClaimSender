package com.asgarie.ClaimSender.service.api;

import com.asgarie.ClaimSender.entity.ws.behdasht.sepas.PatientBillMessageVO;
import com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm.ResultVO;

public interface AvaBillPatientService {

    ResultVO savePatientBillMessageVo(PatientBillMessageVO billPatientMessageVO);

}
