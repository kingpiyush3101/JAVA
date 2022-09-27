package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SumofUncommonNo {
	static int sum1(int sum) {
		int n=sum;
		sum = 0;
		while(n>0) {
			int r = n%10;
			sum = sum + r;
			n=n/10;
		}
		return sum;
	}
	static int fun(int a[],int b[]) {
		int i,j;
		int m=0;
		int c[]=new int[a.length+b.length];
		for (i = 0; i < a.length; i++) {
			c[m++]=a[i];
		}
		for (i = 0; i < b.length; i++) {
			c[m++]=b[i];
		}
		Arrays.sort(c);
		int sum = 0;
		for (i = 0; i < c.length; i++) {
			if(c[i]==c[i+1]) {
				i++;
			}
			else if(c[i]!=c[i+1]){
				sum = sum+c[i];
			}
		}
		while(sum>=10) {
			sum=sum1(sum);
		}
		return sum;
	}	
	public static void main(String[] args) {
		int a[]= {6,7,12,70,44};
		int b[]= {8,6,70,44};
		System.out.println(fun(a, b));
	}
}
