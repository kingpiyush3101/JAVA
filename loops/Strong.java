package loops;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. : ");
		int num = sc.nextInt();
		int x = num;
		int sum=0;
		while(num!=0) {
			int r=num%10;
			int f=1;
			for(int i =r;i>0;i--) {
				f = f * i;
			}
			sum = sum + f;
			num=num/10;
		}
		System.out.println("Sum of Fatorial of all digits : "+sum);
		if (x == sum) {
			System.out.println(x+" is Strong No.");
		}
		else {
			System.out.println(x+" is not Strong No.");
		}
	}
}
