package collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist3 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(60);
		al.add(30);
		al.add(62);
		al.add(43);
		System.out.println(al);
		
		//addAll
		ArrayList duplicate = new ArrayList();
		duplicate.addAll(al);
		System.out.println(duplicate);
		
		//removeAll
		duplicate.removeAll(al);
		System.out.println(duplicate);

		//sort the elements in arraylist in asc order
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		//sort elements in arraylist in rev order
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		
		Collections.shuffle(al);
		System.out.println(al);
		
		
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
