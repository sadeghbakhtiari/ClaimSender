package com.asgarie.ClaimSender.service.api;

import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;

import java.util.List;

public interface AskarService {

    void showHelloMessage();

    List<PatientBillMessageVO> buildMessageVo();

}
