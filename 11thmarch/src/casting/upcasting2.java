package casting;

public class upcasting2 extends upcasting1{

	public void demo3() {
		System.out.println("demo3 method");
		System.out.println();
	}
	
	

   public static void main(String [] args) {
	   
	   upcasting2 c2 = new upcasting2();     //static binding /early binding/ ctp
	   c2.demo1();     
	   c2.demo2();
	   c2.demo3();
	   
	   //upcasting
	   upcasting1 c1 =new upcasting2();     //dynamic binding/ late binding/ rtp
	   c1.demo1();
	   c1.demo2();
	   
	   //downcasting
	   upcasting2 c3 = (upcasting2) new  upcasting1(); //classcastexception
	   
	   c3.demo1();
	   c3.demo2();
	   c3.demo3();
	   
	   
	   
	   
   }
}