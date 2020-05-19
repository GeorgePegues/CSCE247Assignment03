package decoratordesignpattern;

public class Paint extends VehicleDecorator {
	Vehicle vehicle;
	
	/**
	 * Accessed if a vehicle utilizes the Paint feature by using its parameter
	 * @param vehicle
	 */
	public Paint(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	/**
	 * Method serves as a string confirmation that the feature has been installed 
	 */
	public String getDescription()
	{
		return vehicle.getDescription() + ", fancy paint";
	}
	
	/**
	 * Adds vehicle cost to the feature price
	 */
	public double getCost()
	{
		return vehicle.getCost() + 150.00;
	}
}
