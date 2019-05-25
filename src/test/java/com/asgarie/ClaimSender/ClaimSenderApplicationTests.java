package com.asgarie.ClaimSender;

import com.asgarie.ClaimSender.entity.ask.ServiceDetailesVo;
import com.asgarie.ClaimSender.service.api.AskarService;
//import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
//import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;
import java.util.ResourceBundle;
//import service.api.AvaBillPatientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClaimSenderApplicationTests {

	@Autowired
	private AskarService askarService;

//	@Autowired
//	private AvaBillPatientService avaBillPatientService;

	@Test
	public void contextLoads() {
//		askarService.showHelloMessage();

//		PatientBillMessageVO messageVO = new PatientBillMessageVO();
//		PersonInfoVO personInfoVO = new PersonInfoVO();
//		DODATE bDate = new DODATE();
//		bDate.setDay(2);
//		bDate.setMonth(5);
//		bDate.setYear(1368);
//		personInfoVO.setBirthDate(bDate);
//		personInfoVO.setFirstName("Emad");
//		personInfoVO.setLastName("Darvishi");
//		personInfoVO.setNationalCode("1150018461");
//		messageVO.setPerson(personInfoVO);
//		BillPatientCompositionVO compositionVO = new BillPatientCompositionVO();
//		AdmissionVO admissionVO = new AdmissionVO();
//		admissionVO.setMedicalRecordNumber("123456789");
//		OrganizationVO organizationVO = new OrganizationVO();
//		organizationVO.setName("Asgarie");
//		admissionVO.setInstitute(organizationVO);
//		compositionVO.setAdmission(admissionVO);
//		messageVO.setComposition(compositionVO);
//		ResultVO resultVO = avaBillPatientService.savePatientBillMessageVo(messageVO);
//		System.out.println(resultVO.getCompositionUID());
//		System.out.println("salaaaaaaaaam");
//		askarService.showHelloMessage();
		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
		System.out.println(resourceBundle.getString("msg.text"));

		askarService.showHelloMessage();

//		askarService.convertArrayOfQuantitiesVO(null);

	}

}
