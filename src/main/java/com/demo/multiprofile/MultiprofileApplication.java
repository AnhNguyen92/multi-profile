package com.demo.multiprofile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.multiprofile.config.ServerProperties;

@SpringBootApplication
public class MultiprofileApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MultiprofileApplication.class);

	@Autowired
    private ServerProperties serverProperties;

	public static void main(String[] args) {
		SpringApplication.run(MultiprofileApplication.class, args);

	}

	@Override
	public void run(String... args) {
		log.info("Server email: {}", serverProperties.getEmail());
	}
}
