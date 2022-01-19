/**
 * 
 */
package com.edjai.ep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;


/**
 * @author edvino
 *
 */
@Configuration
public class FaekerBConfig {
	@Bean
	public Faker getFakerBean() {
		return new Faker();
	}
	
}
