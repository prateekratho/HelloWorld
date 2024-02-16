package JavaPackage;

import java.util.Scanner;

public class arrMatrixIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int numbers[][] = new int[rows][cols];
		// for rows
		for (int i = 0; i < rows; i++) {
			// for coloumns
			for (int j = 0; j < cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();

		// output
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// compare with x
				if (numbers[i][j] == x) {
					System.out.println("x found at location(" + i + "," + j + ")");
				}
			}
		}
	}
}
