package decoratordesignpattern;

public abstract class VehicleDecorator extends Vehicle {

protected String description;
	
	/**
	 * Sets a variable to get the respective description of vehicle decoration
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Initializes a double value that can take in the additional costs of vehicle options from child classes.
	 */
	public abstract double getCost();

}
