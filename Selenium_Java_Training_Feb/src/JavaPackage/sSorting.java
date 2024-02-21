package JavaPackage;

public class sSorting {
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
		// selection sort
		for (int i =0; i<array.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[smallest] > array[j]) {
					smallest = j;
				}
			}
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i]= temp;
		}
		printArray(array);
	}

}
