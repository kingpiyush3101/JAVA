package ExceptionHandling;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = 1000;
			int b = sc.nextInt();
			if(b>a) {
				throw new Exception("insufficient balance");
			}
			System.out.println("balance:"+(a-b));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
