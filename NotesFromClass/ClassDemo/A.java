public class A {
	
	private int size;
	private String name;
	
	// Good for BankAccount
	private static final String routingNumber = "123456778";
	
	private static String test;
	
	
	// =========== CONSTRUCTORS ===========
	public A() {
		System.out.println("DEFAULT constructor called");
		size = 0;
		name = "";
	}
	
	public A(int s) {
		System.out.println("SIZE constructor called");
		size = s;
		name = "";
	}
	
	public A(int s, String name) {
		System.out.println("DOUBLE PARAMETER constructor called");
		size = s;
		this.name = name;
	}	

	public A(String name, int s) {
		System.out.println("DOUBLE PARAMETER 2 constructor called");
		size = s;
		this.name = name;
	}		
	
	
	
	
	
	// =========== ACCESSORS && MUTATORS (Getters/Setters) ===========
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}	
	
	// Demonstrated how static variables work
	public void setTest(String text) {
		test = text;
	}
	
	
	
	// =========== METHODS
	
	public void doSomething() {
		System.out.println("Doing something");
		size *= 3;
		System.out.println("Done");
	}
	
	// OVERLOADING the doSomething() method
	public void doSomething(int num) {
		System.out.println("Doing something 2");
		size *= num;
		System.out.println("Done 2");
	}

	// OVERLOADING the doSomething() method AGAIN
	public void doSomething(double num) {
		System.out.println("Doing something 3");
		size *= num;
		System.out.println("Done 3");
	}	
	
	// OVERRIDING the toString() method from Object
	public String toString() {
//		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		return "\n\nThe class A is named " + name + ", the size is " + size + " and the value of 'test' is " + test + ".";
	}
	
}
