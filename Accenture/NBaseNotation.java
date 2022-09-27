package Accenture;

public class NBaseNotation {
	public static void main(String[] args) {
		int n = 21;
		int num = 5678;
		String s ="";
		while(num!=0) {
			int r = num%n;
			if(r>9) {
				s = (char)(r+55) + s;
			}
			else {
				s = r + s;
			}
			num  = num/n;
		}
		System.out.println(s);
	}
}
