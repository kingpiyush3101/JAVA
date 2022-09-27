package Accenture;

public class PallindromeNumberInRange {
	static boolean pallindrome(int i) {
		String s=""+i;
		int l=0;
		int h=s.length()-1;
		while(l<=h) {
			if(s.charAt(l)!=s.charAt(h)) {
				return false;
			}
			l++;
			h--;
		}
		return true;
	}
	public static void main(String[] args) {
		int n = 100;
		int m = 150;
		for(int i=n;i<=m;i++) {
			boolean ans = pallindrome(i);
			if(ans == true) {
				System.out.print(i+" ");
			}
		}
	}
}
