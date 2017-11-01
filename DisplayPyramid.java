import static java.lang.System.*;

import java.util.*;

public class DisplayPyramid {

	public static void main(String[] args) {
		Scanner scannerIn = new Scanner(System.in);

		out.print("Enter the number of lines : ");
		int row = scannerIn.nextInt();

		scannerIn.close();

		makePyramid(row);
	}
	 
	private static void makePyramid(int getRow) {
		for (int row = 1; row <= getRow; row++) {

			for (int space = getRow - row; space > 0; space--) {
				System.out.print("  ");
			}

			int backwardsRow = getRow;
			for (int col = 1; col < row; col++) {
				System.out.print(backwardsRow);
				System.out.print(" ");
				backwardsRow = backwardsRow - 1;
			}

			int forwardsRow = 1;
			for (int col = row; col >= 1; col--) {
				System.out.print(forwardsRow);
				System.out.print(" ");
				forwardsRow = forwardsRow + 1;
			}

			System.out.println();
		}
	}
	
}
