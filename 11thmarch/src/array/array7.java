package array;

public class array7 {

	public static void main(String [] args) {
		
		String s1[] [] = new String[4] [5];
		
		System.out.println(s1.length);
		System.out.println(s1[2].length);
		
		s1[0][0] = "A1";
		s1[0][1] = "A2";
		s1[0][2] = "A3";
		s1[0][3] = "A4";
		s1[0][4] = "A5";
		
		s1[1][0] = "B1";
		s1[1][1] = "B2";
		s1[1][2] = "B3";
		s1[1][3] = "B4";
		s1[1][4] = "B5";
		
		s1[2][0] = "C1";
		s1[2][1] = "C2";
		s1[2][2] = "C3";
		s1[2][3] = "C4";
		s1[2][4] = "C5";
		
		s1[3][0] = "D1";
		s1[3][1] = "D2";
		s1[3][2] = "D3";
		s1[3][3] = "D4";
		s1[3][4] = "D5";
		
		System.out.println(s1[2][2]);
		System.out.println(s1[3][4]);
		System.out.println();
		
		for (int row = 0 ; row < s1.length; row++) {
			for (int col =0; col< s1[1].length; col++) {
				System.out.print(s1[row] [col]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
