package uml.diagram;

import java.util.ArrayList;

public class SUV extends Car{

	private boolean is4WD = false;
	public final double FOUR_WD_UNIT_PRICE = 2249.99;
	
	public SUV(int carId, String color, String make, String model, double basePrice) {
		super(carId, color, make, model, basePrice);	
	}
	
	public SUV(int carId, String color, String make, String model, double basePrice, boolean flag) {
		super(carId, color, make, model, basePrice);	
		this.is4WD = flag;
	}
	
	public boolean getIs4WD () {
		return this.is4WD;
	}
	
	@Override
	public double getTotalCost () {
		double totalCost = 0.0;
		
		totalCost += super.getBasePrice();
		
		if(is4WD) totalCost += FOUR_WD_UNIT_PRICE;
		
		ArrayList<Package> packages = new ArrayList<Package>();
		packages = super.getPackages();
		for (Package p : packages) {
			totalCost += p.getPrice();
		}
		
		return totalCost;
	}
	
	@Override
	public String toString () {
		return "SUV Object..." 
			   + "\n-> SUV ID : " + getCarId() 
			   + "\n-> SUV color : " + getColor()
			   + "\n-> SUV Make : " + getMake()
			   + "\n-> SUV model : " + getModel()
			   + "\n-> SUV BasePrice : " + getBasePrice()
			   + "\n-> SUV is4WS : " + getIs4WD()
			   + (is4WD ? "\n-> SUV 4WD Price : " + FOUR_WD_UNIT_PRICE : "")
			   + "\n-> Total Cost: " + getTotalCost();
	}
	
}
