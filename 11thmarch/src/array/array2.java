package array;

public class array2 {
	public static void main(String[] args) {
		int arr[] = new int[10];    //array declaration
		
		arr[0]= 10;
		arr[1] = 20;
		arr[2]  =30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
		arr[9] = 100;
		//arr[10] = 41;    arrayoutofboundexception
		
		System.out.println(arr.length);
		System.out.println();
		
	/*	for(int i=0; i<arr.length; i++) {
			System.out.println("index of 2="+arr[i]);
		} */
		
		System.out.println(arr[2]);
		
		
 		
		
	}

}
