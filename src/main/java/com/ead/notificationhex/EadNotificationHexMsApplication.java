package com.ead.notificationhex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EadNotificationHexMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EadNotificationHexMsApplication.class, args);
	}

}
