import static java.lang.System.*;

import java.util.Scanner;

public class SumDigits {

	 public static void main(String[] args) 
	    { 
		 	Scanner scannerIn = new Scanner(in);
			out.println("Enter an integer between 0 and 1000(calculate sum of digits) : ");
			
			int digits = scannerIn.nextInt();
			
			scannerIn.close();
			if(digits <= 1000) out.println("The sum of all digits is : " + sumDigits(digits));
			else out.println("sorry your value out of range, pls input again.");
	       
	    } 
	 
	    private static String sumDigits(int digits) { 
	        int sum = 0; 
	        int i = 0;
	        int digitsLength = Integer.toString(digits).length();  
	        final StringBuilder digitsResult = new StringBuilder();
	        
	        while ( digits > 0 )
	        {
	        	i++;
	            int digit = digits % 10;
	            digits /= 10; 
	            sum += digit;
	            digitsResult.append(Integer.toString(digit)).append(i < digitsLength ? " + " : " = " + Integer.toString(sum));
	        }
	        
	        return digitsResult.toString();
	    }
}
