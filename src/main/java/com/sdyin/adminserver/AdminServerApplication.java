package com.sdyin.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAdminServer
@EnableAutoConfiguration
public class AdminServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(AdminServerApplication.class, args);
	}
}
