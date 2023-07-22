package practicemethods;

public class method5 {
	public static void main(String[]args) {
		System.out.println("static regular method calling from differnt class");
		//calling by classname
		method4.test();
		//object creation--> classname variable name = new classname();
		nonstatic kite = new nonstatic();
		
		//calling static regular method from different class by creating an object
		kite.demo1();
		
		
	}

}
