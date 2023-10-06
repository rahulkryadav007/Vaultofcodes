package com.example1;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {1, 2, 3, 4, 5};
	        /* Error Detected: ArrayIndexOutOfBoundsException
		    for(int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
            */
		 // Corrected Code:
		 for(int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }
	    }

}
