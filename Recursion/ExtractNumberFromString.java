package Recursion;

public class ExtractNumberFromString {
	static int sum = 0;
	static int Extract(String str) {
		int i=str.length()-1;
		if(str.length()==0) {
			return 0;
		}
		else {
			if(str.charAt(i)>=48&&str.charAt(i)<=57) {
				sum = sum*10 + (str.charAt(i)-48);
			}
			Extract(str.substring(0,i));
		}
		return sum;
	}
	public static void main(String[] args) {
		String str = "fg1fg2fg3fg@4 "; 
		int ans =Extract(str);
		System.out.println(ans);
	}
}
