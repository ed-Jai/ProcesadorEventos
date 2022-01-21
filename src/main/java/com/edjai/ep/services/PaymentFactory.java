/**
 * 
 */
package com.edjai.ep.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import com.edjai.ep.models.Payment;
import com.edjai.ep.models.PaymentName;
import com.edjai.ep.models.ValidCash;
import com.edjai.ep.models.ValidOnline;


/**
 * @author edvino
 *
 */
@Service
public class PaymentFactory extends BasePaymentFactory{

	@Autowired
	private Faker faker;
	@Override
	public Payment createPayment(String type) {
		int index = (int)(Math.round( Math.random()));
		String paymentType = null;
		if(type.equals(PaymentName.CASH.name().toLowerCase())) {
			paymentType = ValidCash.values()[index].name();
		}else {
			paymentType = ValidOnline.values()[index].name();
		}
		Payment payment = new Payment(type,paymentType,faker.number().numberBetween(50, 100), faker.date().birthday());
		return payment;
	}
	
	public List<Payment> loadPayments() {
		List<Payment> randomPayment = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int index = (int)(Math.round( Math.random()));
			randomPayment.add(createPayment(PaymentName.values()[index].name().toLowerCase()));
		}
		return randomPayment;
			
	}
}
