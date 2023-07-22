package demo;

public class forloops {
	//WAP to print 10 to 0 numbers
	public static void main(String[] args) {
		int i ;
		//for(initialization; condition; inc/dec)
		
		for (i=10; i>=0; i--) {
			System.out.println(i);
		}
		forloops.test();
		forloops.test2();
		forloops ref = new forloops();
		ref.test3();
		ref.test4();
				
	}
		//wap to print 10 to 0 even numbers
		public static void test() {
			int i = 10;
			System.out.println("even numbers");
			for(i=10; i>=0; i=i-2) {
				
				System.out.println(i);
				System.out.println();
			}
		}
		public static void test2() {
			//wap to print 10 to 0 odd numbers
			int i;
			System.out.println("odd numbers");
			for (i=11; i>=1; i=i-2) {
				
				System.out.println(i);
				System.out.println();
			}
			
		}
		public void test3() {
			//wap to print 1 to 10 even numbers
			int i;
			System.out.println("even numbers");
			for (i=0; i<=10; i=i+2) {
				
				System.out.println(i);
				System.out.println();
			}
		}
		public void test4() {
			//wap to print 1 to 10 odd numbers
			int i;
			System.out.println("odd numbers");
			for (i=1; i<=10; i=i+2) {
				
				System.out.println(i);
				
			}
		}
		
	}


