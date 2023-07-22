package demo;

public class program7 {
	//write a program to call static and non static regular methods
	public static void main(String [] args) {
		program7.test();
		program7 ref = new program7();
		ref.test2();
		program7.test3("ketan", "patil");
		ref.test4(15);
		
	}
	public static void test() {
		int i = 50;
		int j = 50;
		int k = i*j;
		System.out.println(k);
		
	}
	public void test2() {
		int a = 85;
		int b= 58;
		int c = a+b;
		System.out.println(c);
	}
	public static void test3 (String firstname , String lastname) {
		System.out.println(firstname+ " "+lastname);
		
	}
	public void test4(int rollno) {
		System.out.println(rollno);
	}

}
