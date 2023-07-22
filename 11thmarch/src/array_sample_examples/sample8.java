package array_sample_examples;

public class sample8 {
	
	public static void main(String[] args) {
		
		int ar[][] = {{1,2},{3,4},{5,6}};
		System.out.println(ar.length);
		
		for (int i =0; i<=2; i++) {
			for(int j =0; j<=1; j++) {
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}
	}

}
