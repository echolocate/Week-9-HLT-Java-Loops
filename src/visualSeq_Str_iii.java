import java.util.ArrayList;
import java.util.Scanner;

public class visualSeq_Str_iii {

	public static void main(String[] args) {
		
		ArrayList<String> star = new ArrayList<String>();		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int userRows = sc.nextInt();
		
		// This is almost the same algorithm I used in task iv
		// since it was easier manipulate arrayList than 
		// the predetermined array pattern from iii.
		// addStarRight not needed for this triangle. 
		// addStarLeft defines the 'centre' and increases 
		// by one for every row added.
		
		int addStarLeft = userRows + 1;
		// colLimit defines the top of the loop.
		// Usually offset two more than rows but this  
		// hasn't got the two sides of iii. 
		int colLimit = userRows + 1;
		// This code is pretty much the same as iv, 
		// now we have defined the loop ceiling and left offsets.
		
		// Defines the matrix, with user-chosen top value for rows.
		for (int rows = 0; rows <= userRows; rows++) {
			for (int col = 0; col <= colLimit; col++) {
			// fill array list with spaces.
			star.add(" ");			
			System.out.print(star.get(col));
			}

			System.out.println();
			star.set(addStarLeft, "*");
			
			if (addStarLeft == 0) {
				addStarLeft += 1;
				} else addStarLeft -= 1;
		}		
	}
}
