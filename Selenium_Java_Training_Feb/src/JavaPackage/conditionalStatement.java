package JavaPackage;

import java.util.Scanner;

public class conditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age > 18) {
//			System.out.println("Adult");
//		}else{
//			System.out.println("Not Adult");
//		}
//		int num = sc.nextInt();
//		System.out.println(num);
//		if(num % 2 == 0) {
//			System.out.println("Number is Even");
//		}
//		else {
//			System.out.println("Number is Odd");
//		}
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a > b) {
//			System.out.println("a is greater");
//		} else if (a < b) {
//			System.out.println("b is greater");
//		} else {
//			System.out.println("Equal");
//		}
//		sc.close();
		int button = sc.nextInt();
		switch(button) {
		case 1: System.out.println("Hello");
		break;
		case 2: System.out.println("Namaste");
		break;
		case 3: System.out.println("Bonjour");
		break;
		default: System.out.println("Invalid Button");
		}
	}

}
