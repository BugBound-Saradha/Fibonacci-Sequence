package day6Package;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println("Please enter no. of terms to display in the Fibonacci sequence");
		// Get no. of terms from user
		Scanner input = new Scanner(System.in);
		int noOfTerms = input.nextInt();
		input.close();
		if (noOfTerms <= 0) {
			System.out.println("No. of terms should be greater than 0");
			return;
		}
		System.out.println("Fibonacci sequence is");
		int a = 0, b = 1; // Initialize first two terms to build the Fibonacci sequence
		for (int i = 1; i <= noOfTerms; i++) // Run for loop till no. of terms given by user
		{
			System.out.println(a); // Print the sequence numbers one by one
			int next = a + b; // Fibonacci sequence logic
			a = b;
			b = next;
		}

	}

}
