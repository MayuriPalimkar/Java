package constructor;

public class constructor1 {

	public static void main(String [] args) {
		int i =10;
		int j = 20;
		int k = i+j;
		System.out.println("addition is -"+k);
		constructor1 obj = new constructor1();
		obj.test();
		
	}
	public void test() {
		System.out.println("addition");
	}
	
}
