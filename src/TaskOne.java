import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Using print for no new line
		System.out.print("Enter number multiplier: ");
		int mult = sc.nextInt();
		
		System.out.print("Enter how many values: ");
		int multVal = sc.nextInt();
		
		// get the top value to loop to.
		int Ceiling = mult * multVal;
		for (int i = 0; i <= Ceiling; i+=mult) {
			System.out.print(i + " ");
		}
	}

}
