package com.bezkoder.spring.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class  SpringBootDataJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args).setApplicationStartup(new BufferingApplicationStartup(2048));
	}

}
