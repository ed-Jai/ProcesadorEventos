/**
 * 
 */
package com.edjai.ep.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.edjai.ep.models.Payment;
import com.edjai.ep.models.PaymentDTO;
import com.edjai.ep.services.PaymentService;

/**
 * @author edvino
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	

	@GetMapping("/all")
	public ResponseEntity<List<Payment>> getPayments(){
		return new ResponseEntity<List<Payment>>(paymentService.getPayments(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO payment){
		return new ResponseEntity<PaymentDTO>(paymentService.createPayment(payment), HttpStatus.OK);
	}
	
}
