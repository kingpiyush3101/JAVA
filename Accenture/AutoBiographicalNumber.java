package Accenture;

import java.util.HashSet;
import java.util.Set;

public class AutoBiographicalNumber {
	//It is a no. such that 1st digit counts how many zeroes are there in it,
	//the 2nd digit counts how many ones are there and so on.
	//1210 ---> 1 zero , 2 ones , 1 twos and 0 threes.
	public static void main(String[] args) {
		 String str = "12610";
		 int sum=0;
		 Set<Character> st = new HashSet<>();
		 for(int i=0;i<str.length();i++) {
			 sum = sum + (str.charAt(i)-48);
			 st.add(str.charAt(i));
		 }
		 if(sum!=str.length()) {
			 System.out.println(0);
		 }
		 System.out.println(st);
		 System.out.println(st.size());
	}
}
