
public class visualSequences_ii {

  public static void main(String[] args) {
	  // Number of stars increases by concatenation
	  // inside a for loop acting as a row incrementor.
	  String star = "*";
	  for (int rows = 1; rows <= 5; rows++) {
		  System.out.println(star);
		  star += "*";		  
	  }

  }
}

