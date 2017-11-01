import static java.lang.System.*;

import java.util.*;

public class GeometryTwoRectangles {

	public static void main(String[] args) {

	    Scanner scannerIn = new Scanner(in);

	    out.print("Enter r1¡¦s center coordinates(x , y), width , height => use space or tab to break : ");
	    float x1 = scannerIn.nextFloat();
	    float y1 = scannerIn.nextFloat();
	    float width1 = scannerIn.nextFloat();
	    float height1 = scannerIn.nextFloat();
	    
	    out.print("Enter r2¡¦s center coordinates(x , y), width , height => use space or tab to break : ");
	    float x2 = scannerIn.nextFloat();
	    float y2 = scannerIn.nextFloat();
	    float width2 = scannerIn.nextFloat();
	    float height2 = scannerIn.nextFloat();

	    scannerIn.close();
	    
	    float xDistance = calculateDistance(x1, x2);
	    float yDistance = calculateDistance(y1, y2);

	    boolean r2insideR1 = inside(width1, height1, width2, height2, xDistance, yDistance);
	    boolean r2overlapsR1 = overlaps(width1, height1, width2, height2, xDistance, yDistance);

	    if(r2insideR1){
	        out.println("r2 is inside r1");
	    }
	    else if (r2overlapsR1){
	        out.println("r2 overlaps r1");
	    } 
	    else{
	        out.println("r2 is outside r1");
	    }
	}
	
	private static boolean inside(float width1, float height1, float width2, float height2, float xDistance, float yDistance) {
	    boolean r2insideR1 = (xDistance <= ((width1 - width2) / 2)) && (yDistance <= ((height1 - height2) / 2));
	    
	    return r2insideR1;
	}
	
	private static boolean overlaps(float width1, float height1, float width2, float height2, float xDistance, float yDistance) {
	    boolean r2overlapsR1 = (xDistance < ((width1 + width2 ) / 2)) && (yDistance < ((width1 + width2 ) / 2));
	   
	    return r2overlapsR1;
	}

	private static float calculateDistance(float p1, float p2) {
		float distance = Math.abs(p1 - p2);
		
		return distance;
	}

}
