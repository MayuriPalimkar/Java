package collection_list;

import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class hashset1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();  // dc = 16 and Load factor = 0.75 and heterogeneous
		
		HashSet HS1 =new HashSet (200,(float) 0.50);
		
		HashSet <String> HS2 = new HashSet<String>();  //homo
		
		hs.add(22);
		hs.add("Welcome");
		hs.add('F');
		hs.add(45.25);
		hs.add(true);
		hs.add(75);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.add('h'));
		
		System.out.println(hs.add('h'));
		
		//if you are trying to add duplicate element then it will return false
		//if the element is not present in hashset then it will return true
		
		//remove
		
		hs.remove('F');
		System.out.println(hs);
		
		System.out.println(hs.add('F'));  //true
		
		//isEmpty
		System.out.println(hs.isEmpty());
		
		System.out.println(HS2.isEmpty());
		
		//set and get are not present in hashset
		
		//contains
		System.out.println("****************");
		
		System.out.println(hs.contains('j'));
		System.out.println(hs.contains('F'));
		
		//cannot use for loop because we caannot use index 
		
		System.out.println();
		System.out.println("reading element using for each loop");
		for(Object obj: hs) {
			System.out.print(" "+obj);
		}
		System.out.println();
		System.out.println("reading elements using iterator");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
			
		}
		System.out.println();
		System.out.println(hs.isEmpty());
	
		
	}

}
