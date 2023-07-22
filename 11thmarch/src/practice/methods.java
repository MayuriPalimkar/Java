package practice;

public class methods {
  public static void main(String [] args) {
	  methods.demo(); //calling static regular method
	  methods ref = new methods();
	  ref.demo2();
	  methods.demo3("ketan", "patil");
	  ref.demo4("Rahul", 15);
  }
  public static void demo() {
	  int a= 30;
	  int b= 20;
	  int c = a+b;
	  System.out.println(c);
	  
  }
  public void demo2() {
	  int a= 50;
	  int b= 30;
	  int c= a*b;
	  System.out.println("multiplication of a and b is-->"+c);
  }
  public static void demo3(String name, String lastname ) {
	  System.out.println(name+" " +lastname);
  }
  public void demo4(String studentname, int Rollno) {
	  System.out.println(studentname +" "+ Rollno);
  }
}
