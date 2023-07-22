package collection_list;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist1 {
	
	public static void main(String [] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("welcome");
		ll.add(12);
		ll.add('A');
		ll.add(true);
		ll.add(32.54);
		System.out.println(ll);
		
		ll.add(2,59);
		System.out.println(ll);
		
		System.out.println(ll.get(3));
		
		ll.set(2, 39);
		System.out.println(ll);
		
	    System.out.println(ll.isEmpty());
	    
	    
	    System.out.println(ll.contains('A'));
	    
	    System.out.println(ll.contains('b'));
	    
	    ll.remove(32.54);
	    System.out.println(ll);
	    
	    LinkedList LL2 = new LinkedList();
	    LL2.add(12);
	    LL2.add(52);
	    LL2.add(23);
	    LL2.add(59);
	    LL2.add(4);
	    
	    System.out.println(LL2);
	    
	    LinkedList duplicate  = new LinkedList();
	      duplicate.addAll(LL2);
	      System.out.println(LL2);
	      
	      duplicate.add(1,85);
	      System.out.println(duplicate);
	      
	      duplicate.removeAll(LL2);
	      System.out.println(duplicate);
	      
	      Collections.sort(LL2);
	      System.out.println(LL2);
	      
	      Collections.sort(LL2,Collections.reverseOrder());
	      System.out.println(LL2);
	      
	      Collections.shuffle(LL2);
	      System.out.println(LL2);
	      
	      System.out.println(ll.size());
	      
	      System.out.println(LL2.size());
	      
	      System.out.println(duplicate.size());
	    
	}

}
