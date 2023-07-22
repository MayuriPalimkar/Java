package controlstatement;

public class leapyear1 {
	public static void main(String[] args) {
		
		int year = 2008;
		
		if (year%4==0) {
			if (year % 400==0) {
				System.out.println("this is the leap year");
			}
			
		}
		else if(year % 100 != 0) {
			System.out.println("this is not the leap yeaar");
		}
		else {
			System.out.println("loop completed");
		}
	}

}
