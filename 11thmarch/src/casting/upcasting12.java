package casting;

public class upcasting12  extends upcasting11 {

	public void demo3() {
		System.out.println("demo3 method");
		System.out.println();
	}
	
	public static void main(String [] args) {
		
		upcasting12 c1 = new upcasting12();  //static binding /early binding / ctp
		c1.demo1();
		c1.demo2();
		c1.demo3();
		
		
		//upcasting 
		
		upcasting11 c2=new upcasting12();  //dynamic binding /late binding/ rtp
		c2.demo1();
		c2.demo2();
		
		//downcasting
		
		
		upcasting12 c3=  (upcasting12) new upcasting11();  //classcastexception
		c3.demo1();
		c3.demo2();
		c3.demo3();
		
		
	}
}
