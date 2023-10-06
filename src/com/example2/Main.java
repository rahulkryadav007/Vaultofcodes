package com.example2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car("Toyota", "Camry");
		 System.out.println("make: " + car.getMake() );
		 System.out.println("model: " + car.getModel() );
	        car.start();
	        //Error Detected:Method Stop is not defined
	        //Error Correction:Methhod stop is define in car class
	        car.stop();

	}

}
