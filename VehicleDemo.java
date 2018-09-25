//Programmer: Jennifer King

public class VehicleDemo 
{
	public static void main(String[] args)
	{
		Sailboat boat = new Sailboat();
		Bicycle bike = new Bicycle();
		
		boat.setLength(30);
		boat.setPrice(15000);
		bike.setPrice(1000);
		
		System.out.println("Vehicle descriptions:");
		System.out.println(boat);
		System.out.println(bike);
	}
}
