package JavaPackage;

public class patterns {

	public static void main(String[] args) {

		int n = 4;
		int m = 4;
		// outer loop SOLID RECTANGLE
//		int n = 4;
//		int m = 5;
//		for (int i = 1; i <=n; i++) {
//			for (int j = 1; j <= m; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// Hollow Rectangle
		//int n = 4;
		//int m = 5;

		// outer loop
//		for (int i = 1; i <= n; i++) {
//			// inner loop
//			for (int j = 1; j <= m; j++) {
//				// inner loop// cell ->(i,j)
//				if (i == 1 || j == 1 || i == n || j == m) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// Half pyramid
//		for (int i = 1; i <= n; i++) {
//			// inner loop
//			for (int j = 1; j <= i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//			}

		// Inverted half pyramid
//		****
//		***
//		**
//		*

//		for(int i=4; i>=1; i--) {
//			//inner loop
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
////		****
////		***
////		**
////		*
//		for (int i = n; i >= 1; i-- ) {
//			// inner loop
//		for (int j = 1; j <= i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//			}

		// Inverted half pyramid
//		****
//		***
//		**
//		*

//		for(int i=4; i>=1; i--) {
//			//inner loop
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

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

//		1234
//		123
//		12
//		1
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		int number = 1;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}

//		1
//		01
//		101
//		0101
//		10101
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

		// Inverted Half Pyrmid 180 Degree rotated
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("$");
			}
		System.out.println();
		}
	}
}
