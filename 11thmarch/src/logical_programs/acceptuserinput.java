package logical_programs;

import java.util.Scanner;

public class acceptuserinput {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("enter a second number");
		int num1 = sc.nextInt();
		
		System.out.println("addition of two numbers is="+(num+num1));
		System.out.println("subtraction of two numbers is="+(num-num1));
		
		
		
	}

}
