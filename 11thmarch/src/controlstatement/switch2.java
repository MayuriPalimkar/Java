package controlstatement;

public class switch2 {
	public static void main(String [] args) {
		char letter = 'M';
		
		switch(letter) {
		case 'A':
			System.out.println("leeter matched is A");
			break;
		case'M':
			System.out.println("letter matched is M");
			break;
		case 'P':
			System.out.println(("letter matched is P"));
			break;
		case 'm':
			System.out.println("lettr matched is m");
			break;
		default:
			System.out.println("no match found");
		}
	}

}
