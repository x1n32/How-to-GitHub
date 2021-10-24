package x1n32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**Testing Math Utils class
 * Testing is not debugging. We  take a single object, and test it, by invoking it and 
 * making sure we get the correct result.
 *  Testing should be repeatable, self-verifying, runs simultaneouslt, and return the same results.
 * 
 */
class MathUtilsTest {
	
	private MathUtils mathUtils;
	
	
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
		System.out.println("Now running tests");
	}

	@Nested
	class AddTest {

		@Test
    	public void shouldAnswerWithTrue(){
        	assertTrue( true );
    	}

		@Test
		public void shouldAnswerWithFalse(){
        	assertFalse( false );
    	}


		@Test
		void testAddingTwoPositives() {
    		assertEquals(2, mathUtils.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathUtils.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathUtils.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
	}
	
	@Test 
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathUtils.multiply(1, 0)),
				() -> assertEquals(1, mathUtils.multiply(1, 1)),
				() -> assertEquals(6, mathUtils.multiply(2, 3))
				);
	}
	@Test    
	public void testFiftyTimesTwo_ReturnsOneHundred() {      
  		// Arrange      
  		final float expected = 100;        
  		// Act      
  		final float actual = mathUtils.multiply(50, 2);        
  		// Assert      
  		assertEquals(actual, expected, "Should return 100. 50 x 2 = 100");    
	}
	
	@Test 
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), 
				"Should return right circle area");
	}
	
	@Test 
	void testDivide() {
		assertAll(
				() -> assertEquals(10, mathUtils.divide(100, 10)),
				() -> assertEquals(100, mathUtils.divide(150, 1.5f)),
				() -> assertEquals(0.5, mathUtils.divide(50, 100))
				);
	}

	@Test
	void testDivideArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(4, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}
	
	
}