package JavaPackage;

import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentLL {

	public static void main(String[] args) {
		
		//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
		  
		 
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		list.add(1);
//		list.add(5);
//		list.add(7);
//		list.add(3);
//		list.add(8);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);
//		int targetNum = 7;
//		int ans = -1; //initialised the answer to the index -1
//		for (int i = 0; i < list.size(); i++) {
//			int list1 = list.get(i);
//			if (list1 == targetNum) {
//				ans = i;
//				break;
//			}
//		}
//		if (ans == -1) {
//			System.out.println("Element not found");
//		} else {
//			System.out.println("Element found in Linked list at " + ans);
//		}
//	}
//		int index = findIndex(list, targetNum);
//		
//		if(index != -1) {
//			System.out.println("The index of " + targetNum + " is: " + index);
//		}
//		else {
//			System.out.println(targetNum + "not found in list");
//		}
//	}

//	private static int findIndex(LinkedList<Integer> list, int targetNum) {
//		// TODO Auto-generated method stub
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i) == targetNum) {
//				return i;
//			}
//		}
//		return -1;
//	}
// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
	
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println("Enter the Range- " + n);

		for (int i = 0; i < n; i++) {
			list.add(Integer.valueOf(i));
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 25) {
				list.remove(i);
				i--;
			}
			//System.out.println(list);
		}

		System.out.println(list);
	}

	//Swapping Node
	
//	public ListNode swapPairs(ListNode head) {
//        ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode current = dummy;
//
//         while(current.next != null && current.next.next != null){
//             ListNode first = current.next;
//             ListNode second = current.next.next;
//
//            first.next = second.next;
//            second.next = first;
//            current.next = second;
//
//            // Move to the next pair
//            current = current.next.next;
//    }
//     return dummy.next;
//}
}
