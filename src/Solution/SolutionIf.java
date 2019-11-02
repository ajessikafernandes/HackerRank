package Solution;

import java.util.Scanner;

/*
* Given an integer NN as input, check the following:
* If NN is odd, print "Weird".
* If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
* If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
* If NN is even and N>20N>20, print "Not Weird".
* 
* We given you partially completed code in the editor, complete it to solve the problem.
* 
* Input Format
* There is a single line of input: integer NN.
* Constraints
* 1≤N≤1001≤N≤100
* 
* Output Format
* Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.
* 
*/

public class SolutionIf {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if ((N % 2) != 0) {
			System.out.println("Weird");
		} else if ((N % 2) == 0 && N > 2 && N < 5) {
			System.out.println("Not Weird");
		} else if ((N % 2) == 0 && N > 6 && N < 20) {
			System.out.println("Weird");
		} else if ((N % 2) == 0 && N == 20) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}

		scanner.close();
	}
}
