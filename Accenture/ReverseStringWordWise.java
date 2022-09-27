package Accenture;

public class ReverseStringWordWise {
	public static void main(String[] args) {
		String str = "Hello How Are You!";
				//    You Are How Hello
		String s[] = str.split(" ");
		String ans="";
		for(int i=s.length-1;i>=0;i--) {
			ans = ans + s[i] + " ";
		}
		System.out.println(ans.trim());
	}
}
