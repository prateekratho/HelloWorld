package JavaPackage;

public class Recursion1 {
	public static void printNumber(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNumber(n - 1);
	}

	public static void pN(int m) {
		if (m == 6) {
			return;
		}
		System.out.println(m);
		pN(m + 1);

	}

	public static void printsum(int i, int x, int sum) {
		if (i == x) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		printsum(i + 1, x, sum);
		System.out.println(i);
	}

	public static int calcFactorial(int y) {
		// TODO Auto-generated method stub
		if (y == 1 || y == 0) {
			return 1;
		}

		int fact_nm1 = calcFactorial(y - 1);
		int fact_y = y * fact_nm1;
		return fact_y;
	}
	
	public static void printfiboSer(int a, int b, int N) {
		if (N == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		printfiboSer(b, c, N-1);

	}

	public static int printPower(int B, int P) {
		if(P == 0) { //base case 1
			return 1;
		}
		
		if(B == 0) {
			return 0;
		}
		int bPownm1 = printPower(B,  P-1);
		int bPown = B * bPownm1;
		return bPown;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printNumber(n);
		
		int m = 1;
		pN(m);
		
		int y = 5;
		printsum(1, 5, 0);
		int ans = calcFactorial(y);
		System.out.println(ans);
		
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int N = 7;
		printfiboSer(a, b, N - 2);
		
		
		int B = 2;
		int P = 5;
		int Ans = printPower(B, P);
		System.out.println(Ans);
	}

	
}
