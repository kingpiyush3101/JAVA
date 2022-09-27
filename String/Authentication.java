package String;

import java.util.Scanner;

public class Authentication {
	public static boolean authentication(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String user = sc.next();
		System.out.println("Enter Password:");
		String pass = sc.next();
		if(user.equals("uit")&& pass.equals("abc")) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		if(authentication()==false) {
			System.out.println("Invalid Username and Password");
			System.exit(0);
		}
		else {
			System.out.println("Login Sucessful");
		}
	}
}
