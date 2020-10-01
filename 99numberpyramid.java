public class 99numberpyramid
private static void printPattern5(int rows) {
	// for loop for the rows
	for (int i = rows; i >= 1; i--) {
		// white spaces in the front of the numbers
		int numberOfWhiteSpaces = i*2;

		//print leading white spaces
		printString(" ", numberOfWhiteSpaces);

		//print numbers
		for(int x=i; x=i; j--) {
			System.out.print(j+" ");
		}

		//move to next line
		System.out.println("");
	}
}