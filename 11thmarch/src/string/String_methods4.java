package string;

public class String_methods4 {
	public static void main(String[] args) {
		String s= "velocity";
		//length
		System.out.println(s.length());
		
		//touppercase
		System.out.println(s.toUpperCase());
		
		String s1=s.toUpperCase();
		System.out.println(s1);
		//tolowercase
		System.out.println(s.toLowerCase());
		
		//.equals
		String s2 = "velocity";
		String s3 = "VELOCITY";
		
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s));
		
		//.equalsIgnoreCase
		String s4 = "velocity";
		System.out.println(s3.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s3.contains("CITY"));
		
		System.out.println(s3.contains("city"));
		
		//isEmpty
		System.out.println(s3.isEmpty());
		
		//charAt
		System.out.println(s2.charAt(4));
		
		//endsWith
		System.out.println(s2.endsWith("v"));
		System.out.println(s3.endsWith("CITY"));
		
		//startswith
		System.out.println(s2.startsWith("V"));
		System.out.println(s2.startsWith("vel"));
		
		//substring
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(2,6));
		
		//concat
		System.out.println(s2.concat("mayuri"));
		
		//indexof
		System.out.println(s2.indexOf("y"));
		
		String s5= "mumbaia";
		System.out.println(s5.indexOf("M"));
		System.out.println(s5.indexOf("m")+s5.indexOf("m")+1);
		
		System.out.println(s5.replace("mum", "bub"));
		
		
		
		
		
		
		
		
		
	}

}
