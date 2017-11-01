import static java.lang.System.*;

import java.util.*;
import java.util.stream.*;
import java.util.Map.Entry;

public class PrintDistinctNumbers {

	public static void main(String[] args) {

	    Scanner scannerIn = new Scanner(in);
	    
	    out.print("Enter 10 numbers (type space to separate, such as 1 2 3 5 ...) : ");

	    String setNumbers = scannerIn.nextLine();
	    
	    // Set can remove repeat value.
	    Set<String> numbers = new HashSet<String>(Stream.of(setNumbers.split(" ")).collect(Collectors.toList()));
	    //Set<String> numbers = new HashSet<String>(Arrays.asList(setNumbers.split(" ")));
	    
	    scannerIn.close();
    
	    out.print("The distinct numbers are : ");
	    numbers.forEach(num -> out.print(num + " "));  
	}
	
}
