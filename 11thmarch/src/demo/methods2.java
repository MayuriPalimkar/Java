package demo;

public class methods2 {
 public static void main(String [] args) {
	 methods.test1();
	 
	 methods ref = new methods();
	 ref.test2();
	 
	 methods.test3(9890, "vijay");
	 System.out.println("static and non static regular methods call from another class");
 }
}
