package x1n32;

/**
 * A class that has methods to do math related operations.
 * Can add, subtract, multiply, divide, and can calculate area of a circle.
 * 
 */
public class MathUtils {
	
	/**
	 * Takes 2 numbers and adds them together
	 * @param a
	 * @param b
	 * @return a + b
	 */
	public float add(float a, float b) {
		return a + b;
	}
	
	/**
	 * Takes 2 numbers parameters and subtracts the second value from the first
	 * @param a
	 * @param b
	 * @return a - b
	 */
	public float subtract(float a, float b) {
		return a - b;
	}
	
	/**
	 * Takes two numbers and muliplies them
	 * @param a
	 * @param b
	 * @return a x b
	 */
	public float multiply(float a, float b) {
		return a * b;
	}
	
	/**
	 * Takes two numbers and divides them. Throws an error if b = 0.
	 * @param a
	 * @param b
	 * @return
	 */
	public float divide(float a, float b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero (0).");
		}
		return a/b;
	}
	
	/**
	 * Uses the formula pi * r ^2 to calulate area of a circle
	 * @param radius
	 * @return pi * r * r
	 */
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
	


    public static void main(String[] args) {
        MathUtils calculator = new MathUtils();
		System.out.println("This a java class to showcase methods and classes. ");
		System.out.println("This Maths Utils java class has several methods/functions it can do. ");
		

        System.out.println("1 + 2 =  " + calculator.add(1, 2));    
		System.out.println("5.5 + 24.5 =  " + calculator.add(5.5f, 24.5f));  
		System.out.println("0 - 5 =  " + calculator.subtract(0, -5));      
		System.out.println("12 / 4  = " + calculator.divide(12,4));  
		System.out.println("12 * 4  = " + calculator.multiply(12,4));  
		System.out.println("With Radius = 4: Pi * r * r = " + calculator.computeCircleArea(4));  
		


    }
}
