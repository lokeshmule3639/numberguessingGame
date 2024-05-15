package game;
import java.util.Random;
import java.util.Scanner;

public class  guessingnumber {
    public static void main(String[] args) {
    	// code here 
     Random rand = new Random();
     int numbertoguess = rand.nextInt(100) + 1;
     Scanner scanner = new Scanner(System.in);
     int guess;
     
     System.out.println("Welcome to game!");
     System.out.println("Guess a number between 1 and 100:");
     
     
     while (true) {
    	 guess = scanner.nextInt();
    	 
    	 if ( guess == numbertoguess) {
    		 System.out.println("Congratulations ,you guessed the number!");
    		 break;
    	 }
    	 else if( guess < numbertoguess) {
    		 System.out.println(" your guess is To low. Try again1");
    		 
    	 }
    	 else {
    		 System.out.println("Your guess is To high. Try again!");
    	 }
     }
     scanner.close();
	}

}
