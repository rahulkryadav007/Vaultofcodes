package com.example3;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] numbers = {1, 2, 3, 4, 5};
	        
	        try {
	            System.out.println(numbers[10]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bounds.");
	        }
	        
	        //Error Detected: try catch not define
	        //Exception Thrown: ArithmeticException because no number can be divisible by 0
	        
	        //int result = divide(10, 0);
	        //System.out.println("Result: " + result);
            // Corrected code
	        try {
	        	int result = divide(10, 0);
		        System.out.println("Result: " + result);
	        }catch(ArithmeticException e) {
	        	System.out.println("Division by 0 is not allowed");
	        }
	}
	        

	    public static int divide(int a, int b) {
	        return a / b;
	    }
}
