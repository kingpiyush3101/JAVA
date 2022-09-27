package OOPs;

public class ArmstrongUsingFunction {
	int Digit(int num) {
		int count = 0;
		while(num>0) {
			int r = num%10;
			count ++;
			num = num/10;
		}
		return count;
	}
	
	int Power(int r,int count) {
		int p=1;
		for(int i=0;i<count;i++) {
			p = p * r;
		}
		return p;
	}
	
	int Armstrong(int num){
		int count = Digit(num);
		int sum=0;
		while(num>0) {
			int r = num%10;
			sum = sum + Power(r,count);
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num = 153;
		ArmstrongUsingFunction obj = new ArmstrongUsingFunction();
		for(int i = 1;i<=10000;i++) {
			int ans=obj.Armstrong(i);
			if (ans == i) {
				System.out.println(i);
			}
		}
		
	}
}
