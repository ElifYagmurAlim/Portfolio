package com.elifyagmuralim.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.elifyagmuralim.portfolio")
@EntityScan(basePackages = "com.elifyagmuralim.portfolio.model")
@EnableJpaRepositories(basePackages = "com.elifyagmuralim.portfolio.repository")
public class PortfolioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PortfolioApplication.class, args);

	}

}
