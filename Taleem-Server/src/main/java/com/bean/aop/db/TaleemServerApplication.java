package com.bean.aop.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaServer
public class TaleemServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaleemServerApplication.class, args);
	}

//	@Bean
//	public WebClient getWebClient() {
//		return WebClient.create("http://localhost:8761");
//	}

}