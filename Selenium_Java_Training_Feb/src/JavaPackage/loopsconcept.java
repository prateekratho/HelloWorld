package JavaPackage;

import java.util.Scanner;

public class loopsconcept {

	public static void main(String[] args) {
//		for(int i=0; i<=3; i++){
//		System.out.println("Hello World");
//		}
//		for (int i= 0; i<11; i++) {
//			System.out.println(i+" ");
//		} for loop
//		int i = 0;
//		while(i < 11) {
//			System.out.println(i);
//			i++;
//		} while loop
		 
//		int i=0;
//		do {
//			System.out.println(i);
//			i =i+1;
//		}while(i<=11);
		
		//print sum of first n Natural Number n=4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int sum = 0;
		for (int i=1; i<11 ; i++) {
			System.out.println(n*i);
		}
	//	System.out.println(sum);
		
	}

}
