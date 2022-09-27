package String;

public class ExtractDigitsAndAlphabets {
	static String fun(String s,int x) {
		if(s.length()<1) {
			return "NULL";
		}
		if(x==0) {
			int sum=0,c=0;
			String k ="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>=48&&s.charAt(i)<=57) {
					sum+=s.charAt(i)-48;
					c=1;
				}
			}
			if(c==0) {
				return "ZERO";
			}
			else {
				return k + sum;
			}
		}
		if(x==1) {
			String k="";
			int c =0;
			for(int i=0;i<s.length();i++) {
				if((s.charAt(i)>=65&&s.charAt(i)<=90)||s.charAt(i)>=97&&s.charAt(i)<=122) {
					k+=s.charAt(i);
					c=1;
				}
			}
			if(c==0) {
				return "ZERO";
			}
			else {
				return k;
			}
		}
		return "ZERO";
	}
	public static void main(String[] args) {
		System.out.println(fun("1234", 1));
	}
}
