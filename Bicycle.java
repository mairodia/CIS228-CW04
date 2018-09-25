//Programmer: Jennifer King
import java.text.*;
import java.text.DecimalFormat;

public class Bicycle extends Vehicle
{
	
	public Bicycle()
	{
		super("a person", 2);
	}
	
	public String toString()
	{
		NumberFormat df = DecimalFormat.getInstance();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		
		String str;
		str = "The bicycle is powered by a person; it has 2 wheels and costs $" + df.format(getPrice());
		
		return str;
	}
	
	@Override
	public double setPrice(double p)
	{
		price = p;
		return price;
	}
}
