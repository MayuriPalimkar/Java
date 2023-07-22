package practicemethods;

public class method1 { //class body
	
	public static void main(String[]args) {
		//main method body 
		
	//static regular method calling from same class
		System.out.println("main method started");
		//direct calling static method 
	//	demo1();
	//	demo2();
		//calling by class name static method
		method1.demo1();
		method1.demo2();
		
		
		
		System.out.println("main method ended");
		
	}	
  public static void demo1 () {
	  int i = 10;
	  int j = 20;
	  int k = i+j;
	  System.out.println("addition of i+j is -->"+k);
  }
  public static void demo2() {
	  
	  System.out.println("static regular method calling from same class");
  }
}
