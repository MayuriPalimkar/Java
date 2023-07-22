package array_sample_examples;

import java.util.Arrays;

public class sample2 {

	public static void main(String[] args) {
		
		//single dimension array
		//declaration
		String ar[] = new String[5];
		
		ar[0] = "ganesh";
		ar[1] = "mahesh";
		ar[2] = "ramesh";
		ar[3] = "suresh";
		ar[4] = "rahul";
		
		//to get array length
		System.out.println(ar.length);  //5
		
		//to print multiple info in array using for loop
		
		for (int i =0; i<=(ar.length-1); i++) {
			System.out.println(ar[i]);
		}
		System.out.println();
		
		//to print elements in array in asc order
		  Arrays.sort(ar);
		  
		//  System.out.println(ar);   cannot print directly
		  
		  for (int i =0; i< ar.length; i++) {
			  System.out.print(" "+ar[i]);
		  }
		
		
		
}
}