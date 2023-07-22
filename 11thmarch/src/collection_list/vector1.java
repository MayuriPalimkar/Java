package collection_list;

import java.util.Iterator;
import java.util.Vector;

public class vector1 {
	public static void main(String [] args) {
		
		Vector VC = new Vector();  //can store heterogeneous data
		
		//insert the element
		
		VC.add("test");
		VC.add(2);
		VC.add(4);
		VC.add('F');
		VC.add(true);
		VC.add(44);
		
		System.out.println(VC);
		
		System.out.println(VC.size());
		
		//remove
		VC.remove(2);
		System.out.println(VC);
	     VC.remove(true);
	     
	     System.out.println(VC);
	     
	     //update
	     
	     VC.set(1, 22);
	     System.out.println(VC);
	    System.out.println(VC.get(3));
	    VC.remove(3);
	    System.out.println(VC);
	     VC.add(3,10);
	     System.out.println(VC);
	     
	    System.out.println( VC.get(2));
	     
	     System.out.println("Reading the element using for loop");
	     
	     for(int i=0; i<VC.size();i++) {
	    	 System.out.print(" "+VC.get(i));
	     }
	     System.out.println();
	     System.out.println("reading elements using for each loop");
	     for(Object obj : VC) {
	    	 System.out.print(" "+obj);
	     }
	     
	     System.out.println();
	     System.out.println("reading element using iterator");
	     
	     Iterator it = VC.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	    	 
	     }
	     
	
		
	}

}
