package JavaPackage;

public class patt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		for(int i=n; i>=1; i--) {
	           //spaces
	           for(int j=1; j<=n-i; j++) {
	               System.out.print(" ");
	           }
	           for(int j=1; j<=2*i-1; j++) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }

	}

}
