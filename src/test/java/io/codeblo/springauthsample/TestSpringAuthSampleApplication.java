package io.codeblo.springauthsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringAuthSampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAuthSampleApplication::main).with(TestSpringAuthSampleApplication.class).run(args);
	}

}
