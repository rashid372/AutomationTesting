package com.ea.SpringBasic;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);
try {
	Car car = applicationContext.getBean(Car.class);
	car.getCar();
}catch (Exception ex){

}


	}
}
