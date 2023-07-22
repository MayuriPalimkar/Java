package array_sample_examples;

import java.util.Arrays;

public class Sample4 {
	
	public static void main(String [] args) {
		int ar[] = new int[5];
		
		ar[0] = 25;
		ar[1]= 65;
		ar[2] = 36;
		ar[3] = 29;
		ar[4] = 52;
		
		System.out.println("before sorting");

	    for (int i =0; i< ar.length; i++) {
	    	System.out.print(" "+ar[i]);
	    }
	    
	    System.out.println("array in desc order");
	
	    Arrays.sort(ar);
	    
	    for (int i = (ar.length-1); i>=0; i--) {
	    	System.out.print(" "+ar[i]);
	    }
	
	
	}

}
