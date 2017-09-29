
public class HelloExceptions {

	public static void main(String[] args) {
		int a = 10, b = 6, c;

		// a = b / 0;
		System.out.println("in main");
		foo();
		System.out.println("didn't get here");

	}

	private static void foo() {
		System.out.println("In foo");
		
		try{
			foo2();
		} catch (ArithmeticException ae){
			System.out.println("Dealing with a problem!");
		} catch (Exception e){
			System.out.println("Another problem???");
		}
		
		System.out.println("didn't get here");
	}

	private static void foo2() {
		int e = 45;
		System.out.println("in foo2");
		
			e = 1 / 0;
		
		System.out.println("didn't get here");
	}

}
