package array_sample_examples;

public class sample9 {
	public static void main(String[] args) {
		
		int ar [][] = {{1,2,3},{4,5,6}};
		
		System.out.println(ar.length);
		
		//System.out.println(ar[row].length);
		
		for (int i = 0; i<ar.length; i++) {
			for(int j = 0; j<ar[i].length;j++) {
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}
	}

}
