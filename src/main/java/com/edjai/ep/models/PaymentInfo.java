/**
 * 
 */
package com.edjai.ep.models;

/**
 * @author edvino
 *
 */
public class PaymentInfo {
	private Double amount;
	private String type;
	
	
	public PaymentInfo(Double amount, String type) {
		this.amount = amount;
		this.type = type;
	}


	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "PaymentInfo [amount=" + amount + ", type=" + type + "]";
	}
	
	
}
