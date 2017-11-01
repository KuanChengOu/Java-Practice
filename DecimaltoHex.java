import static java.lang.System.*;

import java.util.*;

public class DecimaltoHex {

	public static void main(String[] args) {
		
		out.println("Enter you want to convert a decimal value : ");
		Scanner scannerIn = new Scanner(in);
		int decimal = scannerIn.nextInt();
		
		scannerIn.close();
		
		if(decimal <= 15) out.println(decToHex(decimal).toUpperCase());
		else out.println(decimal + " is an invalid input");
		
	}
	
	public static String decToHex(int dec)
	{
		return Integer.toHexString(dec);
	}

}
