package demo;

public class operators {
	public static void main(String [] args) {
		// arithmetic operators
		int j =55;
		int k = 65;
		
		int i = j+k;
		int l = j-k;
		int m = j*k;
		int n = j/k;
		int o = j%k;
		
		System.out.println(i + " "+l+" "+m+" "+n+" "+o);
		
		//Assign operators
		int a= 22;
		a++;
		System.out.println(a);
		
		int b = 22;
		b--;
		System.out.println(b);
		
		//relational operators
		int p = 50;
		int q = 60;
		System.out.println(p> q);  //false
		System.out.println(p< q);//true
		System.out.println(p != q); //true
		
		//logical operators
		boolean c = true;
		boolean d = false;
		
		System.out.println(c && d);
		System.out.println(c || d);
		
	}

}
