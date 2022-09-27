package Assessment;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,j,m=0,n=0;
		System.out.println("Enter Elements: ");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int a[]=new int[arr.length];
		int b[]=new int[arr.length];
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				a[m]=arr[i];
				m++;
			}
			else {
				b[n]=arr[i];
				n++;
			}
		}
		for(i=0;i<m;i++) {
			System.out.print(a[i]+" ");
		}
		for(i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
