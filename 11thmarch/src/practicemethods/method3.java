package practicemethods;

public class method3 { //classbody
	public static void main(String[]args) {  //main method body
		
		//non static regular method calling from different class
		//object creation for method whichis to be called
		//classname variable name = new classname();
		nonstatic clas = new nonstatic();
		clas.demo1();
		clas.demo2();
		
		System.out.println("non static regular method calling from different class");
	}

}
