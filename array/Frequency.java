package array;

import java.util.Arrays;

public class Frequency {
	public static void main(String[] args) {
		
//		int arr[] = {2,7,7,2,2,3,7,2};
//		int f[]= {-1,-1,-1,-1,-1,-1,-1,-1};
//		int i,j;
//		for(i=0;i<arr.length;i++) {
//			int count=1;
//			for(j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//					f[j]=0;
//				}
//			}
//			if(f[i]!=0) {
//				f[i]=count;
//			}
//			
//		}
//		for(i=0;i<arr.length;i++) {
//			if(f[i]>=1) {
//				System.out.println(arr[i]+ " is "+f[i]+" times");
//			}
//		}
		

//		//sorted array
//		int i,j,t;
////		for(i=0;i<arr.length-1;i++) {
////			for(j=1;j<arr.length-1;j++) {
////				if(arr[j]>arr[j+1]) {
////					t=arr[j+1];
////					arr[j+1]=arr[j];
////					arr[j]=t;
////				}
////			}
////		}
//		Arrays.sort(arr);
//		System.out.println("Sorted Array: ");
//		for(i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+ " ");
//		}
//		
//
//		System.out.println();
//		//unique and duplicate element and remove duplicate
//		int arr1[] = new int[arr.length];
//		int a=0,m=0;
//		for(i=0;i<arr.length;i++) {
////			    if(i!=0&&arr[i]==arr[i-1]&&count!=0){
////			    	continue;
////				}
//			if(a!=arr[i]) {
//				int c = 0;
//				for(j=0;j<arr.length;j++) {
//					if(arr[i]==arr[j]) {
//						c++;
//					}
//				}
//				//System.out.println(arr[i]+":"+c);
//				if(c==1) {
//					System.out.println(arr[i]+" is unique");
//				}
//				if(c>1) { 
//					System.out.println(arr[i]+" is duplicate");
//					a=arr[i];
//				}
//				arr1[m]=arr[i];
//				m++;
//			}	
//		}
//		System.out.println("After Removing duplicate: ");
//		for(i=0;i<m;i++) {
//				System.out.print(arr1[i]+ " ");
//		}
//		
//		
//		//second largest element when sorted in ascending order
////		for(i=arr.length-1;i>=0;i--) {
////			if(arr[i-1]<arr[i]) {
////				 System.out.println("Second largest element: "+arr[i-1]);
////				 break;
////			}
////		}
		
		//second largest without sorting
//		int arr[]={1,3,4,2,7};
//		int max1=arr[0],max2=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(max1<arr[i]) {
//				int t=max1;
//				max1=arr[i];
//				max2=t;
//			} 
//		}
//		System.out.println(max2);
		
		
		
//		int a[]= {1,3,2,4,5,2,5,8};
//		Arrays.sort(a);
//		int i,j,k=0,flag=0;
//		for(i=0;i<a.length;i++) {
//			System.out.print(a[i]+ " ");
//		}
//		System.out.println();
//		for(i=0;i<a.length;i++) {
//			if(k!=a[i]) {
//				int count=0;
//				for(j=0;j<a.length;j++) {
//					if(a[i]==a[j]) {
//						count++;
//						flag++;
//					}
//				}
//				//System.out.println(a[i]+" : "+count);
//				k=a[i];
//				if(count==1) {
//					System.out.println(a[i]+" unique");
//				}
//				if(count>1) {
//					System.out.println(a[i]+" duplicate");
//				}
//			}
//			
//			
//		}
//		
//		
	}
}
