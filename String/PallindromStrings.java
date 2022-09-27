package String;

public class PallindromStrings {
	static int PallindromeCheck(String str) {
		String s = "";
		str = str.toLowerCase();
		for(int i =0;i<str.length();i++) {
			s = str.charAt(i) + s;
		}
		if (s.equals(str)) {
			return 1;
		}
		return 0;
	}
	
//	boolean pallindrome(String s) {
//		int l=0;
//		int h=s.length()-1;
//		while(l<=h) {
//			if(s.charAt(l)==s.charAt(h)) {
//				l++;
//				h--;
//			}
//			else {
//				return false;
//			}
//		}
//		return true;
//	}
	
	static int  CountPallindrome(String str) {
		int count = 0;
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			int c =PallindromeCheck(arr[i]);
			count = count + c;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "my Mom and daD are my best friend";
		System.out.println(CountPallindrome(str));
		
	}
}
