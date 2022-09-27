package loops;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		
//		System.out.println("Tables:");
//		for(int num =1;num<=5;num++) {
//			for(int i =1;i<=10;i++) {
//				System.out.println(num * i+ " ");
//			}
//			System.out.println();
//		}
		
//		System.out.println("Factorial:");
//		for(int num = 3;num<=7;num++) {
//			int f =1;
//			for(int i =num;i>0;i--) {
//				f =f *i;
//			}
//			System.out.println(f);
//		}
		
//		System.out.println("First 10 Prime: ");
//		int num=2; //Initialization
//		int count=0,i;
//		for( ; ; ) {  //infinite run
//			for(i=2;i<num;i++) {
//				if(num%i==0) {
//						break;
//					}
//				}
//			if(i==num) {
//				System.out.println(num);
//				count++;
//			}
//			if(count==10) {
//				break;    //condition to terminate
//			}
//			num++;  //increment
//		}
		
//		System.out.println("10 to 1000 all Palindrome No. : ");
//		for(int i=10;i<=1000;i++) {
//			int sum=0;
//			int num = i;
//			while(num>0) {
//				int r = num%10;
//				sum = sum *10 + r;
//				num=num/10;
//			}
//			if(i==sum) {
//				System.out.println(sum);
//			}
//		}
	
		
		System.out.println("first 20 Armstrong No. :");
		int c=0;
		for(int num=1; ;num++) {
			int sum=0,count=0;
			int x = num;
			while(num>0) {
				count++;
				num=num/10;
			}
			num = x;
			while(num>0) {
				int r = num%10;
				num = num/10;
				sum = sum + (int)Math.pow(r, count);
			} 
			if (x == sum) {
				System.out.println(x);
				c++;
			}
			num=x;
			if(c==20) {
				break;
			}
		}
		
		
	}
}