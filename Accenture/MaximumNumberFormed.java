package Accenture;

import java.util.Arrays;

public class MaximumNumberFormed {
	public static void main(String[] args) {
		int arr[]= {34,79,58,64};
		String s = "";
		for(int i=0;i<arr.length;i++) {
			s = s + arr[i];
		}
		char c[]=s.toCharArray();
		Arrays.sort(c);
		s = "";
		for(int i=0;i<c.length;i++) {
			s = c[i] + s;
		}
		System.out.println(s);
	}
}
