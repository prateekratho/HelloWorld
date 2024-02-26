package JavaPackage;

public class Recursion3 {

	public static int first = -1;
	public static int last = -1;

	public static void findOccurence(String str, int idx, char element) {
		if (idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar = str.charAt(idx);
		if (currChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		findOccurence(str, idx + 1, element);
	}

	public static boolean isSorted(int arr[], int idx) {
		if (idx == arr.length - 1) {
			return true;
		}
		if (arr[idx] < arr[idx + 1]) {
			// array is sorted till now
			return isSorted(arr, idx + 1);
		} else {
			return false;
		}
	}

	public static void moveAllX(String str1, int idx, int count, String newString) {
		if (idx == str1.length()) {
			for (int i = 0; i < count; i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}

		char currChar = str1.charAt(idx);
		if (currChar == 'x') {
			count++;
			moveAllX(str1, idx + 1, count, newString);
		} else {
			newString += currChar;
			moveAllX(str1, idx + 1, count, newString);
		}
	}

	public static void subsequence(String str2, int idx, String newString) {
		if (idx == str2.length()) {
			System.err.println(newString);
			return;
		}
		char currChar = str2.charAt(idx);
		subsequence(str2, idx + 1, newString + currChar);
		subsequence(str2, idx + 1, newString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaacdaefaah";
		findOccurence(str, 0, 'a'); // element 'a';

		int arr[] = { 1, 3, 2, 5 };
		System.out.println(isSorted(arr, 0));
		String str1 = "axbcxxd";
		moveAllX(str1, 0, 0, "");
		String str2 = "abc";
		subsequence(str2, 0, " ");
	}
}
