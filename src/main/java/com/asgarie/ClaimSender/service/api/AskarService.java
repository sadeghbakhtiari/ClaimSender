package com.asgarie.ClaimSender.service.api;

import com.asgarie.ClaimSender.entity.ask.BillSummaryVo;
import com.asgarie.ClaimSender.entity.ask.PatientTransfer;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
import model.ws.ir.gov.behdasht.thrita.vm.*;

import java.util.List;

public interface AskarService {

    void showHelloMessage();

    void callWebService(Integer sepasId);

    List<PatientBillMessageVO> buildMessageVo();

    PatientBillMessageVO convertPatientBillMessageVO(Integer sepasId);

    BillPatientCompositionVO convertBillPatientCompositionVO(Integer sepasId);

    MessageIdentifierVO convertMessageIdentifierVO(Integer sepasId);

    AdmissionVO convertAdmissionVo(Integer sepasId);


    BasicDeathDetailsVO convertBasicDeathDetailsVo(Integer sepasId);

    BillSummaryVO convertBillSummaryVo(Integer sepasId);

    ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(BillSummaryVo billSummaryVo);

    CauseVO convertCauseVo(Integer sepasId);

    ArrayOfDiagnosisVO convertDiagnosisVo(Integer sepasId);

    public DischargeVO convertDischargeVo(Integer sepasId);

    ArrayOfServiceGroupRowVO convertServiceGroupRowVo(Integer sepasId);

    public HospitalWardVO convertHospitalWardVo(Integer sepasId);

    HighLevelAreaVO convertHighLevelAreaVo(Integer sepasId);

    ArrayOfInsuranceVO convertInsuranceVo(Integer sepasId);

    public OrganizationVO convertOrganizationVo(Integer sepasId);

    PersonInfoVO convertPersonInfoVo(Integer sepasId);

    ArrayOfServiceDetailsVO1 convertServiceDetailesVo(Integer sepasId);


}
