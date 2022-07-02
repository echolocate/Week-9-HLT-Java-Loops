import java.util.Scanner;

public class TaskOneStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter multiplier and iterations...");
		System.out.println("(space seperating the two numbers): ");
		String str = sc.nextLine();
		
		// separate values from string into two elements in an array.
		String[] strArr = str.split(" ");
		
		// convert string array elements into two integers.
		int mult = Integer.valueOf(strArr[0]).intValue();
		int iter = Integer.valueOf(strArr[1]).intValue();
		
		// find ceiling value to use in for loop.
		int topMult = mult * iter;
		
		// loop using multiplier as the step value and output result.
		for (int i = 0; i <= topMult; i+=mult) {
			System.out.print(i + " ");
		}
		
	}

}