package com.fio.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProyCrudProductosSpringboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyCrudProductosSpringboot1Application.class, args);
	}

}
