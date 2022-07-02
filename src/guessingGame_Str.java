import java.util.Scanner;
import java.util.Random;

public class guessingGame_Str {

	public static void main(String[] args) {
		
		// I'm guessing (hah!), you would have to do some
		// manipulation outside of the random number generator
		// to define a range that starts above or below 0. So may not be
		// as random it appears. It does do floats and doubles though.
		// So may be more precise there, just not for my age guessing game
		// unless you are that pedantic to want the age down to the nanosecond.
		Random rand = new Random();
	    int upperbound = 100;
	    boolean userGuess = false;	      
	    Scanner sc = new Scanner(System.in);
	    
        //generate random values from 0-100
	    int random_int = rand.nextInt(upperbound); 
	    //double double_random=rand.nextDouble();
	    //float float_random=rand.nextFloat();
	    //int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	    // System.out.println(random_int);
	    System.out.println("How old do you think I am?: ");
	    while (userGuess == false) {
	      int guess = sc.nextInt();
	      if (guess < random_int) {
	      System.out.println("Charmer ! Try guessing a little older...");
	      userGuess = false;
	      }	    	  
	      else if (guess > random_int) {
	   		  System.out.println("How dare you!!! I'm younger than that...");
	   		  userGuess = false;  
	   		  }	    	  
	   	  else {
    		  System.out.println("Spot on !!! How did you guess ?");
    		  userGuess = true;
    		  }
	      // I did look at the other method and noticed it did boolean,
	      // good for coin flipping game. Also may be quicker 
	      // or more secure (?) as it is threaded.
	      }	    	  
	 }
}