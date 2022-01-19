/**
 * 
 */
package com.edjai.ep.models;

/**
 * @author edvino
 *
 */
public class PaymentInfo {
	private float amount;
	private String type;
	
	
	public PaymentInfo(float amount, String type) {
		super();
		this.amount = amount;
		this.type = type;
	}


	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
