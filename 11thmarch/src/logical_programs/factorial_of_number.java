package logical_programs;

public class factorial_of_number {
// factorial is the product of all descending digits of number
	//eg. 4! = 4*3*2*1=24
	
	public static void main(String[] args) {
		
		int number = 8;
		int fact = 1;
		
		for (int i =1; i <= number; i++) {
			 fact = fact * i;
		}
		System.out.println("factorial of given number is "+ fact );
		
		
		
	}
}
