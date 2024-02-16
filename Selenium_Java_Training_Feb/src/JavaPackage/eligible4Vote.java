package JavaPackage;

import java.util.Scanner;

public class eligible4Vote {
	public static void age(int age) {
		if(age > 18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Elligible");
		}
	}

	public static void main(String[] args) {
		// Write a function that takes in age as input and returns if that person is eligible to vote or not. 
		//A person of age > 18 is eligible to vote.
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		

	}

}
