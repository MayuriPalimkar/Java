package logical_programs;

public class palindrome {
	
	public static void main(String[] args) {
		// palindrome number
		
		int num = 4554;
		int rev = 0;
		int rem;
		int temp;
		
		temp = num;
		
		while(temp != 0) {
			rem = temp % 10;
			rev = rev *10 + rem;
			
			temp /= 10;  // to shorten the number from last digit
			
			
		}
		System.out.println(rev);
		
		if (num == rev) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
	}

}
