package com.dst.noonnite;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dst.noonnite.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}
}
