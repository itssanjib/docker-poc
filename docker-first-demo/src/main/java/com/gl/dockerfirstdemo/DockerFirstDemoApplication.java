package com.gl.dockerfirstdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerFirstDemoApplication.class, args);
	}

}

// Controller class for the first docker demo
@RestController
class DockerDemoController {

	@RequestMapping(path = "/helloDockerDemo", method = RequestMethod.GET)
	public String hello() {
		return "hello docker demo!";
	}
	
	@Bean
	CommandLineRunner init() {
		return args -> {
			System.out.println("hello docker demo!");
		};
	}
}