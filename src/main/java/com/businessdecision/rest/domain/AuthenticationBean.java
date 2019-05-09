/**
 * 
 */
package com.businessdecision.rest.domain;

/**
 * The authentication Bean.
 * @author bernard.adanlessossi
 *
 */
public class AuthenticationBean {

	private String message;

	/**
	 * 
	 */
	public AuthenticationBean() {
		super();
	}

	/**
	 * @param message
	 */
	public AuthenticationBean(String message) {
		super();
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AuthenticationBean [message=" + message + "]";
	}
	
}
