package array_sample_examples;

public class sample1 {
	public static void main(String[] args) {
	
		//single dimension array
		//declaration
		String ar[] = new String[5];
		
		ar[0] = "ganesh";
		ar[1] = "mahesh";
		ar[2] = "ramesh";
		ar[3] = "suresh";
		//ar[4] = "rahul";
		
		System.out.println(ar[3]);  //prints suresh
		
		System.out.println(ar[4]);   //default value - null print
		
		//System.out.println(ar[5]);   arrayIndexOutOfBoundException
		
		ar[0] = "ganesh1";
		System.out.println(ar[0]);   //multiple initialization is possible
		
	}

}
