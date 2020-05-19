package decoratordesignpattern;

public class SportsCar extends Vehicle {
	
	/**
	 * Sets string/description for sports car
	 */
	public SportsCar()
	{
		this.description = "Sports Car";
	}
	
	/**
	 * Sets cost for Sports car
	 */
	public double getCost()
	{
		return 30000.00;
	}
}
