package String;

import java.util.Arrays;

public class StringConcatenation {
	static String fun(String a,String b) {
		if(a.length()<1||b.length()<1) {
			return null;
		}
		String k ="";
		String c = a+b;
		c = c.replaceAll(" ", "");
		char arr[] = c.toCharArray();
		Arrays.sort(arr);
		int i;
		for(i =0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				k =  arr[i]+ k ;
			}
		}
		return (arr[i]+k);
		
	}
	public static void main(String[] args) {
		String a = "fruits";
		String b = "are good";
		System.out.println(fun(a, b));
		
	}
}
