package string;

public class String8 {

	public static void main(String [] args) {
        String str= "welcome to java and automation";
        String Rev = "";
        
        for (int i=str.length()-1; i>=0; i--) {
        	Rev = Rev + str.charAt(i);
        }
        System.out.println(Rev);  //noitamotua dna avaj ot emocleW
        
        
        String str1[] = str.split(Rev);
        for (int j=str1.length-1; j>=0; j--) {
        	System.out.println(str1[j]);
        }
       
}
}