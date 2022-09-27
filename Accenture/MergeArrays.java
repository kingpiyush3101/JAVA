package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int asize = sc.nextInt();
		int a[]=new int[asize];
		for(int i=0;i<asize;i++) {
			a[i]=sc.nextInt();
		}
		int bsize = sc.nextInt();
		int b[]=new int[bsize];
		for(int i=0;i<bsize;i++) {
			b[i]=sc.nextInt();
		}
		int c[]=new int[asize+bsize];
		int m=0;
		for(int i=0;i<asize;i++) {
			c[m++]=a[i];
		}
		for(int i=0;i<bsize;i++) {
			c[m++]=b[i];
		}
		
		//Arrays.sort(c);
		int count=0;
		for(int i=0;i<c.length-1;i++) {
			for(int j=0;j<c.length-1;j++) {
				if(c[j]>c[j+1]) {
					int t=c[j+1];
					c[j+1]=c[j];
					c[j]=t;
					count++;
				}
			}
		}
		System.out.println(count);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		
		
		
	}
}
