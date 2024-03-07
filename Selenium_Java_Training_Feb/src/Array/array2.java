package Array;
import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.Taking an array as an input and printing its elements.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int numbers[] = new int[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		// print the number in array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
