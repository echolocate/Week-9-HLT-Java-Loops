import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class visualSeq_v_test {

	public static void main(String[] args) {
		
		ArrayList<String> star = new ArrayList<String>();
		int colLimit; // This breaks when higher than 10. Tried to fix it later. 		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int userRows = sc.nextInt();
		
		colLimit = userRows + 8; // make room for base of triangle
		int middle = Math.round(colLimit)/2;  // find centre starting point.
		
		// fill all elements, initially with spaces
		for (int i = 0; i <= colLimit; i++) {
			star.add(".");
		}		
		
		// Currently throws an OutOfBounds exception when columns are 
		// higher than ten due to double digits. Tried unsuccessfully
		// to fix this by switching the rowStr variable with the
		// original star. Must be another dependent variable somewhere.
		// May give up on that. Still... it goes up to 11 !!
		for (int rows = 0; rows <= userRows; rows++) {
			int start;
			int end=middle;
			for (int col = 0; col <= colLimit; col++) {
				if (col==middle) {
					start = middle - (rows-1);
					end = middle + (rows-1);
					for (int n = start; n <= end; n++) {
						if (userRows <=10) {
						String rowStr = Integer.toString(rows);
						star.set(n, rowStr);						
						}
						else {
							star.set(n, "*");
						}
					}
				}
			}
				star.forEach((n) -> System.out.print(n));
				System.out.println();
			}	
	}		
}