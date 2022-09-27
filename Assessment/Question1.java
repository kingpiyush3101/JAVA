package Assessment;
import java.lang.*;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amt: ");
		float p = sc.nextFloat();
		System.out.print("Enter Time Period: ");
		float t = sc.nextFloat();
		float a,r=0;
		if(0.00<=p&&p<1000.00) {
			r = (float) 2.5;
		}
		if(1000.00<=p&&p<10000.00) {
			r = (float) 2.0;
		}
		if(10000.00<=p&&p<100000.00) {
			r = (float) 1.5;
		}
		if(100000.00<=p) {
			r = (float) 1.0;
		}
		a = (float) (p *(1.0+r*t));
		System.out.println("Amount : "+a);
		//t2543383
	}
}
