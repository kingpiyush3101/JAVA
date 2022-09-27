package ExceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("c = "+c);
			int arr[]= {11,2,33,44};
			System.out.println(arr[4]);
		}
		//in multiple catch we have to define what type of exception it should catch
		//only first exception occurred will be catched 
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Thanks");
	}
}
