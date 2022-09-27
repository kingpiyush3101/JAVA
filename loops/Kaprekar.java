package loops;

import java.util.Scanner;

public class Kaprekar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. :");
		int num  = sc.nextInt();
		int r=0,sum=0,count=0;
		int x =num;
		int sq = num*num;
		while(num>0) {
			count++;
			num=num/10;
		}
		int p = (int)Math.pow(10,count);
		while(sq>0) {
			r = sq%p;
			sq = sq/p;
			sum = sum +r;
		}
		if (x==sum) {
			System.out.println(x +" is Kaprekar.");
		}
		else {
			System.out.println(x +" is not Kaprekar.");
		}
	}
}
