package JavaPackage;
import java.util.ArrayList; //for ArrayList need to import this 
import java.util.Collection;
import java.util.Collections;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer | Float | String | Boolean | String
		ArrayList<Integer>list = new ArrayList<Integer>();
		ArrayList<String>list2 = new ArrayList<>();
		ArrayList<Boolean>list3 = new ArrayList<>();
		ArrayList<Float>list4 = new ArrayList<>();
		ArrayList<Double>list5 = new ArrayList<>();
		
		
		//add elements integer
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//get element
		int element1 = list.get(0);
		int element2 = list.get(1);
		int element3 = list.get(2);
		int element4 = list.get(3);
		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);
		System.out.println(element4);
		//add element in between
		list.add(1, 1);
		System.out.println(list);
		list.add(5, 5);
		System.out.println(list);
		//set elememt 
		list.set(0, 6);
		System.out.println(list);
		int size = list.size();
		System.out.println(size);
		
		//del element
		list.remove(3);
		System.out.println(list);
		
		//size
		//int size = list.size();
		//System.out.println(size);
		 for(int i =1; i<list.size(); i++) {
			 System.out.print(list.get(i));
		 }
		 System.out.println();
		
		 //sorting
		 Collections.sort(list);
		 System.out.println(list);
		 
		//add elements String
		list2.add("Prateek");
		list2.add("Dhruvit");
		list2.add("Sankat");
		list2.add("Jigar");
		System.out.println(list2);
	
		//add elements Boolean
		list3.add(true);
		list3.add(false);
		list3.add(true);
		list3.add(false);
		System.out.println(list3);
		
		//add elements Float
		list4.add(11.1f);
		list4.add(22.2f);
		list4.add(33.3f);
		list4.add(44.4f);
		System.out.println(list4);
		
		//add elements Float
		list5.add(11.123456789);
		list5.add(22.234567890);
		list5.add(33.345678901);
		list5.add(44.456789012);
		System.out.println(list5);
		
		//get element
//		int element = list.get(0);
//		int element1 = list.get(1);
//		int element3 = list.get(2);
//		System.out.println(element);
//		System.out.println(element1);
//		System.out.println(element3);
		
	}
	}


