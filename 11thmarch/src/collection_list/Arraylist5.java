package collection_list;


import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist5 {
	public static void main(String[] args) {
		String arr []= {"man","can","ran","van"};
		//System.out.println(arr);  // cannot print directly array of string
		
		//to read elements in array
		for(String obj : arr) {
			System.out.print(" "+obj);
		}
		System.out.println();
		
		//to  convert string of array into arraylist
		ArrayList AL = new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
	}

}
