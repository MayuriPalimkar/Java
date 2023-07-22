package collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylist8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ArrayList al = new ArrayList();
		
		int arr[] = {100,15,65,86,36,96};
		
		for(int i : arr) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		ArrayList al = new ArrayList (Arrays.asList(arr));
		System.out.println(al);
		
		ArrayList AL1 = new ArrayList();
		
		AL1.add(15);
		AL1.add(63);
		AL1.add(48);
		AL1.add(25);
		System.out.println(AL1);
		
		ArrayList duplicate = new ArrayList();
		duplicate.addAll(AL1);
		System.out.println(duplicate);
		
		duplicate.add(0,12);
		System.out.println(duplicate);
		duplicate.removeAll(AL1);
		System.out.println(duplicate);
		
		Collections.sort(AL1);
		System.out.println(AL1);
		
		Collections.sort(AL1,Collections.reverseOrder());
		System.out.println(AL1);
		
		Collections.shuffle(AL1);
		System.out.println(AL1);
		
		
	}

}
