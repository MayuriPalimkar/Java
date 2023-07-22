package logical_programs;

public class swapping_two_numbers {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println("before swapping the numbers"+a+" "+b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println("after swapping the numbers"+a+" "+b);
	}
}
