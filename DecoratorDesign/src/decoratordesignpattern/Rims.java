package decoratordesignpattern;

public class Rims extends VehicleDecorator {
	Vehicle vehicle;
	
	/**
	 * Accessed if a vehicle utilizes the Rims feature by using its parameter
	 * @param vehicle
	 */
	public Rims(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	/**
	 * Method serves as a string confirmation that the feature has been installed 
	 */
	public String getDescription()
	{
		return vehicle.getDescription() + ", cool rims";
	}
	
	/**
	 * Adds vehicle cost to the feature price
	 */
	public double getCost()
	{
		return vehicle.getCost() + 200.00;
	}
}
