
public class Fibonacci {

	public static void main(String[] args) {
		// initialise starting values.
		int wrap = 0; // for cute display later.
		int prePreFib = 1;
		int preFib = 1;
		int fib = 0;
		// print out the first three 
		// numbers before entering loop.
		System.out.println(fib + ", ");
		System.out.println(preFib + ", ");
		System.out.print(prePreFib + ", ");
		do {
			// generate next fibonacci number.
			fib = preFib + prePreFib;
			System.out.print(fib + ", ");
			// shift previous numbers to current value
			// for next go around.
			prePreFib = preFib;
			preFib = fib;
			// fancy 'word-wrap', because it's pretty...
			// (for when numbers get huge (double vars needed)).
			wrap = (fib % 2);
			if (wrap == 0) {
				System.out.print("\n");
			}
		} while (fib < 10000000); // or 1000000, or whatever. This is prettier.

	}

}
