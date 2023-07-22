package constructor;

public class rule55 {
	public static void main(String [] args) {
		rule55 ref = new rule55();
		rule55 ref1 = new rule55(5);
		rule55 ref2 = new rule55(5,10);
		rule55 ref3 = new rule55(2,5,10);
	}
	public rule55() {
		System.out.println("zero input parameter constructor");
	}
	public rule55(int i ) {
		System.out.println("one input parameter constructor");
	}
	public rule55(int i, int j) {
		System.out.println("two input parameter constructor");
	}
	public rule55(int i, int j, int k) {
		System.out.println("three input parameter constructor");
	}

}
