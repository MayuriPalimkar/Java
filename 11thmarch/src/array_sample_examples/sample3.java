package array_sample_examples;

import java.util.Arrays;

public class sample3 {
	public static void main(String[] args) {
		
		int ar[] = new int[5];
		
		ar[0] = 12;
		ar[1] = 85;
		ar[2] = 63;
		ar[3] = 42;
		ar[4] = 122;
		
		System.out.println(ar[4]);
		
		for (int i =0; i< ar.length; i++) {
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		System.out.println("array in asc order");
		Arrays.sort(ar);
		for (int i =0; i< ar.length; i++) {
			System.out.print(" "+ar[i]);
		}
		
	}

}
