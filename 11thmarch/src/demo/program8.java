package demo;

public class program8 {
	static int k = 600; //static global
	String name = "Rohan"; //non static global
	
	public static void main(String [] args) {
		//variables and its types
		int i = 50;  //local
		System.out.println(i);  //50
		System.out.println(program8.k); //600
		
		program8 ref = new program8();
		System.out.println(ref.name); //Rohan
		//name = "Viru";
	    k = 40;
	    
		System.out.println(k); //40
		
		
		program8.test();
	}
	public static void test() {
		int j = 60;   //local
		System.out.println(j); //60
	}

}
