import static java.lang.System.*;

import java.util.*;

public class CountOccurenceOfNumbers {
	public static void main(String[] args) {

        Scanner scannerIn = new Scanner(in);

        int[] number = new int[101];

		out.println("Enter the integers between 1 and 100: ");
		for (int i = 0; i < number.length; i++) {
			int a = scannerIn.nextInt();
			number[a] += a;
			if (a == 0)
				break;
		}
		
		scannerIn.close();
		
		for (int i = 1; i < number.length; i++) {
			if (number[i] != 0) {
				if (number[i] / i >= 1) out.println("number : " + i + " occurs " + number[i] / i + " times");
			}
		}
    }

}
