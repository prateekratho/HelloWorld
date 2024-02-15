package JavaPackage;

import java.util.Scanner;

public class excercises {
	public static int greaterNumber(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	public static void main(String[] args) {
		// Enter 3 numbers from the user & make a function to print their average.
		Scanner sc = new Scanner(System.in);
		int Number1 = sc.nextInt();
		int Number2 = sc.nextInt();
		int Number3 = sc.nextInt();
		float Average = (Number1 + Number2 + Number3) / 3;
		System.out.println("Average of 3 Number is-" + Average);

	}

}
