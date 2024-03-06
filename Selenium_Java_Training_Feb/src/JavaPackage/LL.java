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
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " -> ");
		}
		System.out.println("null");
		list.removeFirst();
		System.out.println(list);
		
		
	}

}
