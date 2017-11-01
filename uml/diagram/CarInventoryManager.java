package uml.diagram;

import uml.diagram.CarInventory.carTypes;

public class CarInventoryManager {

	public static void main(String[] args) {				
		CarInventory carInventory = new CarInventory();
		
		carInventory.basePrice = 100;
		carInventory.carId = 55;
		carInventory.make = "Honda";
		carInventory.model = "yes";
		carInventory.color = "black";
		
		
		carInventory.addCar(carTypes.Sedan);
		carInventory.basePrice = 50000;
		carInventory.carId = 10;
		carInventory.make = "uuu";
		carInventory.model = "yes";
		carInventory.color = "black";
		carInventory.packagePrice = 5000;
		carInventory.packageDesc = "這是汽車最新的包裹";
		carInventory.addCar(carTypes.Sedan);
		
		
		/*carInventory.basePrice = 100;
		carInventory.carId = 10;
		carInventory.make = "uuu";
		carInventory.model = "yes";
		carInventory.color = "black";
		carInventory.numSlidingDoors = 3;
		
		carInventory.addCar(carTypes.Van);*/
	}
}
