package uml.diagram;

import java.util.ArrayList;

public class Van extends Car {

	private int numSlidingDoors = 0;
	public final double SLIDING_DOOR_UNIT_PRICE = 1500.00;
	
	public Van(int carId, String color, String make, String model, double basePrice, int nsd) {
		super(carId, color, make, model, basePrice);
		this.numSlidingDoors = nsd;
	}
	
	public int getNumSlidingDoors () {
		return this.numSlidingDoors;
	}
	
	@Override
	public double getTotalCost () {
		double totalCost = 0.0;
		
		totalCost += super.getBasePrice();
		
		totalCost += (numSlidingDoors * SLIDING_DOOR_UNIT_PRICE);
		
		ArrayList<Package> packages = new ArrayList<Package>();
		packages = super.getPackages();
		for (Package p : packages) {
			totalCost += p.getPrice();
		}
		
		return totalCost;
	}
	
	@Override
	public String toString () {
		return "Van Object..." 
			   + "\n-> Van ID : " + getCarId() 
			   + "\n-> Van color : " + getColor()
			   + "\n-> Van Make : " + getMake()
			   + "\n-> Van model : " + getModel()
			   + "\n-> Van BasePrice : " + getBasePrice()
			   + "\n-> Van numSlidingDoors : " + getNumSlidingDoors()
			   + "\n-> Van SlidingDoor Total Price: " + (numSlidingDoors * SLIDING_DOOR_UNIT_PRICE)
			   + "\n-> Total Cost: " + getTotalCost();
	}
}
