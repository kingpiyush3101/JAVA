package Accenture;

public class AdamCharity {
	static int power(int num) {
		int p=1;
		for(int i=1;i<=2;i++) {
			p = p * num;
		}
		return p;
	}
	public static void main(String[] args) {
		int n = 3;
		int sum = 0;
		for(int i=1;i<=n;i++) {
			//sum = sum + (int)Math.pow(i,2);
			sum = sum + power(i);
		}
		System.out.println(sum);
	}
}
