package logical_programs;

public class revString {
	
	public static void main(String[] args) {
		String str = "hello good evening";
		
		String [] word = str.split(" ");
		
		String RevS = "";
		
		for (String w : word) {
			String stringword = "";
			
			for (int i =w.length()-1; i>=0; i--) {
				stringword = stringword + w.charAt(i);
			}
			RevS = RevS + stringword+" ";
		}
		System.out.println(RevS);
		
		
		//String str = "good morning";
		
		//String [] word = str.split(" ");
		
	}

}
