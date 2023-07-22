package logical_programs;

public class fibonaccisseries {
	
	public static void main(String[] args) {
		
		//fs = next number is the sum of previous two numbers
		
		//0,1,1,2,3,5,8,13,21,34,55
		
		int a=-1, b=1, c;
		
		for(int i = 1; i<=10; i++) {
			c= a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
