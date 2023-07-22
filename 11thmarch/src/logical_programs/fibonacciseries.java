package logical_programs;

public class fibonacciseries {
	public static void main(String [] args) {
		
		//it is series in which third number is sum of first two numbers
		
		/*int a=-1; int b= 1; int c;
		
		for (int i = 1; i<= 10; i++) {
			 c= a+b;
			 
			 System.out.print(" "+c);
			 
			 a=b; 
			 b= c;  
		}      */
		
		int a=-1; int b = 1; int c;
		
		for (int i=1; i<=10; i++) {
			c= a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			
		}
		
		
	}

}
