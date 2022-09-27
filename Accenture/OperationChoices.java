package Accenture;

import java.util.Scanner;

public class OperationChoices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Select:"+"\n"+"1.(a+b)"+"\n"+"2.(a-b)"+"\n"+"3.(axb))"+"\n"+"4.(a/b)");
		System.out.println("Enter Choice: ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: System.out.println(a + b);
				break;
		case 2: System.out.println(a - b);
				break;
		case 3: System.out.println(a * b);
				break;
		case 4: System.out.println(a / b);
				break;
		default : System.out.println("Enter correct choice !");
		}
	}
}
