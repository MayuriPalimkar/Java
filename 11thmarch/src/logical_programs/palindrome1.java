package logical_programs;

public class palindrome1 {
	
	public static void main(String[] args) {
		
		int num = 444;
		int rev = 0;
		
		int remainder;
		
		while (num != 0) {
			remainder = num % 10;
			
			rev = rev *10 + remainder;
			
			num /= 10;
		}
		System.out.println(rev);
		
		if (num == rev) {
			System.out.println("given number is a palindrome number");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
		
		
	}

}
