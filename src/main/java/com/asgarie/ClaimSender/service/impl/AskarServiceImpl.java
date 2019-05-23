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
            BillPatientCompositionVO compositionVO = new BillPatientCompositionVO();
            OrganizationVO organizationVO = new OrganizationVO();
            OrganizationVo org = organizationDao.getById(1);
            organizationVO.setName(org.getName());
            messageVO.setComposition(compositionVO);

            messageVOList.add(messageVO);
        });

        return messageVOList;
    }

    @Override
    public PatientBillMessageVO convertAdmissionVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        AdmissionVO admissionVO = new AdmissionVO();
        AdmissionVo admission = admissionDao.getById(sepasId);
        admissionVO.setMedicalRecordNumber(admission.getMedicalRecordNumber());
        admissionVO.setInstitute(convertOrganizationVo(sepasId));

        patientBillMessageVO.getComposition().setAdmission(admissionVO);
        return null;
    }

    @Override
    public PatientBillMessageVO convertBasicDeathDetailsVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertBillSummaryVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertCauseVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertDiagnosisVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertDischargeVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertHealthcareProviderVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertHighLevelAreaVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertHospitalWardVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertInsuranceVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertOrganizationVo(Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertPersonInfoVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
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
        patientBillMessageVO.setPerson(personInfoVO);
        return patientBillMessageVO;
    }

    @Override
    public PatientBillMessageVO convertServiceDetailesVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convertServiceGroupRowVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }

    @Override
    public PatientBillMessageVO convert(PatientBillMessageVO patientBillMessageVO, Integer sepasId) {
        return null;
    }
}
