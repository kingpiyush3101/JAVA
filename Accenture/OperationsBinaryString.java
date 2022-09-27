package Accenture;

public class OperationsBinaryString {
	public static void main(String[] args) {
		String str = "1C0C1C1A0B1";
		if(str.length()<0) {
			System.out.println(-1);
			System.exit(0);
		}
		int sum=str.charAt(0)-'0';
		for(int i=1;i<str.length()-1;i+=2) {
			char ch =str.charAt(i);
			if(ch=='A') {
				sum = sum & (str.charAt(i+1)-'0');
			}
			if(ch=='B') {
				sum = sum | (str.charAt(i+1)-'0'); 
			}
			if(ch=='C') {
				sum = sum ^ (str.charAt(i+1)-'0');
			}
		}
		System.out.println(sum);
	}
}
