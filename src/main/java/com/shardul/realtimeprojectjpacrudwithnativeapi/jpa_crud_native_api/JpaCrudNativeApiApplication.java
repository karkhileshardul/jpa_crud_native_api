package com.shardul.realtimeprojectjpacrudwithnativeapi.jpa_crud_native_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = {"com.shardul.realtimeprojectjpacrudwithnativeapi.entity"})
@ComponentScan(basePackages ={"com.shardul.realtimeprojectjpacrudwithnativeapi.rest","com.shardul.realtimeprojectjpacrudwithnativeapi.dao","com.shardul.realtimeprojectjpacrudwithnativeapi.service"})
@SpringBootApplication
public class JpaCrudNativeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudNativeApiApplication.class, args);
	}

}
