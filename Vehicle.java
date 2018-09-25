//File: Vehicle.java
//Programmer: Jennifer King
//Date: 09/24/2018

public abstract class Vehicle 
{
	private String powerSource;
	private int numWheels;
	protected double price;
	
	public Vehicle(String ps, int wheels)
	{
		powerSource = ps;
		numWheels = wheels;
	}
	
	public double getPrice() {return price;}
	public abstract double setPrice(double p);

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
}
