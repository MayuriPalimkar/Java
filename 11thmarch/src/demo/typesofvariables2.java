package demo;

public class typesofvariables2 {
//non static global variables calling from same class
	int num = 100;
	String name = "Rahul";
	
	public static void main(String[] args) {
		
		//to call non static global variable we need to create an object
		typesofvariables2 ref = new typesofvariables2();
		System.out.println(ref.num);
		System.out.println(ref.name);
		
		ref.test();
		ref.test2();
	}
	public void test() {
		num = 200;
		name = "Rohit";
		System.out.println(num);
		System.out.println(name);
		
	}
	public void test2() {
		num = 300;
		name = "Rakesh";
		System.out.println(num);
		System.out.println(name);
	}
}
