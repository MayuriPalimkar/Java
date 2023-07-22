package collection_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist4 {

	public static void main(String[] args) {
		
		String arr[]= {"dog", "elephant", "cat", "monkey"};
		//System.out.println(arr);
		//to read the elements in array
		for(Object name : arr) {
			System.out.println(name);
		}
		
		//to convert array into arraylist
		
		ArrayList AL = new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
}
}