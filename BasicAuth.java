import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.lang.System.out;

public class BasicAuth {
	
	public static void main(String[] args) {
		String originalInput = "mentor1@wetogether.co:password";
		String encodeString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		
		byte[] decodeBytes = Base64.getDecoder().decode(encodeString.getBytes());
		String decodeString = new String(decodeBytes);
		out.println("encode : " + encodeString);
		out.println("decode : " + decodeString);
	}
}
