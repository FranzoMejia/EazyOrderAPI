package com.omejia.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.omejia.controller"),@ComponentScan("com.omejia.config")})
@EnableJpaRepositories("com.omejia.repository")
@EntityScan("com.omejia.model")
@EnableWebSecurity(debug=true)
public class SpringsecuritybasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritybasicApplication.class, args);
	}

}
