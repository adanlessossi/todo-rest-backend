/**
 * 
 */
package com.businessdecision.rest.helloworld.domain;

/**
 * @author bernard.adanlessossi
 *
 */
public class HelloWorldBean {

	private String message;

	/**
	 * 
	 */
	public HelloWorldBean() {
		super();
	}

	/**
	 * @param message
	 */
	public HelloWorldBean(String message) {
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
		return "HelloWorldBean [message=" + message + "]";
	}
	
}
