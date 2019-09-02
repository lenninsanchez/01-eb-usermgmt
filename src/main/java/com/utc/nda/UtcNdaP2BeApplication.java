package com.utc.nda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableScheduling
@EnableResourceServer
public class UtcNdaP2BeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtcNdaP2BeApplication.class, args);
	}

}