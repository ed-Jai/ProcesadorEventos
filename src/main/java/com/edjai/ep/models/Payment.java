/**
 * 
 */
package com.edjai.ep.models;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author edvino
 *
 */
@Component
public class Payment {
	private String type;
	private String source;
	private Date date;
	private PaymentInfo paymentInfo;
	
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(String type, String source, Date date, PaymentInfo paymentInfo) {
		this.type = type;
		this.source = source;
		this.date = date;
		this.paymentInfo = paymentInfo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
	
	
	
}
