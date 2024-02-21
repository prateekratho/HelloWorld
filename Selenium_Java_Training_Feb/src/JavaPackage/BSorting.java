package JavaPackage;

public class BSorting {
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {7, 8, 2, 1, 3};
		// System.out.println(array.length);
		// bubble sort
		//time complexity = 0(n^2)
		for (int i = 0; i < array.length - 1; i++) { //n-1
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		printArray(array);
	}

}
