package logical_programs;

import java.util.Scanner;

public class palindrome_sir {

	public static void main(String[] args) {
		int originalnum ,sum,rem;
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		originalnum = num;
		for(sum=0; num>0; num=num /10) {
			rem = num%10;
			
			sum= sum*10+rem;
			
			
		}
		if(sum==originalnum) {
			System.out.println(originalnum+"--> is a palindrome num");
		}
		else {
			System.out.println(originalnum+"--> is not a palindrome number");
		}

	}

}
