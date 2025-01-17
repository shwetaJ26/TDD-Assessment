package com.testtdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorTest 
{
	
 private final Calculator calculator = new Calculator();
	 
	 @Test
		void additionZeroForEmptyString() {
			Assertions.assertThat(calculator.add("")).isEqualTo(0);
		}
}
