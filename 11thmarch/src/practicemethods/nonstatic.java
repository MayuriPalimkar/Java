package practicemethods;

public class nonstatic { //class body
	public static void main(String[]args){ //main method body
		//non static regular method calling from same class
		System.out.println("main method started");
		//to call non static regular method we need to create object
		//syntax--> classname variablename = new classname();
		nonstatic obj = new nonstatic();
		
		//Syntax for calling non static regular method by classname
		//variablename.methodname();
		obj.demo1();
		obj.demo2();
		
		System.out.println("main method ended");
		
		
	}
	public void demo1() { //regular method body non static
		//declaration
		String Studentname;
		String Surname;
		int rollno;
		
		//assigning values
		Studentname = "Mayuri";
		Surname = "vijay";
		rollno = 15;
		
		//usages
		System.out.println("Student Name is-->"+Studentname);
		System.out.println("Student Surname is-->"+Surname);
		System.out.println("Student Roll No. is-->"+rollno);
		
	}
	public void demo2(){
		System.out.println("non static regular method calling from same class ");
	}

}
