package array_sample_examples;

public class multidime {
	public static void main(String[] args) {
		int ar [][] = {{10,20,30},{56,85,96}};
		
	//	System.out.println(ar);
		
		for(int i=0; i<=1; i++) {
			for(int j=0; j<=2; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
