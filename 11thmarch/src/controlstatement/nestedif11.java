package controlstatement;

public class nestedif11 {
	public static void main(String[] args) {
		int a =500;
		int b = 400;
		int c= 1000;
		
		if (a>b) {
			if (a>c) {
				System.out.println("a is the greatest number");
			}
		}
		if (b>c) {
			System.out.println("b is the greatest number");
		}
		else {
			System.out.println("c is the greatest number");
		}
	}

}
