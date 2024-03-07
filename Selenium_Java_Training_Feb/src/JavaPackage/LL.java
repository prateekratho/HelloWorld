package JavaPackage;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();

		list.addFirst("A");
		list.addFirst("This");
		System.out.println(list);
		list.addFirst("this");
		System.out.println(list);
		list.addLast("This");
		System.out.println(list);
		list.add("Prateek");
		System.out.println(list);

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.println("null");
		list.removeFirst();
		System.out.println(list);

		// Given an element, how do you find out whether that element exist in a
		// LinkedList or not.
		// If it exist retrieve the position of that element?

		LinkedList<String> list1 = new LinkedList<String>();
		// Adding elements at the end of the list

		list.add("JAVA");

		list.add("J2EE");

		list.add("JSP");

		list.add("SERVLETS");

		list.add("JDBC");

		// Printing the elements of list

		System.out.println(list1); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		String s = "JSP";

		// Checking whether list contains "JSP"

		boolean contains = list.contains(s);

		if (contains) {
			// If list contains "JSP", printing it's index

			System.out.println(list.indexOf(s)); // Output : 2
		}

		s = "STRUTS";

		// Checking whether list contains "STRUTS"

		contains = list.contains("STRUTS");

		if (contains) {
			// If list contains "STRUTS", printing it's index

			System.out.println(list.indexOf(s));
		}
	}
}
