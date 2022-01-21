package com.edjai.ep.helper;

import java.util.stream.Stream;

import org.springframework.stereotype.Component;
@Component
public class Validation {
	public static boolean valid(Stream<Enum> values, String targetValue) {
		if(values == null) {
			return false;
		}
		return values.anyMatch(e -> e.name().equals(targetValue));	
	}
}
