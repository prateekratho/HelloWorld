package JavaPackage;

import java.util.Scanner;

public class MinMaxNum {

	public static void main(String[] args) {
		// Find the maximum & minimum number in an array of integers.
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];

		// input
		for (int i = 0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
	System.out.println("Largest number is :" + max);
	System.out.println("Smallest number is :" + min);
	}

}
