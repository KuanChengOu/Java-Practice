import static java.lang.System.*;

import java.util.*;

public class CircleArea {

	final static float pi = 3.14159f;
	
	public static void main(String[] args) {
		Scanner scannerIn = new Scanner(in);
		
		out.println("Enter your Circle radius : ");
		float radius = scannerIn.nextFloat();
		
		scannerIn.close();
		
		out.println("your Circle Area is : " + String.format("%.2f", areaCircleArea(radius)));
	}
	
	private static float areaCircleArea (float radius){
	
		float area = ((float)(Math.pow(radius, 2)) * pi);
		
		return area;
	}
	
}
