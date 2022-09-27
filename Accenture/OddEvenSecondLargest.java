package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();	
		}
		
		int even[]=new int[size];
		int odd[]=new int[size];
		int m=0,n=0;
		for(int i=0;i<size;i++) {
			if(i%2==0) {
				even[m++]=arr[i];
			}
			else {
				odd[n++]=arr[i];
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		for(int i=0;i<size;i++) {
			if(even[i]!=0)
				System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			if(odd[i]!=0)	
				System.out.print(odd[i]+" ");
		}
		int sum =0;
		for(int i=size-1;i>0;i--) {
			if(even[i]!=even[i-1]) {
				sum+=even[i-1];
				break;
			}
		}
		for(int i=size-1;i>0;i--) {
				if(odd[i]!=odd[i-1]) {
					sum+=odd[i-1];
					break;
				}
		}
		System.out.println(sum);
		
		
//		int max2 = 0,max1=0;
//		for(int i=0;i<m;i++) {
//			if(max1<even[i]) {
//				max2=max1;
//				max1=even[i];
//			}
//			else {
//				max2=even[i];
//			}
//		}
//		int sum = max2;
//		max2=0;
//		max1=0;
//		for(int i=0;i<n;i++) {
//			if(max1<odd[i]) {
//				max2=max1;
//				max1=odd[i];
//			}
//			else {
//				max2=odd[i];
//			}
//		}
//		sum+=max2;
//		System.out.println(sum);
		
	}
}
