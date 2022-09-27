package Accenture;

public class SumofNoBetweenRange {
	public static void main(String[] args) {
		int m = 100;
		int n = 160;
		int sum=0;
		for(int i=m;i<n;i++) {
			if(i%3==0) {
				if(i%5==0) {
					sum+=i;
				}
			}
		}//105 120 135 150
		System.out.println(sum);
	}
}
