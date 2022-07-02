import java.util.ArrayList;

public class visualSequence_iv {

	public static void main(String[] args) {
		
		// Implements an arraylist, which is mutable, unlike an array. 
		// (Just discovered this today! Delightful! you can overwrite,
		// append, prepend, will be using this again.)
		ArrayList<String> star = new ArrayList<String>();
		
		// initialise position in arraylist for pointers. 4 is centre for first star.
		// A bit of a kludge, the first time around they overwrite each other. No matter.
		int addStarRight = 4;
		int addStarLeft = 4;
		
		// sets up kind of a matrix, 6 rows by 9 columns.
		for (int rows = 0; rows <= 5; rows++) {
			for (int col = 0; col <= 8; col++) {
			// fill array list with 9 spaces.
			star.add(" ");			
			System.out.print(star.get(col));
			}
			// Next line mostly for my benefit, check on pointer position.
			// System.out.print("   " + addStarRight + " " + addStarLeft);
			
			System.out.println();
			// Replace space with star and current pointer position.
			star.set(addStarLeft, "*");
			star.set(addStarRight, "*");
			// Bit of a kludge, again...
			// To stop addStarLeft going Out Of Bounds, i.e to -1. 
			// If on the last row it adds one otherwise 'moves' pointer
			// one position to the left in the row, to replace space with a star later.
			if (addStarLeft == 0) {
				addStarLeft += 1;
				} else addStarLeft -= 1;
			// "moves" pointer one more position to the right, 
			// before looping back to start the next row
			addStarRight += 1;
		}
	}
}
