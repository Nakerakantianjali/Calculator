package epamcalci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculator=new Calculator();
		assertEquals(25,calculator.addition(5, 20));
		assertEquals(-15,calculator.subtraction(5, 20));
		assertEquals(100,calculator.multilication(5, 20));
		assertEquals(0,calculator.division(5,0));
	}

}
