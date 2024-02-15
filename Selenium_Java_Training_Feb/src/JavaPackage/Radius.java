package JavaPackage;

import java.util.Scanner;

public class Radius {
	public static double Circumference(double r) {
		return 2 * 3.14 * r;
	}

	public static void main(String[] args) {
		// Write a function that takes in the radius as input and returns the
		// circumference of a circle.
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		System.out.println(Circumference(radius));

	}

}
