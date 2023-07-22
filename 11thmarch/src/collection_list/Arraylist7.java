package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList AL = new ArrayList();
		
		AL.add(10);
		AL.add('A');
		AL.add("java");
		AL.add(true);
		AL.add(null);
		AL.add(45.2);
		
		System.out.println(AL);
		
		System.out.println(AL.size());
		
		System.out.println(AL.get(2));
		
		AL.set(1, 12);
		System.out.println(AL);
		
		System.out.println(AL.isEmpty());
		
		AL.remove(null);
		System.out.println(AL);
		
		AL.remove(45.2);
		System.out.println(AL);
		
		AL.add(0,10);
		System.out.println(AL);
		
		for(Object obj : AL) {
			System.out.print(" "+obj);
		}
		System.out.println();
		
		for(int i =0; i<AL.size(); i++) {
			System.out.print(" "+AL.get(i));
		}
		System.out.println();
		Iterator AL2 = AL.iterator();
		while(AL2.hasNext()) {
			System.out.print(" "+AL2.next());
		}
	
	}

}
