/**
 * 
 */
package com.edjai.ep.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import com.edjai.ep.models.Payment;
import com.edjai.ep.models.PaymentInfo;

/**
 * @author edvino
 *
 */
@Service
public class PaymentService {
	@Autowired
	private Faker faker;
	
	private List<Payment> payments = new ArrayList();
	
	@PostConstruct
	public void init() {
		int maxPayments =100;
		String [] source =  {"online", "cash"} ;
		for (int i = 0; i < maxPayments; i++) {
			payments.add(new Payment("payment",source[0], faker.date().birthday(), new PaymentInfo(100, "TDD")));
		}
	}
	
	public List<Payment> getPayments(){
		return payments;
	}
}
