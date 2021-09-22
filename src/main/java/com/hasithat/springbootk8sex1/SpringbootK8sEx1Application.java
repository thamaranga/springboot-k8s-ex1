package com.hasithat.springbootk8sex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class SpringbootK8sEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sEx1Application.class, args);
	}

	@GetMapping("am-i-lucky")
	public String amILucky(){
		Random random= new Random();
		return random.nextBoolean()?"Yes, you are lucky!!!": "Sorry, Please try again";

	}

}
