package practicemethods;

public class method7 {//class body
	public static void main(String[]args) {
		//static regular method with parameters
		System.out.println("main method started");
		method7.demo("mayuri", "Handre");
		method7.demo1(15.3f, "programming");
		
		method7.demo("Vijay","Handre");
		method7.demo1(17.3f, "driving");
		
		method7.demo("viransh", "Handre");
		method7.demo1(20.11f, "playing");
		
		method7.demo2();
		System.out.println("main method ended");
	}
 public static void demo(String firstname, String lastname) {
	 System.out.println("Firstname is-->"+firstname +" "+ "lastname is-->"+lastname);
 }
 public static void demo1(float dob, String hobby) {
	 System.out.println("dob is-->"+dob +" "+ "hobby is-->"+hobby );
 }

public static void demo2() {
	System.out.println("static regular method with parameter");
}
}