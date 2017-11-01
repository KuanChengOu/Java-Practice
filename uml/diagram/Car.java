package uml.diagram;
import static java.lang.System.out;

import java.awt.List;
import java.util.ArrayList;

public abstract class Car {

	private int carId = 0;
	private String color = "";
	private String make = "";
	private String model = "";
	private double basePrice = 0.0;
	private boolean isAddPackage = true;
	private ArrayList<Package> packages = new ArrayList<Package>();
	
	public Car () {
		
	}
	
	public Car (int carId, String color, String make, String model, double basePrice) {		
		this.carId = carId;
		this.color = color;
		this.make = make;
		this.model = model;
		this.basePrice = basePrice;
	}
	
	public int getCarId () {
		return this.carId;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public String getMake () {
		return this.make;
	}
	
	public String getModel () {
		return this.model;
	}
	
	public double getBasePrice () {
		return this.basePrice;
	}
	
	public ArrayList getPackages () {
		return this.packages;
	}
	
	public boolean addPackage (Package p) {
		
		if(packages.size() < 2) {
			packages.add(p);
			return true;
		}
		else return false;
		
	}
	
	public void addPackage (double price, String desc) {
		
		if(packages.size() < 2) isAddPackage = true;
		else isAddPackage = false;
		
		if(isAddPackage) packages.add(new Package(price, desc));
		
	}
	
	public boolean isAddPackage () {
		return this.isAddPackage;
	}
	
	public abstract double getTotalCost();
	
	@Override
	public String toString() {
			
		return	"ID: " + getCarId() 
				+ ", Color: " + getColor()
			    + ", Make: " + getMake()
			    + ", Model: " + getModel()
			    + ", BasePrice: " + getBasePrice();
				
	}
}
