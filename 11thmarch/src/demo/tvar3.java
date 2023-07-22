package demo;

public class tvar3 {
	//variables calling from another class
	public static void main(String []args){
		//static global variables calling from diff class
		System.out.println(typesofvariables1.number);
		System.out.println(typesofvariables1.name);
		
		typesofvariables1.test();
		typesofvariables1 ref =new typesofvariables1();
		ref.test2();
		
		// non static global variables calling from diff class
		
		typesofvariables2 obj = new typesofvariables2();
		System.out.println(obj.num);
		System.out.println(obj.name);
		
		obj.test();
		obj.test2();
		}
}
