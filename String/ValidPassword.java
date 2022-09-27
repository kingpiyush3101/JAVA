package String;

import java.util.Scanner;

public class ValidPassword {
	static int u=0,l=0,d=0,sch=0,k=0;
	static boolean check(String str) {
		if(str.length()<8||str.length()>=15) {
			k=1;
			return false;
		}
		if(true) {
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch==32) {
					return false;
				}
				if(ch>=48&&ch<=57) {
					d++;
				}
				if(ch>=65&&ch<=90) {
					u++;
				}
				if(ch>=97&&ch<=122) {
					l++;
				}
				if((ch>=33&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=126)) {
					sch++;
				}
			}
		}
		if(d>=1&&u>=1&&l>=1&&sch>=1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String str = sc.next();
		boolean ans = check(str);
		if (ans == true) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
			if(k==1) {
				System.out.println("! length shoulb be between 8 to 15");
			}
			else {
				if(d<1) {
					System.out.println("! digit missing");
				}
				if(u<1) {
					System.out.println("! upper case alphabet missing");
				}
				if(l<1) {
					System.out.println("! lower case alphabet missing");
				}
				if(sch<1) {
					System.out.println("! special character missing");
				}
			}
		}
	}
}
