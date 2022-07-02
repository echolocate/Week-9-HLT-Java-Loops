import java.util.ArrayList;
import java.util.Scanner;

public class visualSeq_Str_vi {

	public static void main(String[] args) {
	
	// Same as Stretch Challenge iv, substitute stars
	// with string converted value of rows, this time
	// number of rows defined by the user.
	// Only problem with this is that when rows exceed
	// nine, the triangle appears wonky at the base due
	// to ten taking up two 'spaces' instead of one,
	// i.e 12 has two characters. Could use hexadecimal,
	// but what happens after 15? Base Googol ?
	ArrayList<String> star = new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int userRows = sc.nextInt();
	
	int addStarRight = userRows + 1;
	int addStarLeft = userRows + 1;
	
	for (int rows = 0; rows <= userRows; rows++) {
		for (int col = 0; col <= userRows + userRows; col++) {
		star.add(" ");			
		System.out.print(star.get(col));
		} 
		
		System.out.println();
		
		String rowStr = Integer.toString(rows+1);
		
		star.set(addStarLeft, rowStr);
		star.set(addStarRight, rowStr);
		
		if (addStarLeft == 0) {
			addStarLeft += 1;
			} else addStarLeft -= 1;
		
		addStarRight += 1;
	}

	}

}
