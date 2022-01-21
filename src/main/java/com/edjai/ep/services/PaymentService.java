/**
 * 
 */
package com.edjai.ep.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.edjai.ep.models.Payment;
import com.edjai.ep.models.PaymentDTO;

/**
 * @author edvino
 *
 */
@Service
public class PaymentService {
	@Autowired
	PaymentFactory paymentFactory;
	private List<Payment> payments = null;
	
	@PostConstruct
	public void init() {
		this.payments = paymentFactory.loadPayments();
	}
	
	public List<Payment> getPayments(){
		return payments;
	}
	
	public PaymentDTO createPayment(PaymentDTO payment) {
		if(!payment.validPayment()) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Pago incorrecto");
		}
		Payment validPayment = new Payment(payment); 
		payments.add(validPayment);
		return payment;
	}
}
