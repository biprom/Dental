package com.dental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dental.DentalWorkCycleRunner;
import com.dental.SharedData;

@SpringBootApplication
@ComponentScan(basePackages = "com.dental")
@Configuration

public class DentalApplication {


	public static void main(String[] args) {
	
		
		
		
		SpringApplication.run(DentalApplication.class, args);
		

	}
	
	
	
	@Bean
	@Scope("singleton")
	public DentalWorkCycleRunner dentalCycleRunner(){
		return new DentalWorkCycleRunner();
	}
//	
//	@Bean
//	@Scope("singleton")
//	public Data sharedData(){
//		return new Data();
//	}
}
