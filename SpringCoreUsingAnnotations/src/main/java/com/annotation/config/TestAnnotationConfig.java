package com.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		Animal a = ctx.getBean(Animal.class);
		
		System.out.println(a);
		ctx.close();
	}

}
