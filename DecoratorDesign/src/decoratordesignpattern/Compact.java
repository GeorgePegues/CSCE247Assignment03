package decoratordesignpattern;

public class Compact extends Vehicle {
	
	/**
	 * sets string/description for compact
	 */
	public Compact()
	{
		this.description ="Compact";
	}
	
	/**
	 * Sets cost for Compact
	 */
	public double getCost()
	{
		return 15000.00;
	}
}
