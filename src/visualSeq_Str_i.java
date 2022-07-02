import java.util.Scanner;

public class visualSeq_Str_i {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int userRows = sc.nextInt();
		System.out.println("enter number of columns: ");
		
		// Ceiling on loop are the two user values.
		int userCols = sc.nextInt();
		  for (int rows = 0; rows <= userRows-1; rows++) {
			  for (int cols = 0; cols <= userCols-1; cols++) {
				  System.out.print("*");
			  }
			  System.out.print("\n");
			  }


	}

}
