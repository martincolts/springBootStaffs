package com.probando.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.probando.algo" , "com.probando.algo.user"})
/*@EntityScan(value = "com.probando.algo.user")
@EnableJpaRepositories("com.probando.algo.user")*/
@SpringBootApplication
public class AlgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgoApplication.class, args);
	}
}
