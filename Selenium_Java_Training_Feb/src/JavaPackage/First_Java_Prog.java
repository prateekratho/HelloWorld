package JavaPackage;

public class First_Java_Prog {
	
	public static void main(String[] args) {
		int a= 9;
		int b= 10;
		System.out.println("Before Swapping: a = " +a);
		System.out.println("Before Swapping: a = " +b);
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After Swapping: a = " +a);
		System.out.println("After Swapping: b = " +b);
		
	}

}
