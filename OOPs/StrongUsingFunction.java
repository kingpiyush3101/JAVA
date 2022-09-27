package OOPs;

public class StrongUsingFunction {
	int Factorial(int r){
		int f = 1;
		for(int i=r;i>0;i--) {
			f = f * i;
		}
		return f;
	}
	int Strong(int num) {
		int sum = 0;
		while(num>0) {
			int r = num%10;
			int f=Factorial(r);
			sum = sum + f;
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num = 145;
		StrongUsingFunction obj = new StrongUsingFunction();
		int ans =obj.Strong(num);
		if (num==ans) {
			System.out.println("strong");
		}
		else {
			System.out.println("not strong");
		}
	}
}
