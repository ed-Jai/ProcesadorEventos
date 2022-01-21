/**
 * 
 */
package com.edjai.ep.models;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author edvino
 *
 */
public class Payment {
	 	String source;
	    String paymentType;
	    double amount;
	    @JsonFormat(pattern="yyyy-MM-DD")
	    Date date;

	    
	    public Payment(String source, String paymentType, double amount, Date date) {
			super();
			this.source = source;
			this.paymentType = paymentType;
			this.amount = amount;
			this.date = date;
		}

		public Payment(PaymentDTO payment) {
	    	this.source = payment.getSource();
	    	this.paymentType = payment.getPaymentInfo().getType();
	    	this.amount = payment.getPaymentInfo().getAmount();
	    	this.date = payment.getDate();
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getPaymentType() {
			return paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
	    
	    
}
