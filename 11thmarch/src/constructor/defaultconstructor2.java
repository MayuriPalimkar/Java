package constructor;

public class defaultconstructor2 {

	public static void main(String [] args) {
		defaultconstructor2 ref = new defaultconstructor2();
		ref.m1();
		ref.m2(12, 12);
	}
	
	public void m1() {
		System.out.println("default constructor");
	}
	
	public void m2(int i, int j) {
		int add = i+j;
		System.out.println(add);
	}
}
