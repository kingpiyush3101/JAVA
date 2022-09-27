package loops;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. to Check : ");
		int num = sc.nextInt();
		int sum=0,count=0;
		int x = num;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println("No. of Digits : "+count);
		num = x;
		while(num>0) {
			int r = num%10;
			num = num/10;
			sum = sum + (int)Math.pow(r, count);
		} 
		if (x == sum) {
			System.out.println(x + " is Armstrong No.");
		}
		else {
			System.out.println(x + " is not Armstrong No.");
		}
	}
}
