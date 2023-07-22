package collection_list;

import java.util.HashSet;

public class Hashset3 {
	public static void main(String[] args) {
		
		HashSet<String>HS2 = new HashSet<String>();
		
		HS2.add("Rohit");
		HS2.add("viru");
		HS2.add("Ajay");
		HS2.add("Rahul");
		System.out.println(HS2);
		
		HashSet<String>HS3 = new HashSet<String>();
		HS2.add("Soni");
		HS3.addAll(HS2);
		System.out.println(HS3);
		
		//HS3.removeAll(HS2);
	   // System.out.println(HS3);
		
		HS3.add("Rani");
		HS3.add("Moni");
		//System.out.println(HS3);
		
		//HS2.addAll(HS3);
		//System.out.println(HS2);
		
		HS2.retainAll(HS3);
		System.out.println(HS2);
		
		HS3.removeAll(HS2);
		System.out.println(HS3);
		
		
	}

}
