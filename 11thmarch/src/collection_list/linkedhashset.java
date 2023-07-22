package collection_list;

import java.util.LinkedHashSet;

public class linkedhashset {
	public static void main (String [] args) {
		LinkedHashSet LHS = new LinkedHashSet();
		//insertion order is preserved
		//no duplicate values is allowed
		//only one null value is allowed
		
		LinkedHashSet <Integer> LHS1 = new LinkedHashSet<Integer>();
		
		LHS.add(21);
		LHS.add(85.23);
		LHS.add(true);
		LHS.add("welcome");
		LHS.add('M');
		LHS.add(69);
		LHS.add(null);
		
		System.out.println(LHS);
		
		LHS.remove(69);
		System.out.println(LHS);
		
	    System.out.println(LHS.isEmpty());
	    
	    System.out.println(LHS.add(21));
		
	    System.out.println(LHS1.isEmpty());
		
		
	}

}
