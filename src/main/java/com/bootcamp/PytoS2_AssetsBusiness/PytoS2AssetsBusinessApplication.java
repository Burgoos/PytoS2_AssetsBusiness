package com.bootcamp.PytoS2_AssetsBusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PytoS2AssetsBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(PytoS2AssetsBusinessApplication.class, args);
	}

}
