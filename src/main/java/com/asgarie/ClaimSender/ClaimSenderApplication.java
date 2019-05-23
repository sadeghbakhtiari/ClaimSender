package com.asgarie.ClaimSender;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import service.BillPatientLib;
import service.api.AvaBillPatientService;

@SpringBootApplication
@EnableScheduling
@Import(BillPatientLib.class)
public class ClaimSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimSenderApplication.class, args);
	}

}
