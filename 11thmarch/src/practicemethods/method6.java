package practicemethods;

public class method6 {  //class body
	
	public static void main(String[]args) {
		//static regular method with parameters
		System.out.println("main method started");
		method6.demo1(95,58, 54);
		
		method6.demo2(525, 558, 1);
		
		method6.demo3(52, 63, 20);
		
		System.out.println("main method ended");
	}
	public static void demo1(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("addition of a,b and c is-->"+d);
	}
   public static void demo2(int a, int b ,int c) {
	   int d = a-b-c;
	   System.out.println("substraction of a, b and c is-->"+d);
	   
   }
   public static void demo3(int a, int b ,int c) {
	   int d = a*b*c;
	   System.out.println("multiplication of a, b and c is-->"+d);
   }
}
