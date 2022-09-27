package Accenture;

public class DifferenceOfSum {
	public static void main(String[] args) {
		int m =3;
		int n = 10;
		int div=0;
		int ndiv=0;
		for(int i=1;i<=n;i++) {
			if(i%m==0) {
				div+=i;
			}
			else {
				ndiv+=i;
			}
		}
		System.out.println(ndiv-div);
	}
}
