package decoratordesignpattern;

public class Sedan extends Vehicle {
	
	/**
	 * Sets string/description for sedan
	 */
	public Sedan()
	{
		this.description = "Sedan";
	}
	
	/**
	 * Sets cost for Sedan
	 */
	public double getCost()
	{
		return 20000.00;
	}
}
