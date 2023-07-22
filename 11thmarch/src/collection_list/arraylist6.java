package collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist6 {
	public static void main(String [] args) {
		ArrayList Al = new ArrayList();
		
		Al.add('O');
		Al.add('P');
		Al.add('G');
		Al.add('A');
		
	System.out.println(Al);
	
	ArrayList duplicate = new ArrayList();
	 duplicate.addAll(Al);
	  System.out.println(duplicate);
	  System.out.println(Al);
	  Collections.sort(duplicate);
	  System.out.println();
	  
	//  Collections.sort(Al,);
		Collections.sort(Al,Collections.reverseOrder());
		System.out.println(Al);
		
		
	}

}
