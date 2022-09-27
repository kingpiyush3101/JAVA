package OOPs;

import java.util.Scanner;

public class BinarytoDecimalUsingFunction {
	
	int power(int i) {
		int p = 1;
		if(i==0) {
			return 1;
		}
		else {
			for(int j=0;j<i;j++) {
				p = 2 * p;
			}
			return p;
		}
	}
	
	int binarytodecimal(int num) {
		int sum=0,i=0;
		while(num>0) {
			int r = num%10;
			//sum = sum + (int)Math.pow(2,i)*r;
			sum = sum + power(i);
			num = num/10;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BinarytoDecimalUsingFunction obj = new BinarytoDecimalUsingFunction();
		System.out.println(obj.binarytodecimal(num));
	}
}
