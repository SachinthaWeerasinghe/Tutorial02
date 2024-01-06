package com.example.Tutorial2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTutorial2Application {

	public static void main(String[] args) {
		SpringApplication.from(Tutorial2Application::main).with(TestTutorial2Application.class).run(args);
	}

}
