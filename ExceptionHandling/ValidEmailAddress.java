package ExceptionHandling;

import java.util.Scanner;

public class ValidEmailAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try {
			if(!str.contains("@")){
				throw new Exception("Invalid");
			}
			else if(!str.contains(".")) {
				throw new Exception("Invalid");
			}
			else {
				int i,j;
				int count=0;
				for(i=0;i<str.length();i++) {
					if(str.charAt(i)=='@') {
			           break;
					}
				}
				for(j=i+1;j<str.length();j++) {
					if(str.charAt(j)=='.') {
						count=1;
						break;
					}
				}
				if(count==0) {
					throw new Exception("Invalid");
				}
				System.out.println("Valid");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
