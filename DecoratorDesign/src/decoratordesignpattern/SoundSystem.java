package decoratordesignpattern;

public class SoundSystem extends VehicleDecorator {
	Vehicle vehicle;
	
	/**
	 * Accessed if a vehicle utilizes the soundSystem feature by using its parameter
	 * @param vehicle
	 */
	public SoundSystem(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	/**
	 * Method serves as a string confirmation that the feature has been installed 
	 */
	public String getDescription()
	{
		return vehicle.getDescription() + ", awesome sound";
	}
	
	/**
	 * Adds vehicle cost to the feature price
	 */
	public double getCost()
	{
		return vehicle.getCost() + 350.00;
	}
}
