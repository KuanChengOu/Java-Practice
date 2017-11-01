import static java.lang.System.*;

import java.util.*;

public class CheckISBN10 {

	public static void main(String[] args) {
		Scanner scannerIn = new Scanner(in);
		
		out.println("Enter the first 9 digits of an ISBN as integer: ");
		int isbnFirstDigits = scannerIn.nextInt();
		 
		scannerIn.close();
		
		int[] digits = digitsBreak(isbnFirstDigits);
		
		int isbnLastDigit = isbnLastDigit(digits);
 
		final StringBuilder isbn = new StringBuilder();
		for(int i = 0; i <= digits.length - 1; i++){
			isbn.append(Integer.toString(digits[i]));
		}
		
		if(isbnLastDigit == 10){
			System.out.println("The ISBN-10 number is " + isbn + "X");
		}else{
			System.out.println("The ISBN-10 number is " + isbn + isbnLastDigit);
		}
	}
	
	private static int[] digitsBreak (int isbn) {
		
		int[] digits = new int[9];
		
		for(int i = digits.length - 1; i >= 0; i--){			
			
			digits[i] = isbn % 10;
			isbn /= 10;
			out.println("isbn " + (i+1) + " digit is " + digits[i]);
		}
		
		return digits;
	}
	
	private static int isbnLastDigit (int[] digits) {
		
		int isbnLastDigitSum = 0;
		
		for(int i = 0; i <= digits.length - 1; i++) {
			int isbnLastDigitTemp = digits[i] * (i + 1);
			isbnLastDigitSum += isbnLastDigitTemp;
		}
		
		int isbnLastDigit = isbnLastDigitSum % 11;
		
		return isbnLastDigit;
	}

}
