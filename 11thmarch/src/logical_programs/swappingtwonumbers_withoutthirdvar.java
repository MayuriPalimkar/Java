package logical_programs;

public class swappingtwonumbers_withoutthirdvar {
	
	public static void main(String[] args) {
		
		int a= 50;
		int b= 40;
		System.out.println("before swapping the numbers  "+a+" "+b);
		
		a= a+b;  //90
		b= a-b;  //50
		a = a-b; //40
		
		System.out.println("after swapping two numbers "+a+" "+b);
	}

}
