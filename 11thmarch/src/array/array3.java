package array;

import java.util.Arrays;

public class array3 {

	public static void main(String [] args) {
		char cr[]= new char[5];  //array declaration
		
		cr[0] = 'A';
		cr [1] = 'G';
		cr[2] = 'C';      //array initialization
		cr[3] = '1';
		cr[4] = '2';
		//cr[5] = 'f';   arrayoutofboundexception
		
		System.out.println(cr.length);   // to print the size of array
		
		for(int i = 0 ; i< cr.length; i++) {
			System.out.println(cr[i]);
			
		}
		System.out.println();
		System.out.println("index of 3="+cr[3]);
		System.out.println();
		
		Arrays.sort(cr);
		for (int i = 0 ; i < cr.length; i++) {
			System.out.println(" "+cr[i]);
		}
	}
}
