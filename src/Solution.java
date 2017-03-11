import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);

		// Decide the number of friends
		System.out.print("Enter how many friends: ");
		int numOfFriends = Integer.parseInt(sc.nextLine());

		// Create a string array to store the names of your friends
		int arrayOfNames[] = new int[numOfFriends];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of friend " + (i + 1) + " : ");
			arrayOfNames[i] = sc.nextInt();
		}
		sc.close();

	}

}
