package JavaPackage;

public class dataType1 {
	int b = 6; //variable which is defined outside the method body but inside the class body known as global variable
	static int c = 15; 
	public static void main(String[] args) {
		int a = 5; // variable which is defined inside the method body will be known as local variable 
		System.out.println(a);
		//System.out.println(static b);
		System.out.println(c);
	}

}
