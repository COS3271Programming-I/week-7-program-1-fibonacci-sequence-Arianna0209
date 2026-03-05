package week7;

import java.util.Arrays;
import java.util.Scanner;
public class FibonacciSequenceAPP {
	
	// This program asks the user how many Fibonacci numbers they'd like the program to print and then uses arrays to do so.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		// Tell the user what the program does:
		System.out.println("This program prints Fibonacci numbers.");
		
		// Declare the variable that will hold the number of Fibonacci numbers the user wants printed:
		int numOfNumbers;
		
		// Ask the user to enter how many Fibonacci numbers they'd like to print:
		System.out.println("Type the number of Fibonacci numbers you'd like the program to print. "
				+ "Pick a number between 1 and 32.");
		numOfNumbers = userinput.nextInt();
		userinput.nextLine();
		
		// Declare the variables for the Fibonacci for loop:
		int num1 = 1;
		int num2 = 1;
		int next;
		int i;
		
		// Create the array that will hold the Fibonacci numbers:
		int[] fibonacciValues = new int[numOfNumbers];
		
		// Add the initial two numbers:
		fibonacciValues[0] = num1;
		fibonacciValues[1] = num2;
		
		// Print the rest using a for loop:
		for (i = 1; i < numOfNumbers - 1; i++) {
			next = num1 + num2;
			fibonacciValues[i+1] = next;
			num1 = num2;
			num2 = next;
		}
		
		// Print the values:
		System.out.println("\nThe values are:");
		System.out.println(Arrays.toString(fibonacciValues));
		
		// Tell the user the program has ended:
		System.out.println("\n\nProgram ended.");

	}

}
