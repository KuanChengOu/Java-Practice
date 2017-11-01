import static java.lang.System.*;

import java.util.*;
import java.util.stream.*;

public class OccurrencesSpecifiedCharacter {

	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);
		
		out.print("Enter your string : ");
		String sentence = scannerIn.nextLine();
		
		out.print("Enter you want to count character : ");
		String ch = scannerIn.next();

		scannerIn.close();

		Map<String, Long> repeatChars = Stream.of(sentence.toLowerCase().split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		List<String> stringArray = new ArrayList<String>();
		for(String val : sentence.toLowerCase().split("")) stringArray.add(val);
		
		out.println(stringArray);
		
		out.println(repeatChars);

		out.println("The number of occurrences of " + ch + " in " + "\"" + sentence + "\"" + " is " + repeatChars.get(ch));
	}

}
