/**
 * 
 */
package com.edjai.ep.models;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.edjai.ep.helper.Validation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * @author edvino
 *
 */


/*@JsonSubTypes({
	@JsonSubTypes.Type(value = ChashPayment.class),
	@JsonSubTypes.Type(value = OnlinePayment.class)
})*/
@Component
public class PaymentDTO {
	private String type = "Payment";
	private String source;
	@JsonFormat(pattern="yyyy-MM-DD")
	private Date date;
	protected PaymentInfo paymentInfo;
	
	private static final Logger log = LoggerFactory.getLogger(PaymentDTO.class);

	
	public PaymentDTO() {
	}
	public  String getSource() {
		return source;
	}
	
	public String getType() {
		return type;
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
	public void setType(String type) {
		this.type = type;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public PaymentDTO(String type, String source, Date date, PaymentInfo paymentInfo) {
		super();
		this.type = type;
		this.source = source;
		this.date = date;
		this.paymentInfo = paymentInfo;
	}
	@Override
	public String toString() {
		return "Payment [type=" + type + ", source=" + source + ", date=" + date + ", paymentInfo=" + paymentInfo.toString() + "]";
	}
	

	public boolean validPayment() {
		Stream <Enum> streamValid = null;
		if(this.source.equals(PaymentName.CASH.name().toLowerCase())) {
			streamValid = Arrays.stream(ValidCash.values());
		}else if(this.source.equals(PaymentName.ONLINE.name().toLowerCase())) {
			streamValid = Arrays.stream(ValidOnline.values());
		}
		
		return Validation.valid(streamValid, this.paymentInfo.getType());
	}
	
	
	
	
}
