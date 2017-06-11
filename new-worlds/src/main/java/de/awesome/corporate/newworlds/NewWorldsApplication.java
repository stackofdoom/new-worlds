package de.awesome.corporate.newworlds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class NewWorldsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewWorldsApplication.class, args);
	}
}
