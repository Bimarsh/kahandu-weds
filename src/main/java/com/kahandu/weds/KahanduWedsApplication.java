package com.kahandu.weds;

import com.kahandu.weds.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KahanduWedsApplication {


	@Autowired
	UserServiceImpl userServiceImpl;
	public static void main(String[] args) {
		SpringApplication.run(KahanduWedsApplication.class, args);
	}

}
