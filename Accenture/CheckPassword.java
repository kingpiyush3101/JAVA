package Accenture;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.length()<4) {
			System.out.println(0);
		}
		if(str.charAt(0)>=48&&str.charAt(0)<=57) {
			System.out.println(0);
		}
		else {
			int d=0;int a=0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch==' '||ch=='/') {
					System.out.println(0);
					break;
				}
				else if(ch>=48&&ch<=57) {
					d++;
				}
				else if(ch>=65&&ch<=90) {
					a++;
				}
			}
			if(a!=0||d!=0) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
