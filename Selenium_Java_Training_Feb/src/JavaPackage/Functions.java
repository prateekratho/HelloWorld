package JavaPackage;

import java.util.Scanner;

public class Functions {
	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	private static int calculateProduct(int a, int b) {
		return a * b;
	}

	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void printFactorial(int N) {
		if(N<0) {
			System.out.println("Invalid Number");
			return;
		}
		int factorial = 1;
		for (int i = N; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String name = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int N = sc.nextInt();
		// printMyName(name);//call kiya function ko
		int sum = calculateSum(a, b);
		int multiply = calculateProduct(a, b);
		System.out.println("Sum of 2 numbers is :" + sum);
		System.out.println("Sum of 2 numbers is :" + multiply);
		printFactorial(N);
		
		sc.close();
	}
}
