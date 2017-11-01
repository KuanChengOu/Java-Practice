package uml.diagram;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashMap;

public class CarInventory {

	public int carId = 0;
	public String color = "";
	public String make = "";
	public String model = "";
	public double basePrice = 0.0;
	
	public int numSlidingDoors = 0;
	public boolean is4WD = false;
	
	public double packagePrice = 0.0;
	public String packageDesc = "";
	
	public static enum carTypes {  
		Sedan, 
		Van, 
		Suv  
	}  
	
	public void addCar(carTypes carTypes) {
	
		switch (carTypes) {
			case Sedan:
				HashMap<String, Sedan> sedansMap =  new HashMap<String, Sedan>();
				sedansMap.put(Integer.toString(this.carId), new Sedan(this.carId, this.color, this.make, this.model, this.basePrice));
				sedansMap.get(Integer.toString(this.carId)).addPackage(this.packagePrice, this.packageDesc);
				
				showAllSedans(sedansMap);
				break;
			case Van:
				HashMap<String, Van> vansMap =  new HashMap<String, Van>();
				vansMap.put(Integer.toString(this.carId), new Van(this.carId, this.color, this.make, this.model, this.basePrice, this.numSlidingDoors));
			
				showAllVan(vansMap);
				break;
			case Suv:
				HashMap<String, Suv> suvsMap = new HashMap<String, Suv>();
				suvsMap.put(Integer.toString(this.carId), new Suv(this.carId, this.color, this.make, this.model, this.basePrice, this.is4WD));
				
				showAllSuv(suvsMap);
				break;
		}
	}
	
	public void showAllSedans (HashMap<String, Sedan> sedansMap) {
		for (Sedan s : sedansMap.values()) {
			out.println(s.toString() + (s.getPackages().isEmpty() ? "\n" : ""));
			
			s.getPackages().forEach(p -> out.println(p.toString()));
			
			if(!s.isAddPackage()){
				out.println("# " + s.getCarId() + " this ID packages is FULL, can't add more!!!\n");
			}else out.println();
		}
	}
	
	public static void showAllVan (HashMap<String, Van> vansMap) {
		for (Van v : vansMap.values()) {
			out.println(v.toString());
		}
		
		out.println();
	}
	
	public static void showAllSuv (HashMap<String, Suv> suvsMap) {
		for (Suv s : suvsMap.values()) {
			out.println(s.toString());
		}
		
		out.println();
	}
	
}
