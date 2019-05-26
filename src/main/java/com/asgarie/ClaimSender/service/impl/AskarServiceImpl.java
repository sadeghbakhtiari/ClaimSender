package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.dao.api.*;
import com.asgarie.ClaimSender.entity.ask.*;
import com.asgarie.ClaimSender.service.api.AskarService;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.api.AvaBillPatientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Service
public class AskarServiceImpl implements AskarService {
    public static final String UNIT = "UNIT";
    public static final String RIAL = "Rial";

    @Autowired
    private AdmissionDao admissionDao;

    @Autowired
    private PatientTransferDao patientTransferDao;

    @Autowired
    private PersonInfoVoDao personDao;

    @Autowired
    private OrganizationVoDao organizationDao;
    @Autowired
    private HospitalWardVoDao hospitalWardVoDao;
    @Autowired
    private BasicDeathDetailsVoDao basicDeathDetailsVoDao;
    @Autowired
    private BillSummaryVoDao billSummaryVoDao;
    @Autowired
    private DiagnosisVoDao diagnosisVoDao;
    @Autowired
    private DischargeVoDao dischargeVoDao;
    @Autowired
    private HealthcareProviderVoDao healthcareProviderVoDao;
    @Autowired
    private InsuranceVoDao insuranceVoDao;
    @Autowired
    private OrganizationVoDao getOrganizationDao;
    @Autowired
    private PatientTransferDao getPatientTransferDao;
    @Autowired
    private ServiceDetailesVoDao serviceDetailesVoDao;
    @Autowired
    private ServiceGroupRowVoDao serviceGroupRowVoDao;

    //    @Autowired
//    private ResourceBundle resourceBundle;
    @Autowired
    private AvaBillPatientService avaBillPatientService;

    @Override
    public void showHelloMessage() {
        buildMessageVo();
        System.out.println("--------------------------");
        List<PatientTransfer> patientTransferList = patientTransferDao.getAllPatientTransferList();
        patientTransferList.forEach(pt -> System.out.println(pt));
        PatientBillMessageVO patientBillMessageVO = convertPatientBillMessageVO(28);
        ResultVO resultVO = avaBillPatientService.savePatientBillMessageVo(patientBillMessageVO);
        System.out.println(resultVO);
    }

    @Override
    public List<PatientBillMessageVO> buildMessageVo() {
        List<PatientTransfer> transferList = patientTransferDao.getAllPatientTransferList();
        List<PatientBillMessageVO> messageVOList = new ArrayList<>();
        transferList.forEach(t -> {
            PatientBillMessageVO messageVO = new PatientBillMessageVO();
            BillPatientCompositionVO compositionVO = new BillPatientCompositionVO();
            messageVO.setComposition(compositionVO);
            messageVOList.add(messageVO);
        });
        return messageVOList;
    }

    @Override
    public PatientBillMessageVO convertPatientBillMessageVO(Integer sepasId) {
        PatientBillMessageVO patientBillMessageVO = new PatientBillMessageVO();
        patientBillMessageVO.setComposition(convertBillPatientCompositionVO(sepasId));
        patientBillMessageVO.setMsgID(convertMessageIdentifierVO(sepasId));
        patientBillMessageVO.setPerson(convertPersonInfoVo(sepasId));
        return patientBillMessageVO;
    }

    @Override
    public BillPatientCompositionVO convertBillPatientCompositionVO(Integer sepasId) {
        BillPatientCompositionVO billPatientCompositionVO = new BillPatientCompositionVO();
        billPatientCompositionVO.setAdmission(convertAdmissionVo(sepasId));
        billPatientCompositionVO.setInsurance(convertInsuranceVo(sepasId));
        billPatientCompositionVO.setDiagnosis(convertDiagnosisVo(sepasId));
        billPatientCompositionVO.setDischarge(convertDischargeVo(sepasId));
        billPatientCompositionVO.setDeath(convertBasicDeathDetailsVo(sepasId));
        billPatientCompositionVO.setBillSummary(convertBillSummaryVo(sepasId));
        billPatientCompositionVO.setBillServices(convertServiceDetailesVo(sepasId));
        return billPatientCompositionVO;
    }

    @Override
    public MessageIdentifierVO convertMessageIdentifierVO(Integer sepasId) {
        MessageIdentifierVO messageIdentifierVO = new MessageIdentifierVO();
//        messageIdentifierVO.setCommitter();
//        messageIdentifierVO.setVersionLifecycleState();
//        messageIdentifierVO.setSystemID();
//        messageIdentifierVO.setPatientUID();
//        messageIdentifierVO.setISQueriable();
//        messageIdentifierVO.setHealthCareFacilityID();
//        messageIdentifierVO.setCompositionUID();
//        messageIdentifierVO.setCompositionSignature();
        return messageIdentifierVO;
    }

    @Override
    public AdmissionVO convertAdmissionVo(Integer sepasId) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
        AdmissionVO admissionVO = new AdmissionVO();
        AdmissionVo admission = admissionDao.getById(sepasId);
        admissionVO.setMedicalRecordNumber(admission.getMedicalRecordNumber());
        admissionVO.setInstitute(convertOrganizationVo(sepasId));
        DODATE bDate = new DODATE();
        bDate.setDay(admission.getAdmissionDay());
        bDate.setMonth(admission.getAdmissionMonth());
        bDate.setYear(admission.getAdmissionYear());
        admissionVO.setAdmissionDate(bDate);
        DOTIME dotime = new DOTIME();
        dotime.setHour(admission.getAdmissionHour());
        dotime.setMinute(admission.getAdmissionMinute());
        dotime.setSecond(admission.getAdmissionSecond());
        admissionVO.setAdmissionTime(dotime);
        admissionVO.setReferringDoctor(null);
        admissionVO.setReasonForEncounter(null);
//        admissionVO.setEMSID();
        admissionVO.setAttendingDoctor(null);
        admissionVO.setAdmittingDoctor(null);
        admissionVO.setAdmissionWard(convertHospitalWardVo(sepasId));
        String admissionValue = "";
        if (admission.getAdmissionTypeCode().equals("2"))
            admissionValue = resourceBundle.getString("msg.bastari");
        else if ((admission.getAdmissionTypeCode().equals("4"))) {
            admissionValue = resourceBundle.getString("msg.bastari.movaghat");
        }
        admissionVO.setAdmissionType(getDocodedtext("thritaEHR.admissionType", admissionValue, admission.getAdmissionTypeCode()));
        return admissionVO;
    }

    @Override
    public BasicDeathDetailsVO convertBasicDeathDetailsVo(Integer sepasId) {
        BasicDeathDetailsVo detailsVo = basicDeathDetailsVoDao.getById(sepasId);
        BasicDeathDetailsVO basicDeathDetailsVO = new BasicDeathDetailsVO();
//        basicDeathDetailsVO.setCause();//todo update
//        basicDeathDetailsVO.setHospitalWard();//todo update
        basicDeathDetailsVO.setDeathTime(getTime(detailsVo.getDeathHour(), detailsVo.getDeathMinute(), detailsVo.getDeathSecond()));
        basicDeathDetailsVO.setDeathLocation(getDocodedtext("thritaEHR.deathLocation", "", detailsVo.getDeathLocationCode()));//todo update
        basicDeathDetailsVO.setDeathDate(getDate(detailsVo.getDeathYear(), detailsVo.getDeathMonth(), detailsVo.getDeathDay()));
        return null;
    }

    @Override
    public BillSummaryVO convertBillSummaryVo(Integer sepasId) {
        BillSummaryVo billSummary = billSummaryVoDao.getById(sepasId);
        BillSummaryVO billSummaryVO = new BillSummaryVO();
        billSummaryVO.setGlobalPackage(null);
        billSummaryVO.setTotalPatientContribution(getDoquantity(billSummary.getTotalPatientContribution(), UNIT));
        billSummaryVO.setTotalOtherCosts(convertArrayOfQuantitiesVO(billSummary));
        billSummaryVO.setTotalCharge(getDoquantity(billSummary.getTotalCharge(), UNIT));
        billSummaryVO.setTotalBasicInsuranceContribution(getDoquantity(billSummary.getTotalBasicInsuranceContribution(), UNIT));
        billSummaryVO.setServiceGroupRow(convertServiceGroupRowVo(sepasId));
        billSummaryVO.setMedicalRecordType(getDocodedtext("thritaEHR.medicalRecordType", "", billSummary.getMedicalRecordTypeCode()));//todo update
        billSummaryVO.setInsurerBox(null);
        billSummaryVO.setHospitalAccreditation(1);
        return null;
    }

    @Override
    public ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(BillSummaryVo billSummaryVo) {
        ArrayOfQuantitiesVO quantitiesVOList = new ArrayOfQuantitiesVO();
        QuantitiesVO quantitiesVO = new QuantitiesVO();
        quantitiesVO = convertQuantitiesVO(billSummaryVo.gettCost(), "13");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(billSummaryVo.getdCost(), "12");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(billSummaryVo.getTakhfif(), "10");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(billSummaryVo.getTakmiliCost(), "1");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        return (ArrayOfQuantitiesVO) quantitiesVOList;
    }

    private QuantitiesVO convertQuantitiesVO(Double magnitude, String codeString) {
        if (magnitude == null || magnitude == 0) {
            return null;
        }
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
        String value = "";
        switch (codeString) {
            case "13":
                value = resourceBundle.getString("msg.tahod.bime.paye");
                break;
            case "10":
                value = resourceBundle.getString("msg.takhfif");
                break;
            case "12":
                value = resourceBundle.getString("msg.kharej.az.tahod");
                break;
            case "1":
                value = resourceBundle.getString("msg.takmili");
                break;
        }
        QuantitiesVO quantitiesVO = new QuantitiesVO();
        quantitiesVO.setName(getDocodedtext("thritaEHR.otherCost", value, codeString));
        quantitiesVO.setValue(getDoquantity(magnitude, RIAL));
        return quantitiesVO;
    }

    @Override
    public CauseVO convertCauseVo(Integer sepasId) {
        return null;
    }

    @Override
    public ArrayOfDiagnosisVO convertDiagnosisVo(Integer sepasId) {
        List<DiagnosisVo> diagnosisVoList = diagnosisVoDao.getList(sepasId);
        DiagnosisVO diagnosisVO;
        ArrayOfDiagnosisVO arrayOfDiagnosisVO = new ArrayOfDiagnosisVO();
        for (DiagnosisVo vo : diagnosisVoList) {
            diagnosisVO = new DiagnosisVO();
            diagnosisVO.setComment(vo.getComment());
            diagnosisVO.setStatus(getDocodedtext("thritaEHR.daignosis.status", "", vo.getStatusCode()));
            diagnosisVO.setSeverity(convertDoordinal());
            diagnosisVO.setDiagnosisTime(getTime(vo.getDiagnosisHour(), vo.getDiagnosisMinute(), vo.getDiagnosisSecond()));
//            diagnosisVO.setDiagnosisDate(getDate(vo.getDiagnosisYear(), vo.getDiagnosisMonth(), vo.getDiagnosisDay()));
            diagnosisVO.setDiagnosis(getDocodedtext("ICD10", "", vo.getDiagnosisCode()));
//            diagnosisVOList[0]=(diagnosisVO);
            arrayOfDiagnosisVO.getDiagnosisVO().add(diagnosisVO);
        }
        return arrayOfDiagnosisVO;
    }

    private DOORDINAL convertDoordinal() {
        DOORDINAL doordinal = new DOORDINAL();
        doordinal.setSymbol(null);
        doordinal.setValue(1);
        return doordinal;
    }

    @Override
    public DischargeVO convertDischargeVo(Integer sepasId) {
        DischargeVo discharge = dischargeVoDao.getById(sepasId);
        DischargeVO dischargeVO = new DischargeVO();
        dischargeVO.setConditionOnDischarge(getDocodedtext("thritaEHR.conditionOnDischarge", "", discharge.getConditionOnDischargeCode()));//todo
        dischargeVO.setDischargeDate(getDate(discharge.getDischargeYear(), discharge.getDischargeMonth(), discharge.getDischargeDay()));
        dischargeVO.setDischargeTime(getTime(discharge.getDischargeHour(), discharge.getDischargeMinute(), discharge.getDischargeSecond()));
        return dischargeVO;
    }

    @Override
    public HighLevelAreaVO convertHighLevelAreaVo(Integer sepasId) {
        return null;
    }

    @Override
    public ArrayOfInsuranceVO convertInsuranceVo(Integer sepasId) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
        InsuranceVO insuranceVO = new InsuranceVO();
        InsuranceVo insurance = new InsuranceVo();
        insuranceVO.setInsuranceBookletSerialNumber(insurance.getInsuranceBookletSerialNumber());
        insuranceVO.setSHEBAD(getDoidentifier("IHIO", insurance.getShebad(), "IHIO", "HID"));
        insuranceVO.setInsurer(getDocodedtext("thritaEHR.Insurer", "", insurance.getInsurerCode()));
        insuranceVO.setInsuredNumber(insurance.getInsuredNumber());
//        insuranceVO.setInsuranceOtherCosts();
//        insuranceVO.setInsuranceExpirationDate(getDate(insurance.getInsuranceExpirationYear(), insurance.getInsuranceExpirationMonth(), insurance.getInsuranceExpirationDay()));
//        insuranceVO.setInsuranceContribution();
        insuranceVO.setInsuranceBox(getDocodedtext("thritaEHR.insuranceBox", resourceBundle.getString("msg.insurer.ihio"), insurance.getInsuranceBoxCode()));
        ArrayOfInsuranceVO arrayOfInsuranceVO = new ArrayOfInsuranceVO();
        arrayOfInsuranceVO.getInsuranceVO().add(insuranceVO);
        return arrayOfInsuranceVO;
    }

    @Override
    public OrganizationVO convertOrganizationVo(Integer sepasId) {
        OrganizationVO organizationVO = new OrganizationVO();
        OrganizationVo org = organizationDao.getById(1);
        organizationVO.setName(org.getName());
        organizationVO.setID(getDoidentifier("MOHME_IT", org.getIdOrgan(), "MOHME_IT", "Org_ID"));
        return organizationVO;
    }

    @Override
    public PersonInfoVO convertPersonInfoVo(Integer sepasId) {
        PersonInfoVo person = personDao.getById(sepasId);
        PersonInfoVO personInfoVO = new PersonInfoVO();
        DODATE bDate = new DODATE();
        bDate.setDay(person.getBirthDay());
        bDate.setMonth(person.getBirthMonth());
        bDate.setYear(person.getBirthYear());
        personInfoVO.setBirthDate(bDate);
        personInfoVO.setFirstName(person.getFirstName());
        personInfoVO.setLastName(person.getLastName());
        personInfoVO.setNationalCode(person.getNationalCode());
        return personInfoVO;
    }

    @Override
    public ArrayOfServiceDetailsVO1 convertServiceDetailesVo(Integer sepasId) {
        List<ServiceDetailesVo> list = serviceDetailesVoDao.getList(sepasId);
        ArrayOfServiceDetailsVO1 arrayOfServiceDetailsVO1 = new ArrayOfServiceDetailsVO1();
        for (ServiceDetailesVo vo : list) {
            ServiceDetailsVO p = new ServiceDetailsVO();
            p.setBasicInsuranceContribution(getDoquantity(vo.getBasicInsuranceContribution(), UNIT));
            p.setTotalCharge(getDoquantity(vo.getTotalCharge(), UNIT));
            p.setServiceType(getDocodedtext("thritaEHR.serviceType", vo.getServiceTitle(), vo.getServiceType().toString()));
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setPatientContribution(getDoquantity(vo.getPatientContribution(), UNIT));
            p.setOtherCosts(convertArrayOfQuantitiesVO(vo));
            p.setBed(vo.getBed());
            p.setWardType(getDocodedtext("thritaEHR.wardType", vo.getWardName(), vo.getWardType()));
            p.setWardName(vo.getWardName());
            p.setStartTime(getTime(vo.getStartHour(), vo.getStartMinute(), vo.getStartSecond()));
            p.setStartDate(getDate(vo.getStartYear(), vo.getStartMonth(), vo.getStartDay()));
//            p.setServiceProvider();
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setRoom(vo.getRoom());
            p.setRelativeCost(convert(vo));
            p.setPKID(vo.getPkid());
//            p.setExtraLocation();
            p.setEndTime(getTime(vo.getEndHour(), vo.getEndMinute(), vo.getEndSecond()));
            p.setEndDate(getDate(vo.getEndYear(), vo.getEndMonth(), vo.getEndDay()));
            arrayOfServiceDetailsVO1.getServiceDetailsVO().add(p);
        }
        return arrayOfServiceDetailsVO1;
    }

    private ArrayOfRelativeCostVO convert(ServiceDetailesVo vo) {
        ArrayOfRelativeCostVO relativeCostVOList = new ArrayOfRelativeCostVO();
        RelativeCostVO costVO;

        costVO = convertRelativeCost(vo.getZaribHerfei(), "2");
        if (costVO != null)
            relativeCostVOList.getRelativeCostVO().add(costVO);
        costVO = convertRelativeCost(vo.getZaribFani(), "7");
        if (costVO != null)
            relativeCostVOList.getRelativeCostVO().add(costVO);
        return relativeCostVOList;
    }

    private RelativeCostVO convertRelativeCost(Double kValue, String codedString) {
        if (kValue == null || kValue == 0) {
            return null;
        }
        RelativeCostVO costVO = new RelativeCostVO();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
        String value = "";
        switch (codedString) {
            case "1":
                value = resourceBundle.getString("msg.bihoushi");
                break;
            case "2":
                value = resourceBundle.getString("msg.dakheli");
                break;
            case "4":
                value = resourceBundle.getString("msg.jarahi");
                break;
            case "7":
                value = resourceBundle.getString("msg.omoumi");
                break;
        }
        costVO.setKType(getDocodedtext("thritaEHR.kType", "value", codedString));
        costVO.setKValue(kValue);
        return costVO;
    }

    private ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(ServiceDetailesVo vo) {
        ArrayOfQuantitiesVO quantitiesVOList = new ArrayOfQuantitiesVO();
        QuantitiesVO quantitiesVO = new QuantitiesVO();
        quantitiesVO = convertQuantitiesVO(vo.gettCost(), "13");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(vo.getdCost(), "12");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
//        quantitiesVO = convertQuantitiesVO(vo.getTakhfif(), "10");
//        if (quantitiesVO != null)
//            quantitiesVOList.add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(vo.getTakmiliCost(), "1");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        return quantitiesVOList;
    }

    @Override
    public ArrayOfServiceGroupRowVO convertServiceGroupRowVo(Integer sepasId) {
        List<ServiceGroupRowVo> list = serviceGroupRowVoDao.getList(sepasId);
        ArrayOfServiceGroupRowVO serviceGroupRowVOList = new ArrayOfServiceGroupRowVO();
        for (ServiceGroupRowVo vo : list) {
            ServiceGroupRowVO p = new ServiceGroupRowVO();
            p.setBasicInsuranceContribution(getDoquantity(vo.getBasicInsuranceContribution(), UNIT));
            p.setTotalCharge(getDoquantity(vo.getTotalCharge(), UNIT));
            p.setServiceType(getDocodedtext("hritaEHR.serviceType", vo.getServiceTitle(), vo.getServiceType().toString()));
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setPatientContribution(getDoquantity(vo.getPatientContribution(), UNIT));
            p.setOtherCosts(convertArrayOfQuantitiesVO(vo));
            serviceGroupRowVOList.getServiceGroupRowVO().add(p);
        }
        return (ArrayOfServiceGroupRowVO) serviceGroupRowVOList;//todo
    }

    private ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(ServiceGroupRowVo vo) {
        ArrayOfQuantitiesVO quantitiesVOList = new ArrayOfQuantitiesVO();
        QuantitiesVO quantitiesVO = new QuantitiesVO();
        quantitiesVO = convertQuantitiesVO(vo.gettCost(), "13");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(vo.getdCost(), "12");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
//        quantitiesVO = convertQuantitiesVO(vo.getTakhfif(), "10");
//        if (quantitiesVO != null)
//            quantitiesVOList.add(quantitiesVO);
        quantitiesVO = convertQuantitiesVO(vo.getTakmiliCost(), "1");
        if (quantitiesVO != null)
            quantitiesVOList.getQuantitiesVO().add(quantitiesVO);
        return (ArrayOfQuantitiesVO) quantitiesVOList;
    }

    @Override
    public HospitalWardVO convertHospitalWardVo(Integer sepasId) {
        HospitalWardVo ward = hospitalWardVoDao.getById(sepasId);
        HospitalWardVO hospitalWardVO = new HospitalWardVO();
        hospitalWardVO.setBed(ward.getBed());
        hospitalWardVO.setName(ward.getName());
        hospitalWardVO.setRoom(ward.getRoom());
        DOCODEDTEXT type = new DOCODEDTEXT();
        type.setCodedString(ward.getTypeCode());
        type.setTerminologyId("takht");
        type.setValue(ward.getName());
        hospitalWardVO.setType(type);
        return hospitalWardVO;
    }

    private DOTIME getTime(Integer hour, Integer minute, Integer second) {
        if (hour == null || minute == null || second == null)
            return null;
        DOTIME dotime = new DOTIME();
        dotime.setHour(hour);
        dotime.setMinute(minute);
        dotime.setSecond(second);
        return dotime;
    }

    private DODATE getDate(Integer year, Integer month, Integer day) {
        if (year == null || month == null || day == null)
            return null;
        DODATE dodate = new DODATE();
        dodate.setYear(year);
        dodate.setMonth(month);
        dodate.setDay(day);
        return dodate;
    }

    private DOCODEDTEXT getDocodedtext(String terminologyId, String value, String codedString) {
        DOCODEDTEXT docodedtext = new DOCODEDTEXT();
        docodedtext.setTerminologyId(terminologyId);
        docodedtext.setValue(value);
        docodedtext.setCodedString(codedString);
        return docodedtext;
    }

    private DOQUANTITY getDoquantity(Double magnitude, String unit) {
        DOQUANTITY doquantity = new DOQUANTITY();
        doquantity.setMagnitude(magnitude);
        doquantity.setUnit(unit);
        return doquantity;
    }

    private DOIDENTIFIER getDoidentifier(String assigner, String id, String issuer, String type) {
        DOIDENTIFIER doidentifier = new DOIDENTIFIER();
        doidentifier.setAssigner(assigner);
        doidentifier.setID(id);
        doidentifier.setIssuer(issuer);
        doidentifier.setType(type);
        return doidentifier;
    }
}
