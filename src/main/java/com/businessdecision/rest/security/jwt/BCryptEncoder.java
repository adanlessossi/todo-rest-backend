/**
 * 
 */
package com.businessdecision.rest.security.jwt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author bernard.adanlessossi
 *
 */
public class BCryptEncoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoded = encoder.encode("Passw0rd");
		System.out.println(encoded);
	}

}
