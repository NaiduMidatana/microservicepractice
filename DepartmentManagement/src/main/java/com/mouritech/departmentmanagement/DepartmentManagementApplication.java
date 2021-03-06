package com.mouritech.departmentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DepartmentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentManagementApplication.class, args);
	}

}
