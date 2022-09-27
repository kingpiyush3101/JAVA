package ExceptionHandling;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("c = "+c);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Thanks");
	}
}