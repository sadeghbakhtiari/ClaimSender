package com.asgarie.ClaimSender.service.api;

import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;

import java.util.List;

public interface AskarService {

    void showHelloMessage();

    List<PatientBillMessageVO> buildMessageVo();

    public PatientBillMessageVO convertAdmissionVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertBasicDeathDetailsVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertBillSummaryVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertCauseVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertDiagnosisVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertDischargeVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertHealthcareProviderVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertHighLevelAreaVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertHospitalWardVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertInsuranceVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertOrganizationVo(Integer sepasId);

    public PatientBillMessageVO convertPersonInfoVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertServiceDetailesVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convertServiceGroupRowVo(PatientBillMessageVO patientBillMessageVO, Integer sepasId);

    public PatientBillMessageVO convert(PatientBillMessageVO patientBillMessageVO, Integer sepasId);
}
