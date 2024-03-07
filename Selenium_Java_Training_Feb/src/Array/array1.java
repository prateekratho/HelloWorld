package Array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Take an array of names as input from the user and print them on the
		// screen.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		String name[] = new String[size];
		
		for (int i = 0; i < size; i++) {
			name[i] = sc.next();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println("name " + (i + 1) + " is : " + name[i]);
		}

		
		 
	}

}
