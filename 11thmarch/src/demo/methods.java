package demo;

public class methods {
	//methods and its types
	
	public static void main(String [] args) {  //main method body
		//statrting point of main method
		methods.test1();   //static regular method calling from same class  30
		
		methods ref = new methods();   //non static regular method   15 viru
		ref.test2();
		
		methods.test3(9890, "vijay"); // 9890 vijay
		
		
	}
	public static void test1() {  //static regular method
		int i= 10;
		int j = 20;
		int k = i+j;
		System.out.println(k);
		
	}
	public void test2() {       //non static regular method
		int rollno = 15;
		String name = "viru";
		System.out.println(name+ " " + rollno);
		
		
	}
	public static void test3(int mobno , String name ) {
		System.out.println(" mob number and name is " +mobno+ " "+name);
		
	}
	

}
