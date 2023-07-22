package collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		 al.add('A');
		 al.add('Z');
		 al.add('P');
		 al.add('T');
		 al.add('Q');
		 
		 System.out.println(al);
		 
		 //addAll- used to copy or add all elemnts in other arraylist
		 ArrayList duplicate = new ArrayList();
		 duplicate.addAll(al);
		 System.out.println(duplicate);
		 
		 //removeAll - to remove / delete all elements from arraylist
		 
		 duplicate.removeAll(al);
		 System.out.println(duplicate);
		 
		 //collections - to sort elements in arraylist in asc order
		 System.out.println(al);
		 Collections.sort(al);
		 System.out.println(al);
		 
		 //in desc order/rev order
		 Collections.sort(al,Collections.reverseOrder());
		 System.out.println(al);
		 
		 System.out.println(al);
		 Collections.sort(al);
		 System.out.println(al);
		 
		 Collections.sort(al,Collections.reverseOrder());
		 System.out.println(al);
		 
		 // to shuffle elements in arraylist
		 Collections.shuffle(al);
		 System.out.println(al);
		 
		 Collections.shuffle(al);
		 System.out.println(al);

	}

}
