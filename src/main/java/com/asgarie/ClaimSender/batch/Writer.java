package com.asgarie.ClaimSender.batch;

import com.asgarie.ClaimSender.entity.User;
import com.asgarie.ClaimSender.service.api.AvaBillPatientService;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private AvaBillPatientService avaBillPatientService;

    @Override
    public void write(List<? extends User> list) throws Exception {
//        System.out.println("In Write : " + list.get(0));
//        PatientBillMessageVO messageVO = new PatientBillMessageVO();
//        PersonInfoVO personInfoVO = new PersonInfoVO();
//        DODATE bDate = new DODATE();
//        bDate.setDay(2);
//        bDate.setMonth(5);
//        bDate.setYear(1368);
//        personInfoVO.setBirthDate(bDate);
//        personInfoVO.setFirstName("Emad");
//        personInfoVO.setLastName("Darvishi");
//        personInfoVO.setNationalCode("1150018461");
//        messageVO.setPerson(personInfoVO);
//        BillPatientCompositionVO compositionVO = new BillPatientCompositionVO();
//        AdmissionVO admissionVO = new AdmissionVO();
//        admissionVO.setMedicalRecordNumber("123456789");
//        OrganizationVO organizationVO = new OrganizationVO();
//        organizationVO.setName("Asgarie");
//        admissionVO.setInstitute(organizationVO);
//        compositionVO.setAdmission(admissionVO);
//        messageVO.setComposition(compositionVO);
//        ResultVO resultVO = avaBillPatientService.savePatientBillMessageVo(messageVO);
//        System.out.println(resultVO.getCompositionUID());
    }

}
