import static java.lang.System.*;

import java.util.*;
import java.text.*;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner scannerIn = new Scanner(in);
		
		out.println("Enter the driving distance (miles) : ");
		float totalMiles = scannerIn.nextFloat();
		
		out.println("Enter miles per Gallon : ");
		float perMiles = scannerIn.nextFloat();
		
		out.println("Enter price per Gallon : ");
		float perPrice = scannerIn.nextFloat();
		
		scannerIn.close();
		
		float drivingCost = calculateCost(totalMiles, perMiles, perPrice);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		out.println("The cost of driving is : " + decimalFormat.format(drivingCost));
		
		//out.println("The cost of driving is : " + String.format("%.2f", myCost));
	}

	private static float calculateCost (float totalMiles, float perMiles, float perPrice){
		
		float cost = (totalMiles / perMiles) * perPrice;
		
		return cost;
	}
	
}
