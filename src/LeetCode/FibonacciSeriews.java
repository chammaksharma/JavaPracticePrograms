package LeetCode;

import java.util.Scanner;

public class FibonacciSeriews {
	public static void main(String args[]) {

		// input to print Fibonacci series upto how many numbers
		System.out
				.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("The number entered to calculate Fibonacci for is "
				+ number);
		for (int i = 1; i <= number; i++) {
		//	System.out.println(printFibonacciloop(i)+"");
		}

		for (int i = 1; i <= number; i++) {
			System.out.println(printFibonacciRecurssion(i)+"");
		}
	}

	public static int printFibonacciloop(int number) {
		
		if (number == 1) {
			return(0);
		}
		if (number == 2) {
			return(1);
		}
		int prev1 = 1, prev2 = 1, fibbo = 1;
		for (int i = 3; i <= number; i++) {
			fibbo = prev1 + prev2;
			prev1 = prev2;
			prev2 = fibbo;
		}
		return(fibbo);
	}

	public static int printFibonacciRecurssion(int number) {
		if (number == 1) {
			return 0;
		}
		if (number == 2) {
			return 1;
		}
		return ( printFibonacciRecurssion(number - 1) + printFibonacciRecurssion(number - 2)); // tail recursion
	}
	
	
}
