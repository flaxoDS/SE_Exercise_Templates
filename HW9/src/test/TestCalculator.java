package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		//Implement
		int expectedResult = 2+3;
		int actualResult = calculator.add(2, 3);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		//Implement
		int expectedResult = 2-3;
		int actualResult = calculator.sub(2, 3);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return__result() {
		//Implement
		int expectedResult = 2*3;
		int actualResult = calculator.multiply(2, 3);
		assertEquals(expectedResult, actualResult);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		//Implement
		float expectedResult = (float) 2/3;
		float actualResult = calculator.divide(2, 3);
		Assertions.assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {		
		assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
	}
	

	
}
