package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.dao.api.*;
import com.asgarie.ClaimSender.entity.ask.*;
import com.asgarie.ClaimSender.service.api.AskarService;
import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AskarServiceImpl implements AskarService {
    public static final String TERMINOLOGY = "TERMINOLOGY";
    public static final String UNIT = "UNIT";

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
        DOCODEDTEXT admissionType = new DOCODEDTEXT();
        admissionType.setValue("----------");//TOODo update
        admissionType.setTerminologyId(TERMINOLOGY);
        admissionType.setCodedString(admission.getAdmissionTypeCode());
        admissionVO.setAdmissionType(admissionType);
        return admissionVO;
    }

    @Override
    public BasicDeathDetailsVO convertBasicDeathDetailsVo(Integer sepasId) {
        BasicDeathDetailsVo detailsVo = basicDeathDetailsVoDao.getById(sepasId);
        BasicDeathDetailsVO basicDeathDetailsVO = new BasicDeathDetailsVO();
//        basicDeathDetailsVO.setCause();//todo update
//        basicDeathDetailsVO.setHospitalWard();//todo update
        basicDeathDetailsVO.setDeathTime(getTime(detailsVo.getDeathHour(), detailsVo.getDeathMinute(), detailsVo.getDeathSecond()));
        basicDeathDetailsVO.setDeathLocation(getDocodedtext(TERMINOLOGY, "", detailsVo.getDeathLocationCode()));//todo update
        basicDeathDetailsVO.setDeathDate(getDate(detailsVo.getDeathYear(), detailsVo.getDeathMonth(), detailsVo.getDeathDay()));
        return null;
    }

    @Override
    public BillSummaryVO convertBillSummaryVo(Integer sepasId) {
        BillSummaryVo billSummary = billSummaryVoDao.getById(sepasId);
        BillSummaryVO billSummaryVO = new BillSummaryVO();
        billSummaryVO.setGlobalPackage(null);
        billSummaryVO.setTotalPatientContribution(getDoquantity(billSummary.getTotalPatientContribution(), UNIT));
        billSummaryVO.setTotalOtherCosts();
        billSummaryVO.setTotalCharge(getDoquantity(billSummary.getTotalCharge(), UNIT));
        billSummaryVO.setTotalBasicInsuranceContribution(getDoquantity(billSummary.getTotalBasicInsuranceContribution(), UNIT));
        billSummaryVO.setServiceGroupRow(convertServiceGroupRowVo(sepasId));
        billSummaryVO.setMedicalRecordType(getDocodedtext(TERMINOLOGY, "", billSummary.getMedicalRecordTypeCode()));//todo update
        billSummaryVO.setInsurerBox(null);
        billSummaryVO.setHospitalAccreditation(1);
        return null;
    }

    @Override
    public ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(BillSummaryVo billSummaryVo) {
        List<Qau>
        QuantitiesVO quantitiesVO = new QuantitiesVO();
        quantitiesVO.setName(getDocodedtext(TERMINOLOGY, "tarrif", "13"));
        quantitiesVO.setValue(getDoquantity(billSummaryVo.gettCost(), UNIT));
        arrayOfQuantitiesVO.
        return arrayOfQuantitiesVO;
    }

    @Override
    public CauseVO convertCauseVo(Integer sepasId) {
        return null;
    }

    @Override
    public ArrayOfDiagnosisVO convertDiagnosisVo(Integer sepasId) {
        List<DiagnosisVo> diagnosisVoList = diagnosisVoDao.getList(sepasId);
        ArrayOfDiagnosisVO arrayOfDiagnosisVO = new ArrayOfDiagnosisVO();
        arrayOfDiagnosisVO.
        return null;
    }

    @Override
    public DischargeVO convertDischargeVo(Integer sepasId) {
        DischargeVo discharge = dischargeVoDao.getById(sepasId);
        DischargeVO dischargeVO = new DischargeVO();
        dischargeVO.setConditionOnDischarge(getDocodedtext(TERMINOLOGY, "", discharge.getConditionOnDischargeCode()));//todo
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
        InsuranceVo insurance = new InsuranceVo();
        insuranceVO.setInsuranceBookletSerialNumber(insurance.getInsuranceBookletSerialNumber());
        insuranceVO.setSHEBAD();
        insuranceVO.setInsurer(getDocodedtext(TERMINOLOGY, "", insurance.getInsurerCode()));
        insuranceVO.setInsuredNumber(insurance.getInsuredNumber());
//        insuranceVO.setInsuranceOtherCosts();
        insuranceVO.setInsuranceExpirationDate(getDate(insurance.getInsuranceExpirationYear(), insurance.getInsuranceExpirationMonth(), insurance.getInsuranceExpirationDay()));
//        insuranceVO.setInsuranceContribution();
        insuranceVO.setInsuranceBox(getDocodedtext(TERMINOLOGY, "", insurance.getInsuranceBoxCode()));
        return null;
    }

    @Override
    public OrganizationVO convertOrganizationVo(Integer sepasId) {
        OrganizationVO organizationVO = new OrganizationVO();
        OrganizationVo org = organizationDao.getById(1);
        organizationVO.setName(org.getName());
        organizationVO.setID(getDoidentifier());
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
        List<ServiceDetailsVO> serviceDetailsVOLis = new ArrayList<>();
        List<ServiceDetailsVO> serviceDetailsVOList = new ArrayList<>();
        for (ServiceDetailesVo vo : list) {
            ServiceDetailsVO p = new ServiceDetailsVO();
            p.setBasicInsuranceContribution(getDoquantity(vo.getBasicInsuranceContribution(), UNIT));
            p.setTotalCharge(getDoquantity(vo.getTotalCharge(), UNIT));
            p.setServiceType(getDocodedtext(TERMINOLOGY, vo.getServiceTitle(), vo.getServiceType().toString()));
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setPatientContribution(getDoquantity(vo.getPatientContribution(), UNIT));
            p.setOtherCosts(convertArrayOfQuantitiesVO(vo));
            p.setBed(vo.getBed());
            p.setWardType(getDocodedtext(TERMINOLOGY,vo.getWardName(),vo.getWardType()));
            p.setWardName(vo.getWardName());
            p.setStartTime(getTime(vo.getStartHour(),vo.getStartMinute(),vo.getStartSecond()));
            p.setStartDate(getDate(vo.getStartYear(),vo.getStartMonth(),vo.getStartDay()));
            p.setServiceProvider();
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()),UNIT));
            p.setRoom(vo.getRoom());
            p.setRelativeCost();
            p.setPKID(vo.getPkid());
            p.setExtraLocation();
            p.setEndTime(getTime(vo.getEndHour(),vo.getEndMinute(),vo.getEndSecond()));
            p.setEndDate(getDate(vo.getEndYear(),vo.getEndMonth(),vo.getEndDay()));
            serviceDetailsVOList.add(p);
        }
        return (ArrayOfServiceDetailsVO1) serviceDetailsVOList;
    }

    private ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(ServiceDetailesVo vo) {
        return null;
    }

    @Override
    public ArrayOfServiceGroupRowVO convertServiceGroupRowVo(Integer sepasId) {
        List<ServiceGroupRowVo> list = serviceGroupRowVoDao.getList(sepasId);
        List<ServiceGroupRowVO> serviceGroupRowVOList = new ArrayList<>();
        for (ServiceGroupRowVo vo : list) {
            ServiceGroupRowVO p = new ServiceGroupRowVO();
            p.setBasicInsuranceContribution(getDoquantity(vo.getBasicInsuranceContribution(), UNIT));
            p.setTotalCharge(getDoquantity(vo.getTotalCharge(), UNIT));
            p.setServiceType(getDocodedtext(TERMINOLOGY, vo.getServiceTitle(), vo.getServiceType().toString()));
            p.setServiceCount(getDoquantity(Double.valueOf(vo.getServiceCount()), UNIT));
            p.setPatientContribution(getDoquantity(vo.getPatientContribution(), UNIT));
            p.setOtherCosts(convertArrayOfQuantitiesVO(vo));
            serviceGroupRowVOList.add(p);
        }
        return (ArrayOfServiceGroupRowVO) serviceGroupRowVOList;//todo
    }

    private ArrayOfQuantitiesVO convertArrayOfQuantitiesVO(ServiceGroupRowVo vo) {
        return null;
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

    private DOTIME getTime(int hour, int minute, int second) {
        DOTIME dotime = new DOTIME();
        dotime.setHour(hour);
        dotime.setMinute(minute);
        dotime.setSecond(second);
        return dotime;
    }

    private DODATE getDate(int year, int month, int day) {
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
