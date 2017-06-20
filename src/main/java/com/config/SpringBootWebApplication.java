package com.config;

import java.io.File;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.blockchain.HelloBlockchainWorld;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
			SpringApplication.run(SpringBootWebApplication.class, args);
			
			String path = new File(".").getCanonicalPath();
			System.out.println(path);
			
			HelloBlockchainWorld test = new HelloBlockchainWorld();
			
			test.deployAndTest();
	}

}