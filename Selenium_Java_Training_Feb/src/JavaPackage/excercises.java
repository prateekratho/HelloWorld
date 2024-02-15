package JavaPackage;

import java.util.Scanner;


public class excercises {
	public static int greaterNumber(int a, int b){
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	public static void Sumodd(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// Enter 3 numbers from the user & make a function to print their average.
		Scanner sc = new Scanner(System.in);
//		int Number1 = sc.nextInt();
//		int Number2 = sc.nextInt();
//		int Number3 = sc.nextInt();
//		float Average = (Number1 + Number2 + Number3) / 3;
//		System.out.println("Average of 3 Number is-" + Average);
		// Write a function to print the sum of all odd numbers from 1 to n.
		int n = sc.nextInt();
		Sumodd(n);
		
	}

	

}
