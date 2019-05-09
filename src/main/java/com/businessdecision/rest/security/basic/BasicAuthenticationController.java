/**
 * 
 */
package com.businessdecision.rest.security.basic;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.businessdecision.rest.domain.AuthenticationBean;

/**
 * Controller for the Basic Authentication.
 * @author bernard.adanlessossi
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {

	@GetMapping("/basicauth")
	public AuthenticationBean getHelloWorldBean() {
		return new AuthenticationBean("You are authenticated!");
	}
}
