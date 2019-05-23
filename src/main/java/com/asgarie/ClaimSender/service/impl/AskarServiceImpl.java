package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.dao.api.AdmissionDao;
import com.asgarie.ClaimSender.dao.api.OrganizationVoDao;
import com.asgarie.ClaimSender.dao.api.PatientTransferDao;
import com.asgarie.ClaimSender.dao.api.PersonInfoVoDao;
import com.asgarie.ClaimSender.entity.ask.AdmissionVo;
import com.asgarie.ClaimSender.entity.ask.OrganizationVo;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import com.asgarie.ClaimSender.entity.ask.PersonInfoVo;
import com.asgarie.ClaimSender.service.api.AskarService;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AskarServiceImpl implements AskarService {

    @Autowired
    private AdmissionDao admissionDao;

    @Autowired
    private PatientTransferDao patientTransferDao;

    @Autowired
    private PersonInfoVoDao personDao;

    @Autowired
    private OrganizationVoDao organizationDao;

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

    @Override
    public List<PatientBillMessageVO> buildMessageVo() {
        List<PatientTransfer> transferList = patientTransferDao.getAllPatientTransferList();
        List<PatientBillMessageVO> messageVOList = new ArrayList<>();
        transferList.forEach(t -> {
            PatientBillMessageVO messageVO = new PatientBillMessageVO();
            PersonInfoVo person = personDao.getById(t.getSepasId());
            PersonInfoVO personInfoVO = new PersonInfoVO();
            DODATE bDate = new DODATE();
            bDate.setDay(person.getBirthDay());
            bDate.setMonth(person.getBirthMonth());
            bDate.setYear(person.getBirthYear());
            personInfoVO.setBirthDate(bDate);
            personInfoVO.setFirstName(person.getFirstName());
            personInfoVO.setLastName(person.getLastName());
            personInfoVO.setNationalCode(person.getNationalCode());
            messageVO.setPerson(personInfoVO);
            BillPatientCompositionVO compositionVO = new BillPatientCompositionVO();
            AdmissionVO admissionVO = new AdmissionVO();
            AdmissionVo admission = admissionDao.getById(t.getSepasId());
            admissionVO.setMedicalRecordNumber(admission.getMedicalRecordNumber());
            OrganizationVO organizationVO = new OrganizationVO();
            OrganizationVo org = organizationDao.getById(1);
            organizationVO.setName(org.getName());
            admissionVO.setInstitute(organizationVO);
            compositionVO.setAdmission(admissionVO);
            messageVO.setComposition(compositionVO);

            messageVOList.add(messageVO);
        });

        return messageVOList;
    }
}
