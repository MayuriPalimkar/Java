package abstraction;

public class abstractsubclass extends abstractclassconstructor {
	
	public abstractsubclass() {
      super();
		System.out.println("Abstract sub class");
		
	}
	public static void main(String [] args) {
		
		abstractsubclass as = new abstractsubclass();
		
	}
      
//}
//We create a class that must be derived from this abstract class as named "AbstractSubclass". Inside 
		//AbstractSubclass class we are going to define a constructor and inside the method call the parent class constructor
		//by using the super keyword and define the abstract method of its parent class in it.

		//super();
		
		//System.out.println("Sub Class Constructor:");
	}

	//public static void main(String[] args) {
		
	//	AbstractSubClass AB1 = new AbstractSubClass();
		//AbstractClassConstrctor AC = new AbstractClassConstrctor();
		
//	}

//}
	/*How to call abstract class constructor?
	
	Constructor is always called by its class name in a class itself. A constructor is used to initialize an object
	not to build the object. As we all know abstract classes also do have a constructor. So if we do not define any 
	constructor inside the abstract class then JVM (Java Virtual Machine) will give a default constructor to the 
	abstract class. If we want to know how to define user define constructors like constructors with argument or 
	any kind of constructor inside the abstract class then you should follow the given procedure.
	
	
	If you define your own constructor with arguments inside an abstract class but forget to call your own
	constructor inside its derived class constructor then JVM will call the constructor by default.
	So if you define your single or multi-argument constructor inside the abstract class then make sure to 
	call the constructor inside the derived class constructor with the super keyword.
	Implementation: Here in this program, we are going to multiply two numbers by using the following above 
	approach as mentioned.
	
	Step 1: We create an abstract class named "AbstractConstrutor" and define a user define a constructor with
	zero input parameter and one is private user define constructor with one input parameter.
	
	Step 2: We create a class that must be derived from this abstract class as named "AbstractSubclass". Inside 
	AbstractSubclass class we are going to define a constructor and inside the method call the parent class constructor
	by using the super keyword and define the abstract method of its parent class in it.
	
	Step 3: Now in the main method where we will create an object 
	of "AbstractSubclass".*/