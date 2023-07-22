package forloops;

public class sum {
 //WAP to print sum of first 100 numbers
	public static void main(String[] args) {
		
	
	int i =1;
	int sum =0;
	
	for (i=1; i<=100; i++) {
		sum = sum+i;
	}
	System.out.println("sum of 1 to 100numbers is-->"+sum);
}
}