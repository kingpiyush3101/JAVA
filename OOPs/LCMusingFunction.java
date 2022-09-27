package OOPs;

import java.util.Scanner;

public class LCMusingFunction {
	static int lcm(int max,int min) {
		for(int i=2;i<=max;i++) {
			if(i%max==0 && i%min==0) {
				return i;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int l;
		if(a>b) {
			l = lcm(a,b);
		}
		else {
			l = lcm(b,a);
		}
		if(l>c) {
			l = lcm(l, c);
		}
		else {
			l = lcm(c, l);
		}
		System.out.println("LCM = "+l);
		
	}
}
