/**
 * 
 */
package com.edjai.ep.services;

import com.edjai.ep.models.Payment;

/**
 * @author edvino
 *
 */
public abstract class BasePaymentFactory {
	public abstract Payment createPayment(String type);
}
