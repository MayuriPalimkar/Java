package string;

public class revString4 {
	public static void main(String [] args) {
		
		String str  = "Viransh";
		String rev = "";
		
		System.out.println(str.length());
		
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}

}
