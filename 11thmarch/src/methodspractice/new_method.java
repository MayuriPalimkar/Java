package methodspractice;

import java.util.Scanner;

public class new_method {

	//method is a block of code used to reuse the code. method is invoked by calling it. method has diff return types . it can accept diff para
	//main method is starting point from where compiler starts program execution. it has no return type void. it is always static no need to create object
	//it always has array of string args. the access specifier by default of main method is public. 
	//types of methods- main method and regular method. regular method is user defined it can be modified by programmer .It can be static or non static 
	//static method can be called by method name or classname.method name. For calling non static regular method need to create the object.and called by ref vanrname.methodname\
	//it can be with args or without args.
	//java also provides some predefined methods like print(), max(). print is method of printStream class.
	//compiler first execute static block then static method then creates the object and then executes the instance methods
	
	//static block

	static {
	
		System.out.println("Static block");
	}
	//main method 
	public static void main(String [] args) {
		System.out.println("main method started");
		
		//to call demo we need to create the object
		new_method test = new new_method();
		//calling non static method 
		test.demo();
		//to take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		//to initialize variable of demo2
		int num = sc.nextInt();
		//static method call
		new_method.demo2(num);
		
		System.out.println("Main method ended");
	}
	
	
	
	public void demo() {
		int a = 20; int b=20; int c;
		
		c = a+b;
		
		System.out.println(c);
		
		
		
	}
	
	public static void demo2(int num) {
	
		
		if(num%2 ==0) {
			System.out.println("number is even");
			
		}else {
			System.out.println("number is odd");
		}
		
		
		
		
		
	}
}
