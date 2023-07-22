package string;

public class String_methods {
	
	public static void main(String [] args) {
		
		String s1 = "velocity";
		//1.charAt method--it returns the letter at specified index
		System.out.println("letter at index 5-->"+s1.charAt(5));
		System.out.println(s1.charAt(0));
		//System.out.println(s1.charAt(9));   // java.lang.StringIndexOutOfBoundsException
		
		//System.out.println(s1.charAt(-2));//java.lang.StringIndexOutOfBoundsException: String index out of range: -2
		
		String s2 =  "velocity";
		//2.length- it returns the length of given string
        System.out.println(s2.length());
        
        String s3 = "velocity";
        String s4 = new String("velocity");
        String s5 = new String ("Automation");
        String s6 = "VELOCITY";
        
        //3. .equals-- it compares the specified string objects based on values
        System.out.println(s2.equals(s3));  //true
        System.out.println(s3.equals(s4));  //true
        System.out.println(s4.equals(s5));  //false
        System.out.println(s2.equals(s6));   //false
        System.out.println(s2.compareToIgnoreCase(s6));  //0
        
        //4.isEmpty - it checks whether the given string is empty or not
        String s7 = "";
        System.out.println(s6.isEmpty());   //false
        System.out.println(s7.isEmpty());  //true
        
        //5.replace- it replace the specified old char with new char
        String s8 = "Automation";
        System.out.println(s8.replace('a', 'p'));  //Automption
        System.out.println(s8.replace('t', 's'));  //Automasion
        
        //6. replace all- it replace all char of string with new
        String s9 = "velocity";
       String s10 = s9.replaceAll("velocity","pune" );
       System.out.println(s10);
       String s11 = "java , ruby, python";
       System.out.println(s11.replaceAll("java", "c#"));
       
       //7. substring - it returns the substring for given string
       //first index is  inclusive last index is exclusive
       
       String s12 = "velocity classes";
       System.out.println(s12.substring(4, 8));
       System.out.println(s12.substring(9));
       
       //8.indexof-it returns the index value of specified char
       System.out.println(s12.indexOf('c')); // returns index of first c
       System.out.println(s12.indexOf('c')+s12.indexOf('c')+1);//returns index of second c
       
       System.out.println(s12.indexOf('s'));  //returns index of first s
       System.out.println(s12.indexOf('s',s12.indexOf('s')+1));//it returns index of second s
       System.out.println(s12.indexOf('s',s12.indexOf('s')+1+1));
       System.out.println(s12.indexOf('s',s12.indexOf('s',s12.indexOf('s')+2)));//returns the index of third s
       
       //9.lastIndexOf - it reurns the last index of char
       System.out.println(s12.lastIndexOf('s'));//index of last s
       System.out.println(s12.lastIndexOf('c'));
       
       //10.tolowercase- converts the upper case string to lower case
       String s13 = "PYTHON";
       System.out.println(s13.toLowerCase());
       
       //11. touppercase - converts the lower case string to uppercase
       
       String s14 = "python";
       System.out.println(s14.toUpperCase());
       
       //12. trim - it removes the starting and ending space
       
       String s15 = " python ";
       System.out.println(s15);
       System.out.println(s15.trim());
       
       //13.split
       
       String s16 = "21/05/2023";
      String s17[] = s16.split("/");
      for (int i =0; i<=s17.length-1; i++) {
    	  System.out.print(s17[i]);
    	  System.out.println();
      }
      String s18 = "java-ruby-python";
      String s19[] = s18.split("-");
      for (int i=0; i <=s19.length-1; i++) {
    	  System.out.println(s19[i]);
      }
      
      String str = "velocity";
      String str1 = str.toUpperCase();
      String str2 = str1.substring(4);
      System.out.println(str2);
      
       
       
       
  
        
        
        
        
	
	
	
	
	
	
	}

}
