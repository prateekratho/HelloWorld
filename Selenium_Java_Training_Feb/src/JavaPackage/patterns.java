package JavaPackage;

public class patterns {

	public static void main(String[] args) {

		// outer loop SOLID RECTANGLE
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// Hollow Rectangle
		int n = 5;
		int m = 5;

		// outer loop
//		for (int i = 1; i <= n; i++) {
//			// inner loop
//			for (int j = 1; j <= m; j++) {
//				// cell ->(i,j)
//				if (i == 1 || j == 1 || i == n || j == m) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

	//Half pyramid
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		
		//Inverted half pyramid
		 
		for(int i=4; i>=1; i--) {
			//inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n; i >= 1; i-- ) {
			// inner loop
			for (int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		
		//Inverted half pyramid
		 
		for(int i=4; i>=1; i--) {
			//inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1; i<=n; i++) {
//			//inner loop
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print(" ");
//			}
//			//innerloop -> start point
//			for(int j=1; j<=i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		}
		
//		for (int i =1; i<=n; i++) {
//			for (int j =1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		int number = 1;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(number+"  ");
//				number++;
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				 
//				if((i+j)%2 ==0) {
//					System.out.print("1");
//				}
//				else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
	}
}

