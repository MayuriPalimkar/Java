package string;

public class revstring2 {

	public static void main(String [] args) {
		
		String s1 = "Mayuri";
		String rev ="";
		
		System.out.println(s1.length());
		
		for(int i =s1.length()-1; i>=0; i--) {
		 rev = rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
}
