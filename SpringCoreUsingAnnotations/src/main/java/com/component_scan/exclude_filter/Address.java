package com.component_scan.exclude_filter;

import org.springframework.stereotype.Component;

@Component
public class Address {

	public Address() {
		super();
		System.out.println("Address no-arg constructor invoked!!!!");
	}

}
