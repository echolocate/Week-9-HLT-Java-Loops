import java.util.Scanner;

public class visualSeq_Str_ii {

	public static void main(String[] args) {
		String star = "*";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int userRows = sc.nextInt();
		  for (int rows = 1; rows <= userRows-1; rows++) {
			  System.out.println("       " + star);
			  star += "*";		  
		  }

	}

}
