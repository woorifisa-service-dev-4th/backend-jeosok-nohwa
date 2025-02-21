package com.zero.jeosoknohwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JeosoknohwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeosoknohwaApplication.class, args);
	}

}
