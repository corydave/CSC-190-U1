import java.util.ArrayList;


public class ClassDemo {

	public static void main(String[] args) {
		
		System.out.println("START");
		System.out.println();
		
		ArrayList<A> testList = new ArrayList<A>();
		
		A a = new A(4);
		testList.add(a);
		
		
//		System.out.println(a.toString());
//		System.out.println(a.getClass());
		
//		System.out.println(a.size);
		a.doSomething();
//		System.out.println(a.size);
		
		A a2 = new A(2, "Katie");
		testList.add(a2);
		
		A a3 = new A(5, "Dave");
		testList.add(a3);
		
		System.out.println(a3);
		
		System.out.println(testList);
		
//		System.out.println(a3.name);
//		a3.name = "John";
//		System.out.println(a3.name);
		
		System.out.println(a3.getName());
		a3.setName("John");
		System.out.println(a3.getName());
		
		a3.setTest("BLERGH");
		System.out.println("---------------");
		System.out.println(testList);
		System.out.println("---------------");
		
		System.out.println();
		
		System.out.println(a3);
		a3.doSomething(6);
		System.out.println(a3);

		System.out.println();
		
		System.out.println(a3);
		a3.doSomething(6.1);
		System.out.println(a3);
		
		System.out.println(testList);
		
		System.out.println();
		System.out.println("GAME OVER MAN!");

	}

}

