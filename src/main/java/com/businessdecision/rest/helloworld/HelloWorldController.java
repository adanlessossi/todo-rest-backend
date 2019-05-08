/**
 * 
 */
package com.businessdecision.rest.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.businessdecision.rest.helloworld.domain.HelloWorldBean;

/**
 * @author bernard.adanlessossi
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String getHelloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello World!");
	}
	
	@GetMapping("/hello-world-path/{name}")
	public HelloWorldBean getHelloWorldPath(@PathVariable final String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
