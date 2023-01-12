package com.annotation.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanCreationControl {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(ConfigDependsOn.class);
		ctx.refresh();
		
		ConfigDependsOn cdo = ctx.getBean(ConfigDependsOn.class);
		
		
	}

}
