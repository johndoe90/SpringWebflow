package pf;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public static int add(Integer a, Integer b) {
		return a + b;
	}
	
	public static int subtract(Integer a, Integer b) {
		return a - b;
	}
}
