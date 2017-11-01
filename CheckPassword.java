import static java.lang.System.*;

import java.util.regex.*;
import java.util.*;

public class CheckPassword {
	
	private boolean isMatch;
	
	public static void main(String[] args) {
		
		Scanner scannerIn = new Scanner(in);
		
		CheckPassword checkPassword = new CheckPassword();
		
		while(!checkPassword.isMatch){
			
			out.print("Enter your password to register : ");			
			String passowrd = scannerIn.nextLine();
			
			checkPassword.matchPassword(passowrd);
		}
	
		scannerIn.close();
	}
	
	public void matchPassword (String passowrd) {
		
		final String passwordPattern = "((?=.*\\d{2,2})(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&_]).{8,16})";
		
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher = pattern.matcher(passowrd);
		
		boolean isMatch = matcher.matches();
		
		this.isMatch = isMatch;	
		
		if(isMatch) {
			out.print("your password registration successfully!!");
		}
		else {
			out.println("your password registration failed, pls register again. (※ length must 8-16, must contains lowerCase, upperCase, more than two digits, any one special character[!@#$%&_])");
			return;
		}
		
		final StringBuilder getPassword = new StringBuilder();
		for (int i = 1; i <= matcher.groupCount(); i++) {
			getPassword.append(matcher.group(i));
		}
		
		out.println(" "+ "Don't forget your password : " + getPassword.toString());
	}
}
