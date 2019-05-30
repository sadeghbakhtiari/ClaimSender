package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.dao.api.*;
import com.asgarie.ClaimSender.entity.ask.*;
import com.asgarie.ClaimSender.entity.ask.ehr.*;
import com.asgarie.ClaimSender.service.api.AskarService;
import com.asgarie.ClaimSender.service.common.CommonUtils;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.apache.commons.math3.util.Precision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.api.AvaBillPatientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    @Autowired
    private EhrDao ehrDao;

    @Override
    public void showHelloMessage() {
        buildMessageVo();
//        System.out.println("--------------------------");
//        List<PatientTransfer> patientTransferList = patientTransferDao.getAllPatientTransferList();
//        patientTransferList.forEach(pt ->);
        Integer sepasId = 80;
        PatientBillMessageVO patientBillMessageVO = convertPatientBillMessageVO(sepasId);
        ResultVO resultVO = avaBillPatientService.savePatientBillMessageVo(patientBillMessageVO);
        patientTransferDao.updatePatientTransfer(sepasId, resultVO);
        System.out.println(resultVO);
    }


    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void callWebService(Integer sepasId) {
        try {
            PatientBillMessageVO patientBillMessageVO = convertPatientBillMessageVO(sepasId);
            ResultVO resultVO = avaBillPatientService.savePatientBillMessageVo(patientBillMessageVO);
            patientTransferDao.updatePatientTransfer(sepasId, resultVO);
        }catch (Exception e){
//            patientTransferDao.
        }
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
        messageIdentifierVO.setSystemID(getDoidentifier("MOHME_IT", "98745133542", "MOHME_IT", "System_ID"));
//        messageIdentifierVO.setISQueriable();
//        messageIdentifierVO.setHealthCareFacilityID();
//        messageIdentifierVO.setCompositionUID();
//        messageIdentifierVO.setCompositionSignature();
        return messageIdentifierVO;
    }

    @Override
    public AdmissionVO convertAdmissionVo(Integer sepasId) {
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
        EhrAadmisionType ehrAadmisionType = (EhrAadmisionType) ehrDao.getByEhrCode(EhrAadmisionType.class, admission.getAdmissionTypeCode());
        admissionVO.setAdmissionType(getDocodedtext("thritaEHR.admissionType", ehrAadmisionType.getValue(), ehrAadmisionType.getCode()));
        return admissionVO;
    }

    @Override
    public BasicDeathDetailsVO convertBasicDeathDetailsVo(Integer sepasId) {
        BasicDeathDetailsVo detailsVo = basicDeathDetailsVoDao.getById(sepasId);
        BasicDeathDetailsVO basicDeathDetailsVO = new BasicDeathDetailsVO();
//        basicDeathDetailsVO.setCause();//todo update
        EhrWardType wardType = (EhrWardType) ehrDao.getByEhrCode(EhrWardType.class, detailsVo.getHospitalWardVo() == null ? null : detailsVo.getHospitalWardVo().toString());
        basicDeathDetailsVO.setHospitalWard(getDocodedtext("thritaEHR.wardType", wardType.getValue(), wardType.getCode()));
        basicDeathDetailsVO.setDeathTime(getTime(detailsVo.getDeathHour(), detailsVo.getDeathMinute(), detailsVo.getDeathSecond()));
        EhrDeathLocation ehrDeathLocation = (EhrDeathLocation) ehrDao.getByEhrCode(EhrDeathLocation.class, detailsVo.getDeathLocationCode());
        basicDeathDetailsVO.setDeathLocation(getDocodedtext("thritaEHR.deathLocation", ehrDeathLocation.getValue(), ehrDeathLocation.getCode()));
        basicDeathDetailsVO.setDeathDate(getDate(detailsVo.getDeathYear(), detailsVo.getDeathMonth(), detailsVo.getDeathDay()));
        return basicDeathDetailsVO;
    }

    @Override
    public BillSummaryVO convertBillSummaryVo(Integer sepasId) {
        AdmissionVo admission = admissionDao.getById(sepasId);

        BillSummaryVo billSummary = billSummaryVoDao.getById(sepasId);
        BillSummaryVO billSummaryVO = new BillSummaryVO();
        billSummaryVO.setGlobalPackage(null);
        billSummaryVO.setTotalPatientContribution(getDoquantity(billSummary.getTotalPatientContribution(), UNIT));
        billSummaryVO.setTotalOtherCosts(convertArrayOfQuantitiesVO(billSummary));
        billSummaryVO.setTotalCharge(getDoquantity(billSummary.getTotalCharge(), UNIT));
        billSummaryVO.setTotalBasicInsuranceContribution(getDoquantity(billSummary.getTotalBasicInsuranceContribution(), UNIT));
        billSummaryVO.setServiceGroupRow(convertServiceGroupRowVo(sepasId));
        EhrMedicalRecordType medicalRecordType = (EhrMedicalRecordType) ehrDao.getByEhrCode(EhrMedicalRecordType.class, billSummary.getMedicalRecordTypeCode());
        billSummaryVO.setMedicalRecordType(getDocodedtext("thritaEHR.medicalRecordType", medicalRecordType.getValue(), medicalRecordType.getCode()));
        billSummaryVO.setInsurerBox(null);
        billSummaryVO.setHospitalAccreditation(1);
        return billSummaryVO;
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
        return quantitiesVOList;
    }

    private QuantitiesVO convertQuantitiesVO(Double magnitude, String codeString) {
        if (magnitude == null || magnitude == 0) {
            return null;
        }

        QuantitiesVO quantitiesVO = new QuantitiesVO();
        EhrOtherCost otherCost = (EhrOtherCost) ehrDao.getByEhrCode(EhrOtherCost.class, codeString);
        quantitiesVO.setName(getDocodedtext("thritaEHR.otherCost", otherCost.getValue(), otherCost.getCode()));
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
            EhrDiagnosisStatus diagnosisStatus = (EhrDiagnosisStatus) ehrDao.getByEhrCode(EhrDiagnosisStatus.class, vo.getStatusCode());
            diagnosisVO.setStatus(getDocodedtext("thritaEHR.daignosis.status", diagnosisStatus.getValue(), diagnosisStatus.getCode()));
            diagnosisVO.setSeverity(convertDoordinal());
            diagnosisVO.setDiagnosisTime(getTime(vo.getDiagnosisHour(), vo.getDiagnosisMinute(), vo.getDiagnosisSecond()));
            diagnosisVO.setDiagnosisDate(getDate(vo.getDiagnosisYear(), vo.getDiagnosisMonth(), vo.getDiagnosisDay()));
            diagnosisVO.setDiagnosis(getDocodedtext("ICD10", "", vo.getDiagnosisCode()));//todo update
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
        EhrConditionOnDischarge conditionOnDischarge = (EhrConditionOnDischarge) ehrDao.getByEhrCode(EhrConditionOnDischarge.class, discharge.getConditionOnDischargeCode());
        dischargeVO.setConditionOnDischarge(getDocodedtext("thritaEHR.conditionOnDischarge", conditionOnDischarge.getValue(), conditionOnDischarge.getCode()));
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
        InsuranceVO insuranceVO = new InsuranceVO();
        InsuranceVo insurance = insuranceVoDao.getById(sepasId);
        insuranceVO.setInsuranceBookletSerialNumber(insurance.getInsuranceBookletSerialNumber());
        insuranceVO.setSHEBAD(getDoidentifier("IHIO", insurance.getShebad(), "IHIO", "HID"));
        EhrInsurer insurer = (EhrInsurer) ehrDao.getByEhrCode(EhrInsurer.class, insurance.getInsurerCode());

        insuranceVO.setInsurer(getDocodedtext("thritaEHR.Insurer", insurer.getValue(), insurer.getCode()));
        insuranceVO.setInsuredNumber(insurance.getInsuredNumber());
//        insuranceVO.setInsuranceOtherCosts();
//        insuranceVO.setInsuranceExpirationDate(getDate(insurance.getInsuranceExpirationYear(), insurance.getInsuranceExpirationMonth(), insurance.getInsuranceExpirationDay()));
//        insuranceVO.setInsuranceContribution();
        EhrInsuranceBox insuranceBox = (EhrInsuranceBox) ehrDao.getByEhrCode(EhrInsuranceBox.class, insurance.getInsuranceBoxCode());
        insuranceVO.setInsuranceBox(getDocodedtext("thritaEHR.insuranceBox", insuranceBox.getValue(), insuranceBox.getCode()));
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
        personInfoVO.setBirthDate(getDate(person.getBirthYear(), person.getBirthMonth(), person.getBirthDay()));
        personInfoVO.setFirstName(person.getFirstName());
        personInfoVO.setLastName(person.getLastName());
        personInfoVO.setNationalCode(person.getNationalCode());
        EhrGender gender=(EhrGender)ehrDao.getByEhrCode(EhrGender.class,person.getGenderCode());
        personInfoVO.setGender(getDocodedtext("thritaEHR.gender",gender.getValue(),gender.getCode()));
        personInfoVO.setFatherFirstName(person.getFatherFirstName());
        personInfoVO.setBirthTime(getTime(person.getBirthHour(),person.getBirthMinute(),person.getBirthSecond()));
        personInfoVO.setBirthdateAccuracy(null);
        personInfoVO.setEducationLevel(null);
        personInfoVO.setBirthPlaceArea(null);
        personInfoVO.setFatherLastName(person.getFatherLastName());
        personInfoVO.setFullAddress(person.getFullAddress());
        personInfoVO.setFullName(person.getFullName());
        personInfoVO.setHomeTel(person.getHomeTel());
        personInfoVO.setIDCardNumber(person.getIdCardNumber());
        personInfoVO.setIDIssueArea(null);
        personInfoVO.setJob(null);
        personInfoVO.setJobDescribtion(person.getJobDescription());
        personInfoVO.setLivingPlaceArea(null);
        personInfoVO.setReligion(getDocodedtext("","",""));
        personInfoVO.setPostalCode(person.getPostalCode());
        personInfoVO.setNationality(getDocodedtext("ISO_3166-1","","IR"));
        personInfoVO.setMotherLastName(person.getMotherLastName());
        personInfoVO.setMotherFirstName(person.getMotherFirstName());
        personInfoVO.setMobileNumber(person.getMobileNumber());
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
            EhrServiceType serviceType = (EhrServiceType) ehrDao.getByEhrCode(EhrServiceType.class, CommonUtils.handleFloat(vo.getServiceType()));
            p.setServiceType(getDocodedtext("thritaEHR.serviceType", serviceType.getValue(), CommonUtils.handleString(serviceType.getCode())));            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setPatientContribution(getDoquantity(vo.getPatientContribution(), UNIT));
            p.setOtherCosts(convertArrayOfQuantitiesVO(vo));
            p.setBed(vo.getBed());
            EhrWardType wardType = (EhrWardType) ehrDao.getByEhrCode(EhrWardType.class, vo.getWardType());
            p.setWardType(getDocodedtext("thritaEHR.wardType", wardType.getValue(), wardType.getCode()));
            p.setWardName(vo.getWardName());
            p.setStartTime(getTime(vo.getStartHour(), vo.getStartMinute(), vo.getStartSecond()));
            p.setStartDate(getDate(vo.getStartYear(), vo.getStartMonth(), vo.getStartDay()));
//            p.setServiceProvider();//todo update
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setRoom(vo.getRoom());
            p.setRelativeCost(convert(vo));
            p.setPKID(vo.getPkid());
//            p.setExtraLocation();//todo update
            p.setEndTime(getTime(vo.getEndHour(), vo.getEndMinute(), vo.getEndSecond()));
            p.setEndDate(getDate(vo.getEndYear(), vo.getEndMonth(), vo.getEndDay()));
            p.setService(getDocodedtext(vo.getTerminology(),vo.getServiceTitle(),vo.getServiceCode()));
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
        kValue = Precision.round(kValue, 2);
        RelativeCostVO costVO = new RelativeCostVO();
        EhrKType kType = (EhrKType) ehrDao.getByEhrCode(EhrKType.class, codedString);
        costVO.setKType(getDocodedtext("thritaEHR.kType", kType.getValue(), kType.getCode()));
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
            EhrServiceType serviceType = (EhrServiceType) ehrDao.getByEhrCode(EhrServiceType.class, CommonUtils.handleFloat(vo.getServiceType()));
            p.setServiceType(getDocodedtext("thritaEHR.serviceType", serviceType.getValue(), CommonUtils.handleString(serviceType.getCode())));
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setPatientContribution(getDoquantity(vo.getPatientContribution(), UNIT));
            p.setOtherCosts(convertArrayOfQuantitiesVO(vo));
            serviceGroupRowVOList.getServiceGroupRowVO().add(p);
        }
        return serviceGroupRowVOList;
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
        EhrWardType wardType = (EhrWardType) ehrDao.getByEhrCode(EhrWardType.class, ward.getTypeCode());
        hospitalWardVO.setType(getDocodedtext("thritaEHR.wardType", wardType.getValue(), wardType.getCode()));
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
        if (codedString == null || terminologyId == null || value == null) {
            return null;
        }
        DOCODEDTEXT docodedtext = new DOCODEDTEXT();
        docodedtext.setTerminologyId(terminologyId);
        docodedtext.setValue(value);
        docodedtext.setCodedString(codedString);
        return docodedtext;
    }

    private DOQUANTITY getDoquantity(Double magnitude, String unit) {
        if (magnitude == null || unit == null) {
            return null;
        }
        DOQUANTITY doquantity = new DOQUANTITY();
        doquantity.setMagnitude(magnitude);
        doquantity.setUnit(unit);
        return doquantity;
    }

    private DOIDENTIFIER getDoidentifier(String assigner, String id, String issuer, String type) {
        if (id == null)
            return null;
        DOIDENTIFIER doidentifier = new DOIDENTIFIER();
        doidentifier.setAssigner(assigner);
        doidentifier.setID(id);
        doidentifier.setIssuer(issuer);
        doidentifier.setType(type);
        return doidentifier;
    }
}
