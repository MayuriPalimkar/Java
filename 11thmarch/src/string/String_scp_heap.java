package string;

public class String_scp_heap {
	
	public static void main(String [] args) {
		//String by using literal
		
		String s1 = "Automation";   //scp
		String s2 = "Automation";   //scp
		
		//String by using new keyword
		
		String s3 = new String ("Automation");    //heap+ refer to scp
		String s4 = new String ("Automation");     //new in heap + ref to scp
		
		System.out.println(s1 == s2);  //true
		System.out.println(s1 == s3);  //false
		
		System.out.println(s2 == s3);  //false
		
		System.out.println(s3 == s4);  //false
		
	}

}
