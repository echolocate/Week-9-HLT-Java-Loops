
public class visualSequences {

  public static void main(String[] args) {
	  
	  // Straightforward. Nested for loop..
	  // Inner loop writes the line of stars,
	  // when that's finished, writes a new line.
	  // Outer loop increases the row count to write
	  // a new line until the row count reaches 5 rows
	  for (int rows = 0; rows <= 4; rows++) {
	  for (int cols = 0; cols <= 10; cols++) {
		  System.out.print("*");
	  }
	  System.out.print("\n");
	  }

  }
}

