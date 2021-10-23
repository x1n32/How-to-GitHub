package x1n32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private MathUtils mathUtils;
	
	
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}

	@Nested
	class AddTest {
		@Test
		void testAddingTwoPositives() {
            System.out.println("Adding 1 + 1. Testing for the result to be 2.");
			assertEquals(2, mathUtils.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingTwoNegatives() {
            System.out.println("Adding -1 + -1. Testing to make sure the answer is -2");
			assertEquals(-2, mathUtils.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingAPositiveAndANegative() {
            System.out.println("Adding -1 + 1. Testing for the result to be 0.");
			assertEquals(0, mathUtils.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
	}
	
	@Test 
	void testMultiply() {
        System.out.println("Testing multiplication: 1x0, 1x1 and 2x3");
		assertAll(
				() -> assertEquals(0, mathUtils.multiply(1, 0)),
				() -> assertEquals(1, mathUtils.multiply(1, 1)),
				() -> assertEquals(6, mathUtils.multiply(2, 3))
				);
	}
	
	@Test 
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), 
				"Should return right circle area");
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}
	
	
}