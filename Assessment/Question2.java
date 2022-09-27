package Assessment;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,m=0,n=0;
		
		System.out.println("Enter Size 1: ");
		int size1=sc.nextInt();
		System.out.println("Enter Size 2: ");
		int size2=sc.nextInt();
		int a[]=new int[size1+size2];
		System.out.println("Enter " +size1+" elements:");
		for(i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter " +size2+" elements:");
		for(j=i;j<a.length;j++) {
			a[j]=sc.nextInt();
		}
		
		int f[]=new int[a.length];
		for(i=0;i<a.length;i++) {
			f[i]=-1;
		}
		
		int c[]=new int[a.length];
		int d[]=new int[a.length];

		for(i=0;i<a.length;i++) {
			int count =1;
			for(j=i+1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					count++;
					f[j]=0;
				}
			}
			if(f[i]!=0) {
				f[i]=count;
			}
		}
		for(i=0;i<a.length;i++) {
			if(f[i]>=1) {
				d[n++]=a[i];
			}
		}
		
		for(i=0;i<size1;i++) {
			for(j=size1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					c[m++]=a[i];
				}
			}
		}
		
		System.out.println("Common:");
		for(i=0;i<m;i++) {
			System.out.print(c[i]+ " ");;
		}
		
		System.out.println("Distinct:");
		for(i=0;i<n;i++) {
			System.out.print(d[i]+ " ");;
		}
	}
}
