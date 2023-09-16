package dev.marksduarte.cnbsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CnbsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnbsServiceApplication.class, args);
	}

}
