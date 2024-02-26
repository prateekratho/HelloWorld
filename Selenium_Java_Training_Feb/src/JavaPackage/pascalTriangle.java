package JavaPackage;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
//			1
//		   1 1
//		  1 2 1
//		 1 3 3 1
//		1 4 6 4 1
		int n = 5;	
		for(int i =0; i<n; i++) {
			int number = 1;
		for(int j=0; j<n-i;j++) {
				System.out.print(" ");
		}
		for(int k=0; k<=i; k++) {
			System.out.print(number+" ");
			number = number * (i -k) / (k + 1);
		}
		System.out.println();
		}
//		System.out.println("Enter nos. of Lines");
	//	Scanner sc = new Scanner(System.in);
//		int no = sc.nextInt();
//		int spaces = no;
//		int number = 1;
//		
//		for (int i = 0; i < no; i++) {
//			for (int s = 1; s <= no; s++) {
//				System.out.print(" ");
//			}
//			number = 1;
//			for (int j = 0; j <= i; j++) {
//				System.out.print(number + " ");
//				number = number * (i - j) / (j + 1);
//			}
//			no--;
//			System.out.println();
//		}

	}

}
