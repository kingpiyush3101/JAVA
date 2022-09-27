package OOPs;

public class PowerUsingFunction {
	int Power(int a,int b) {
		int p = 1,i;
		for(i=0;i<b;i++) {
			p=a*p;
		}
		return p;
		
	}
	public static void main(String[] args) {
		int a=2;
		PowerUsingFunction obj = new PowerUsingFunction();
		int i,sum=0;
		for(i=1;i<=5;i++) {
			int ans=obj.Power(a,i);
			//x^1 + x^2 + x^3 + x^4 + x^5
			sum = sum + ans;
		}
		
		System.out.println(a+"^1 + "+a+"^2 + "+a+"^3 + "+a+"^4 + "+a+"^5 : "+sum);
	}
}
