package com.asgarie.ClaimSender;

import com.asgarie.ClaimSender.entity.ask.ServiceDetailesVo;
import com.asgarie.ClaimSender.service.api.AskarService;
//import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
//import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.apache.commons.math3.util.Precision;
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

//		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
//		System.out.println(resourceBundle.getString("msg.text"));
//
		askarService.showHelloMessage();
	}

}
