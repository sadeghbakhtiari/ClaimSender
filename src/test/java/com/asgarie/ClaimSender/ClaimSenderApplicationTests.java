package com.asgarie.ClaimSender;

import com.asgarie.ClaimSender.dao.api.AdmissionDao;
import com.asgarie.ClaimSender.entity.asg.AdmissionVo;
import com.asgarie.ClaimSender.service.api.AskarService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClaimSenderApplicationTests {

	@Autowired
	private AskarService askarService;

	@Test
	public void contextLoads() {
		AdmissionVo admissionVo = askarService.getAdmissionVo(1);
		Assert.assertNotNull(admissionVo);
	}

}
