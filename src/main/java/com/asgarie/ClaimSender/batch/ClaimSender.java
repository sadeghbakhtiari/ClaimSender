package com.asgarie.ClaimSender.batch;

import com.asgarie.ClaimSender.dao.api.PatientTransferDao;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import com.asgarie.ClaimSender.service.api.AskarService;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import service.api.AvaBillPatientService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ClaimSender {

    @Value("${fixed.rate}")
    private Long fixedRate;

    @Autowired
    private AskarService askarService;

    @Autowired
    private AvaBillPatientService avaBillPatientService;

    @Autowired
    private PatientTransferDao patientTransferDao;

    @Scheduled(fixedDelay = 2000)
    public void schedule() {

//        List<PatientBillMessageVO> messageList = askarService.buildMessageVo();
//        List<ResultVO> resultVOList = new ArrayList<>();
//        messageList.forEach(m -> {
//            ResultVO resultVO = avaBillPatientService.savePatientBillMessageVo(m);
//            resultVOList.add(resultVO);
////        });
//
//        System.out.println("----------------- Result ---------------");
//        resultVOList.forEach(m -> System.out.println(m.toString()));

        List<PatientTransfer> patientTransferList = patientTransferDao.getAllPatientTransferList();
        for (PatientTransfer patientTransfer : patientTransferList) {
            askarService.callWebService(patientTransfer.getSepasId());
        }


    }

}
