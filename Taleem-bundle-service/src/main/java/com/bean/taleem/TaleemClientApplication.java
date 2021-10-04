package com.bean.taleem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TaleemClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaleemClientApplication.class, args);
	}

}
