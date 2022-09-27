package Accenture;

public class MoveHypens {
	public static void main(String[] args) {
		String str = "ab-cd-ef";
//		String s[]=str.split("-");
//		int n = s.length;
//		String h = "-";
//		String ans="";
//		for(int i=0;i<n;i++) {
//			ans=ans+s[i];
//		}
//		ans = h.repeat(n-1)+ ans; 
//		System.out.println(ans);
		
		int count=0;
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='-') {
				count++;
			}
			else {
				ans+=str.charAt(i);
			}
		}
		ans =("-".repeat(count)) + ans;
		System.out.println(ans);
		
	}
}
