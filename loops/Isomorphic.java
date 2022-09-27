package loops;

import java.util.Scanner;

public class Isomorphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. to Check : ");
		int num = sc.nextInt();
		int count=0;
		int sq = num *num;
		int x =num;
		while(num>0) {
			count++;
			num=num/10;
		}
		int p = (int)Math.pow(10, count);
		int last = sq%p;
		if (last == x) {
			System.out.println(x + " is Isomorphic No.");
		}
		else {
			System.out.println(x + " is not Isomorphic No.");
		}
	}
}
