package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	

	public static void main(String[] args) {
		int arr[] = new int[5];    //static similar type of data
		
		ArrayList AL = new ArrayList();  //dynamic array homo+hetero type of data
		
		ArrayList<String> AL1 = new ArrayList<String>();  //static array containing String type of data
		//AL1.add("java");
		//AL1.add("welcome");
		//AL1.add(33);  //cannot store int type of data
	//1. add- to add the element in array list
		
		AL.add("welcome");//String
		AL.add(33);//int
		AL.add(true);//boolean
		AL.add('A');//char
		AL.add(33.4);//double
		AL.add(null);
		System.out.println(AL);
		
		//2.size- returns the number of elements in arraylist
		
		System.out.println("number of elements in arraylist-"+AL.size());
		
		AL.add(300);
		AL.add(4000);
		System.out.println("number of elements in arraylist="+AL.size());
		
		//3.remove- to delete the specific element from the arraylist
		//Syntax-RV.remove(index of element);
		System.out.println(AL);
		
		AL.remove(6);
		System.out.println(AL);
		
		//4. insert new element in arraylist
		AL.add(50);
		AL.add(2,40);
		AL.add(4,"python");
		System.out.println(AL);
		AL.remove(2);
		System.out.println(AL);
		
		//to retrieve element at specific position get method is used
		//5.get - returns element at specified position in this arraylist
		System.out.println(AL.get(0));
		
		System.out.println(AL.get(6));
		
		//System.out.println(AL.get(20));//indexoutofboundexception
		
		//6.replace/change method
		//set
		AL.set(5, 55);
		System.out.println(AL);
		
		AL.set(6,"Ruby");
		System.out.println(AL);
		
		System.out.println(AL.isEmpty());
		
		System.out.println(AL1.isEmpty());
		
		//read or print the data  from arraylist
		System.out.println("reading data using for loop");
		
		for(int i=0; i <AL.size(); i++){
			System.out.print(" "+AL.get(i));
			
		}
		System.out.println();
		
		//reading element using for each loop
		System.out.println("reading element using for each loop");
		for( Object obj : AL) {
			System.out.println(obj);
			
		}
		System.out.println();
		System.out.println("Reading element using iterator");
		//reading elements using iterator
		
		Iterator AL2 = AL.iterator();
		
		while(AL2.hasNext()) {
			System.out.println(AL2.next());
		}
	}
		
	}


