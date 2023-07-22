package practicemethods;

public class method2 { // class body
	public static void main(String[]args) {
		System.out.println("main method started");
		//for calling non static regular method we need to create an object
		//syntax for object creation-->classname variable name = new classname
		//variablename.methodname();
		method2 obj = new method2();
		obj.demo3();
		obj.demo4();
		
		System.out.println("main method ended");
		
	}
	public void demo3() {
		int a = 63;
		int b=56;
		int c = a*b;
		System.out.println("multiplication of a and b is-->"+c);
		
		
	}
	public void demo4() {
		System.out.println("non static regular method calling from same class");
	}

}
