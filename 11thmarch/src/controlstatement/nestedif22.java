package controlstatement;

public class nestedif22 {

	public static void main(String[] args) {
		int age =28;
		int weight = 35;
		
		if (age>=18) {
			if(weight>=50) {
				System.out.println("you are eligible for blood donation");
			}
		}
		else if(weight <50) {
			System.out.println("you are not eligible for blood donation");
		}
		else {
			System.out.println("weight must be greater than 50");
		}
	}
}
