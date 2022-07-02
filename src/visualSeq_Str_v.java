import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class visualSeq_Str_v {

	public static void main(String[] args) {
		
		// This breaks when higher than 10. Double digits.
		// Tried to solve this in visualSeq_v_test, printing
		// a star instead of numbers above 9, unsuccessful,
		// Probably abandon this now. As Spinal Tap might say:
		// "Our triangles go up to 11".
		ArrayList<String> star = new ArrayList<String>();
		int colLimit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int userRows = sc.nextInt();
		colLimit = userRows + 8; // Accommodate the base, offset from user input
		int middle = Math.round(colLimit)/2;  // find centre starting point.
		
		// fill all elements, initially with spaces
		for (int i = 0; i <= colLimit; i++) {
			star.add(" ");
		}
		
		// Set middle column element then elements out from there, left  
		// and right (start and end), in relation to the current row value. 
		// The inner inner loop writes the values either side of the middle 
		// and leaves adjacent elements to what they were previously.
		for (int rows = 0; rows <= userRows; rows++) {
			int start;
			int end=middle;
			for (int col = 0;   
				col <= colLimit;      // sorry about the ridiculous line split. 
					     col++) {       // Just wanted the code to resemble a triangle
				if (col==middle) {
					start = middle - (rows-1);
					end = middle + (rows-1);
					for (int n = start; n <= end; n++) {
						String rowStr = Integer.toString(rows);
						star.set(n, rowStr);						
					}
				}

			}
			
				star.forEach((n) -> System.out.print(n));
				System.out.println();
			}	
	}		
}
