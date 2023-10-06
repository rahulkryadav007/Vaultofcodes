package com.example2;

public class Car {
  
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    // Encapsulating data member

    /**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}


	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	public void start() {
        System.out.println("Starting the car.");
    }
      //defining stop method
    public void stop() {
    	System.out.println("Stoping the car.");
    } 
    
}
