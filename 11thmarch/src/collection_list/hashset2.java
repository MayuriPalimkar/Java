package collection_list;

import java.util.HashSet;

public class hashset2 {
	
	public static void main(String[] args) {
		
		HashSet  HS2 = new HashSet();
		
		HS2.add(2);
		HS2.add(56);
		HS2.add(true);
		HS2.add(22.5);
		HS2.add("we");
		HS2.add('F');
		System.out.println(HS2);
		
		
		HashSet HS3 = new HashSet();
		HS3.add(2);
		HS3.add(69);
		HS3.add(false);
		HS3.add(63.23);
		HS3.add("you");
		HS3.add(56);
		
		System.out.println(HS3);
		
	//	HS2.addAll(HS3); //only display unique elements from both hashset
	//	System.out.println(HS2);
		
		//retainall
	//	HS2.retainAll(HS3);  //display only common elements
	//	System.out.println(HS2);
		
		
		//System.out.println(HS2.containsAll(HS3));
		HS2.removeAll(HS3);
		System.out.println(HS2);
	}

}
