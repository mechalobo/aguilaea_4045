package com.assignment0;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.assignment0", "com.assignment0"})
public class Assignment0Application {

	public static void main(String[] args) {
		new File(Assignment0Controller.uploadDirectory).mkdir();
		SpringApplication.run(Assignment0Application.class, args);
	}

}
