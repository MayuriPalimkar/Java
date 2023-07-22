package demo;

public class typesofvariables1 {
	//static global variables call frm same class
	static int number = 100;
	static String name = "Rahul";
	public static void main(String [] args) {
		
		System.out.print(typesofvariables1.number);
		System.out.println(typesofvariables1.name);
		
		typesofvariables1.test();
		typesofvariables1 ref = new typesofvariables1();
		ref.test2();
	}
	public static void test() {
		number = 200;
		name = "Rohit";
		System.out.print(number);
		System.out.println(name);
	}
	public void test2() {
		number = 300;
		name = "Rakesh";
		System.out.print(number);
		System.out.println(name);
	}

}
