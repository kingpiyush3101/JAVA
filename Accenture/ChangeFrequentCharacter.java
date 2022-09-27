package Accenture;

public class ChangeFrequentCharacter {
	public static void main(String[] args) {
		String str = "bbadbbababb";
		char x = 't';
		int arr[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			arr[ch-97]++;
		}
		int max = 0;
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		String s = ""; 
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if((char)idx+97==ch) {
				s = s + x;
			}
			else {
				s = s + ch;
			}
		}
		System.out.println(s);
	}
}
