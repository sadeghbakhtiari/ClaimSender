package com.asgarie.ClaimSender;

import com.asgarie.ClaimSender.dao.api.EhrDao;
import com.asgarie.ClaimSender.entity.ask.ehr.EhrInsuranceBox;
import com.asgarie.ClaimSender.service.api.AskarService;
//import model.ws.ir.gov.behdasht.sepas.PatientBillMessageVO;
//import model.ws.ir.gov.behdasht.thrita.vm.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import service.api.AvaBillPatientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClaimSenderApplicationTests {

    @Autowired
    private AskarService askarService;

    @Autowired
    private EhrDao ehrDao;

//	@Autowired
//	private AvaBillPatientService avaBillPatientService;

    @Test
    public void contextLoads() {

//		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
//		System.out.println(resourceBundle.getString("msg.text"));
//
        askarService.showHelloMessage();
//        EhrInsuranceBox e = (EhrInsuranceBox) ehrDao.getByEhrCode(EhrInsuranceBox.class, "26.1");
//        System.out.println(e);
    }

}
