package finalFinallyFinalised;

public class final1 {

	public static void main(String[] args) {
		//variable
		/*final is the keyword and access modifier which is used to restriction on class variables and method
		 * 1. final class cannot inherited to child class
		 * 2.final method means it cannot be overridden by subclass
		 * 3.once we declare as a final variable we cannot modify it.
		 */
		
		
		
		
		int number = 50;
		
		System.out.println(number);//50
		
		number = 100;
		System.out.println(number);//100
		
		final int number1 = 10;
		System.out.println(number1);
		
		//number1 = 20;
		

	}
	public final void test() {
		System.out.println("Hello");
	}

}
