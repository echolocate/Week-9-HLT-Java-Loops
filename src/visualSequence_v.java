import java.util.ArrayList;
import java.lang.Math;

public class visualSequence_v {

	public static void main(String[] args) {
		
		ArrayList<String> star = new ArrayList<String>();
		int colLimit = 9; // found out later, this breaks when higher than 10. May show a flaw in code logic. 
		int middle = Math.round(colLimit)/2;  // find centre starting point.
		
		// fill all elements, initially with spaces
		for (int i = 0; i <= colLimit; i++) {
			star.add(" ");
		}		
		
		// There may be a problem in the logic when columns are 
		// higher than a certain value, i.e I know it fails on 12.
		
		// Set middle column element then elements out from there, left  
		// and right (start and end), in relation to the current row value. 
		// The inner inner loop writes the values either side of the middle 
		// and leaves adjacent elements to what they were previously.
		for (int rows = 0; rows <= 5; rows++) {
			int start;
			int end=middle;
			for (int col = 0; col <= colLimit; col++) {
				if (col==middle) {
					start = middle - (rows-1);
					end = middle + (rows-1);
					for (int n = start; n <= end; n++) {
						String rowStr = Integer.toString(rows);
						star.set(n, rowStr);						
					}
				}

			}
			// Utilises a method to display each element of the arrayList
			// I found online. Pretty neat.
				star.forEach((n) -> System.out.print(n));
				System.out.println();
			}	
	}		
}
