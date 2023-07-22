package demo;

public class controlflowstatements {
  public static void main(String[] args) {
	
	  int marks =60;
	  if (marks>=35) {
		  System.out.println("pass");
	  }
	  controlflowstatements.test();
	  controlflowstatements ref = new controlflowstatements();
	  ref.test2();
	  ref.test3();
	  
}
  public static void test() {
	  int marks = 60;
	  if(marks<= 35) {
		  System.out.println("fail");
	  }
	  else {
		  System.out.println("pass");
	  }
  }
  public void test2() {
	  int marks = 60;
	  if (marks>=75) {
		  System.out.println("distinction");
	  }
	  else if (marks>= 70) {
		  System.out.println("first class");
		  
	  }
	  else if (marks>= 60) {
		  System.out.println("higher second class");
	  }
	  else if (marks>=50) {
		  System.out.println("second class");
	  }
	  else if (marks>=35) {
		  System.out.println("pass");
		  
	  }
	  else {
		  System.out.println("fail");
	  }
  }
   public void test3() {
	   String Un = "abc";
	   String psw = "xyz@";
	   
	   if(Un == "abc") {
		   System.out.println("correct un");
	   }
	   if(psw == "xyz@") {
		   System.out.println("correct psw");
		   System.out.println("login successful");
	   }
	     else  {
		   System.out.println("wrong password");
		   System.out.println("login failed");

	   }
  
	   
   }
}
