package decoratordesignpattern;

public abstract class Vehicle {
	
	protected String description;
	
	/**
	 * Parent class 
	 * getDescription to get the respective description of vehicle type
	 * @return
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Initializes a double value that can take in each vehicle base cost from associated child classes.
	 * @return
	 */
	public abstract double getCost();
	
	/**
	 * prints data into an user readable format
	 */
	public String toString()
	{
		return "" + getDescription();
		
	}
}
