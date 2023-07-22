package demo;

public class typesofvariables {
	//global variables
	int i = 20;
	int j = 20;
	int k = i+j;
	static String addition= "add";
	 
 public static void main (String [] args) {
	 typesofvariables ref = new typesofvariables();
	 System.out.println(ref.k);
	 System.out.println(typesofvariables.addition);
	 
	 typesofvariables.test1();
 }
 public static void test1() {
	 //local variables
	 int l = 50;
	 int m = 69;
	 int n = l*m;
	System.out.println(n); 
	
 }
}
