package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.dao.api.AdmissionDao;
import com.asgarie.ClaimSender.dao.api.PatientTransferDao;
import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import com.asgarie.ClaimSender.service.api.AskarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AskarServiceImpl implements AskarService {

    @Autowired
    private AdmissionDao admissionDao;

    @Autowired
    private PatientTransferDao patientTransferDao;

    @Override
    public void showHelloMessage() {
        List<AdmissionVo> admissionVoList = admissionDao.getAllAdmission();
        admissionVoList.forEach(a -> System.out.println(a));
        System.out.println("--------------------------");
        List<PatientTransfer> patientTransferList = patientTransferDao.getAllPatientTransferList();
        patientTransferList.forEach(pt -> System.out.println(pt));
        System.out.println("--------------------------");
        System.out.println("Admission With id 28 = " + admissionDao.getById(28));
    }

}
