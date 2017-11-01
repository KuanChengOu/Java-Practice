package uml.diagram;

import static java.lang.System.out;

import java.util.ArrayList;

public class Sedan extends Car {

	public Sedan(int carId, String color, String make, String model, double basePrice) {
		super(carId, color, make, model, basePrice);
	}
	
	@Override
	public double getTotalCost () {
		double totalCost = 0.0;
		
		totalCost += super.getBasePrice();
		
		ArrayList<Package> packages = new ArrayList<Package>();
		packages = super.getPackages();
		for (Package p : packages) {
			totalCost += p.getPrice();
		}
		
		return totalCost;
	}
	
	@Override
	public String toString () {
		return "Sedan Object..." 
			   + "\n-> Sedan ID : " + getCarId() 
			   + "\n-> Sedan color : " + getColor()
			   + "\n-> Sedan Make : " + getMake()
			   + "\n-> Sedan model : " + getModel()
			   + "\n-> BasePrice: " + getBasePrice()
			   + "\n-> Total Cost: " + getTotalCost();
	}
}
