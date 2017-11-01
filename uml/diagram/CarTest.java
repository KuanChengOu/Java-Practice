package uml.diagram;
import static java.lang.System.*;

import java.util.*;

public class CarTest {
	
	public static void main(String[] args) {				
		//newCar();
		newSedan();
		newVan();
		newSuv();
	}
	
	/*private static void newCar() {
		
		ArrayList<Car> cars = new ArrayList<Car>();

		cars.add(new Car(101, "blue", "Honda", "Civic", 12500.0));
		cars.add(new Car(102, "white", "Toyota", "Camry", 21750.0));
		cars.add(new Car(201, "silver", "Toyota", "Sienna", 27000.0));
		cars.add(new Car(202, "green", "Honda", "Odyssey", 34000.0));
		cars.add(new Car(301, "blue", "Ford", "Escape", 21200.0));
		cars.add(new Car(302, "black", "Toyota", "4Runner SRS", 30000.0));
		
		for(int i = 0; i < cars.size(); i++){
			for(int j = 1; j <= 3; j++){
				cars.get(i).addPackage((j * 1000.0), ("Packages" + j));
			}
		}
		
		showAllCars(cars);
	}*/
	
	private static void newSedan() {
		
		ArrayList<Sedan> sedans = new ArrayList<Sedan>();
	
		sedans.add(new Sedan(101, "blue", "Honda", "Civic", 12500.0));
		sedans.add(new Sedan(102, "white", "Toyota", "Camry", 21750.0));
//		sedans.add(new Sedan(201, "silver", "Toyota", "Sienna", 27000.0));
//		sedans.add(new Sedan(202, "green", "Honda", "Odyssey", 34000.0));
//		sedans.add(new Sedan(301, "blue", "Ford", "Escape", 21200.0));
//		sedans.add(new Sedan(302, "black", "Toyota", "4Runner SRS", 30000.0));
		
		sedans.get(1).addPackage(new Package(1200.0, "Premium Audio"));
		/*for(int i = 0; i < sedans.size(); i++){
			for(int j = 1; j <= 3; j++){
				sedans.get(i).addPackage((j * 1000.0), ("Packages" + j));		
			}
		}*/
		
		showAllSedans(sedans);
	}
	
	private static void newVan() {
		
		ArrayList<Van> vans = new ArrayList<Van>();
		
		vans.add(new Van(201, "silver", "Toyota", "Sienna", 27000.0, 2));
		vans.add(new Van(202, "green", "Honda", "Odyssey", 34000.0, 1));
		
		showAllVan(vans);
	}
	
	private static void newSuv() {
		
		ArrayList<Suv> suvs = new ArrayList<Suv>();
		
		suvs.add(new Suv(301, "blue", "Ford", "Escape", 21200.0, false));
		suvs.add(new Suv(302, "black", "Toyota", "4Runner SRS", 30000.0, true));
		
		suvs.get(1).addPackage(new Package(1350.0, "Running Board"));
		
		showAllSuv(suvs);
	}
	
	/*public static void showAllCars (ArrayList<Car> cars) {
		for (Car c : cars) {
			out.println(c.toString() + (c.getPackages().isEmpty() ? "\n" : ""));
			
			c.getPackages().forEach(p -> out.println(p.toString()));
			
			if(!c.isAddPackage()){
				out.println("# " + c.getCarId() + " this ID packages is FULL, can't add more!!!\n");
			}else out.println();
		}
	}*/
	
	public static void showAllSedans (ArrayList<Sedan> sedans) {
		for (Sedan s : sedans) {
			out.println(s.toString() + (s.getPackages().isEmpty() ? "\n" : ""));
			
			s.getPackages().forEach(p -> out.println(p.toString()));
			
			if(!s.isAddPackage()){
				out.println("# " + s.getCarId() + " this ID packages is FULL, can't add more!!!\n");
			}else out.println();
				
		}
	}
	
	public static void showAllVan (ArrayList<Van> vans) {
		for (Van v : vans) {
			out.println(v.toString());
			
			v.getPackages().forEach(p -> out.println(p.toString()));
			
			if(!v.isAddPackage()){
				out.println("# " + v.getCarId() + " this ID packages is FULL, can't add more!!!\n");
			}else out.println();
		}
		
		out.println();
	}
	
	public static void showAllSuv (ArrayList<Suv> suvs) {
		for (Suv s : suvs) {
			out.println(s.toString());
			
			s.getPackages().forEach(p -> out.println(p.toString()));
			
			if(!s.isAddPackage()){
				out.println("# " + s.getCarId() + " this ID packages is FULL, can't add more!!!\n");
			}else out.println();
		}
		
		out.println();
	}
	
}
