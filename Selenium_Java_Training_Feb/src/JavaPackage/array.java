package JavaPackage;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int marks[] = new int[3];
//		int marks1[] = {88, 89, 90};
//		//int []marks = new int[3]
//		marks[0] = 88;
//		marks[1] = 90;
//		marks[2] = 95;
////		System.out.println(marks[0]);
////		System.out.println(marks[1]);
////		System.out.println(marks[2]);
//		for(int i =0; i<3; i++) {
//			System.out.println(marks[i]);
//		}
//		for(int i =0; i<3; i++) {
//			System.out.println(marks1[i]);
//		}

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];

		// input
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		int X = sc.nextInt();
		System.out.println(numbers.length);

		// output
		boolean flag = false;
		for (int i = 0; i < numbers.length; i++) {
			if (X == numbers[i]) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(" found ");
		} else {
			System.out.println("Not found");
		}

	}

}

//Taking an array as an input and printing its elements.
//Scanner sc = new Scanner(System.in);
//int size = sc.nextInt();
//int numbers[] = new int[size];
//
//
//for(int i=0; i<size; i++) {
//    numbers[i] = sc.nextInt();
//}
//
//
////print the numbers in array
//for(int i=0; i<arr.length; i++) {
//    System.out.print(numbers[i]+" ");
//}
//}
