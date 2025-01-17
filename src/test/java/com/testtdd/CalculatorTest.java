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
	 
	 @Test
		void additionForOneInput() {
			Assertions.assertThat(Calculator.addMultipleNo("5")).isEqualTo(5);
		}
	 
	 @Test
		void additionForTwoInput() {
			Assertions.assertThat(Calculator.addMultipleNo("2,5")).isEqualTo(7);
		}
	 
	 @Test
		void additionForMultipleInput() {
			Assertions.assertThat(Calculator.addMultipleNo("2,5,3")).isEqualTo(10);
		}
	 
	 @Test
		void additionSplitByCommasAndNewLine() {
			Assertions.assertThat(Calculator.nonewline("2,5,3\n5")).isEqualTo(15);
		}
	 @Test
		void additionForDelimeter() {
			Assertions.assertThat(Calculator.checkdelimiter("//;2;5,3\n5")).isEqualTo(15);
		}
}
