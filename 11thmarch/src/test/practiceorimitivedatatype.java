package test;

public class practiceorimitivedatatype {
	public static void main(String[]args) {
		/*datatype
		 * 1.Primitive datatype    2. non primitive data type
		 * 
		 * 1.primitive data type--> size of primitive data type is fixed 
		 * types--> byte short int long boolean char float double
		 * 1.byte--> 8 bit range = -128 to 127
		 * syntax -->datatype variablename = value;
		 */
		byte b1 = 127; //max limit
		byte b2 = -128;//min limit
		
		System.out.println("byte data type max limit-->" +b1);
		System.out.println("byte data type min limit-->"+b2);
		
		
		//Short-----> 2byte=16bit range = -326768 to 32767
		//Syntax--> datatype variablename = value;
		
		short s1;
		short s2;
		s1 = 32767;
		s2 = -32768;
		System.out.println("short max value is-->"+s1);
		System.out.println("short min limit is-->"+s2);
		
		
		//int = 4 byte = 32 bit range = -2147483648 to 2147483647
		//syntax --> datatype variablename= value;
		
		int i1 = 2147483647;
		int i2 = -2147483648;
		
		System.out.println("int max limit is -->"+i1);
		System.out.println("int min limit is-->"+i2);
		
		
		//long data type = 64 bit 8 byte
		long l1 = 478528896547824566l;
		long l2 = -8527418529639638525l;
		
		System.out.println("long data type value-->"+l1);
		System.out.println("long data type negative value-->"+l2);
		
		
		//boolean data type also known as conditional data type 
		//value 1 bit
		boolean b11 = true;
		boolean b12 = false;
		
		System.out.println("boolean data type-->"+b11);
		System.out.println("boolean data type-->"+b12);
		
		
		//char data type 
		
		//Syntax data type variable name = value;
        char c1 = 'f';
        char c2 = '8';
        
        System.out.println("char data type-->"+c1);
        System.out.println("char data type-->"+c2);
        
        //float data type
    // value = 4 byte = 32 bit
        float f1 = 852741963.85274196f;
		float f2 = -852741963.85207419638474f;
		
		System.out.println("float data type -->"+f1);
		System.out.println("float data type -->"+f2);
		
		//double data type 
		//value 8 bye = 64 bit
		
		double d1 = 789631458.254789668625d;
		double d2 = -8529637417963.875545577895655d;
		
		System.out.println("double data type-->"+d1);
		System.out.println("double data type-->"+d2);
				
		
	}

}
