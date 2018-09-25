//Programmer: Jennifer King

import java.text.*;
import java.text.DecimalFormat;

public class Sailboat extends Vehicle
{
	private int length;
	
	public Sailboat()
	{
		super("wind", 0);
	}
	
	public void setLength(int l) {length = l;}
	public int getLength() {return length;}
	
	
	public String toString()
	{
		NumberFormat df = DecimalFormat.getInstance();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		
		String str;
		
		str = "The " + length + " foot sailboat is powered by wind; it has 0 wheels and costs $" + df.format(getPrice());
		
		return str;
	}
	
	@Override
	public double setPrice(double p)
	{
		price = p;
		return price;
	}

}
