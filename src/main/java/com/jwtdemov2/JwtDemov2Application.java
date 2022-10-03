package com.jwtdemov2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.jwtdemov2.config.RsaKeyProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtDemov2Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemov2Application.class, args);
	}

}
