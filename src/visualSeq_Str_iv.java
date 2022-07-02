import java.util.ArrayList;
import java.util.Scanner;

public class visualSeq_Str_iv {

	public static void main(String[] args) {
		
		ArrayList<String> star = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int userRows = sc.nextInt();
		
		int addStarRight = userRows + 1;
		int addStarLeft = userRows + 1;
		
		for (int rows = 0; rows <= userRows; rows++) {
			// userRows + UserRows for both sides of the triangle.
			for (int col = 0; col <= userRows + userRows; col++) {
			// fill arrayList matrix with spaces to initialise.
			star.add(" ");			
			System.out.print(star.get(col));
			} 
			
			System.out.println();
			
			star.set(addStarLeft, "*");
			star.set(addStarRight, "*");
			
			if (addStarLeft == 0) {
				addStarLeft += 1;
				} else addStarLeft -= 1;
			
			addStarRight += 1;
		}
	}
}
