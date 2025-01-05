package com.astrovasisth.spring_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDeployApplication.class, args);
	}

}
