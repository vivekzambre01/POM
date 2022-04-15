package Polymorphism_In_Java;

public class Vehicle {

	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.run();
		bike.run();
        Vehicle  v1= new Vehicle();
        v1.run();
		
		
	}
	
	void run()
	{
		System.out.println("vehicle is running");
	}
}

class Bike extends Vehicle
{
	
	void run()
	{
		System.out.println("Bike is running safely");
	}
}

  