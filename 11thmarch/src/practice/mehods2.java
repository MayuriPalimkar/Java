package practice;

public class mehods2 {
	public static void main(String[] args) {
		mehods2.demo();
		mehods2 ref = new mehods2();
		ref.demo2();
		methods.demo();
		methods obj = new methods();
		obj.demo2();
		obj.demo4("Rahul", 15);
		methods.demo3("Rajat", "Sharma");
		
	}
  public static void demo() {
	  int a = 20;
	  int b = 30;
	  int add = a+b;
	  System.out.println(add);
  }
  public void demo2() {
	  String name = "ketan"; 
	  String lastname = "patil";
	  System.out.println(name + " "+lastname);
  }
}
