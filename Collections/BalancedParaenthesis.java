package Collections;

import java.util.*;

public class BalancedParaenthesis {
	static int balancedString(String str) {
		Stack<Character> s = new Stack<>();
		int n=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='('||ch=='{'||ch=='['||ch==')'||ch=='}'||ch==']') {
				n=i;
				if(ch=='('||ch=='{'||ch=='[') {
					s.push(ch);
				}
				else if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')) {
					s.pop();
				}
				else {
					return n;
				}
			}
		}
		if(s.isEmpty()) {
			return -1;
		}
		else {
			return n;
		}
	}
	public static void main(String[] args) {
		System.out.println(balancedString("for(i=0;i<a(3};i++){foo{);)")); 
	}
}
