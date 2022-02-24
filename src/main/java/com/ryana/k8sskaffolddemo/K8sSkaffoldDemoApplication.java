package com.ryana.k8sskaffolddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class K8sSkaffoldDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sSkaffoldDemoApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return String.format("This is deployed using SKAFFOLD DEV !!!");
	}
	

}
