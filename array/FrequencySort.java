package array;

import java.util.*;

public class FrequencySort {
	public static void main(String[] args) {
		int n = 19;
		int arr[]= {1,2,2,3,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
//		int arr1[]=new int[10];
//		int arr2[][]=new int[2][10];
//		int count=1;
//		int i,k=0;
//		
//		//counting frequency
//		for(i=0;i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1]) {
//				count++;
//			}
//			else {
//				arr2[0][k]=arr[i];
//				arr2[1][k]=count;
//				k++;
//				count=1;
//			}
//		}
//		if(arr[i-1]!=arr[i]) {
//			arr2[0][k]=arr[i];
//			arr2[1][k]=1;
//			k++;
//		}
//		
//		//sorting frequency : bubble sort
//		for(int j=0;j<k-1;j++) {
//			for(i=0;i<k-1;i++) {
//				if(arr2[1][i]<arr2[1][i+1]) {
//					int temp=arr2[1][i];
//					arr2[1][i]=arr2[1][i+1];
//					arr2[1][i+1]=temp;
//					
//					temp=arr2[0][i];
//					arr2[0][i]=arr2[0][i+1];
//					arr2[0][i+1]=temp;
//					
//				}
//			}
//		}
//		
//		//printing sorted array 
//		for(i=0;i<k;i++) {
//			int t = arr2[1][i];
//			while(t-->0) {
//				System.out.print(arr2[0][i]+" ");
//			}
//		}
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		int i,count = 1;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count ++;
				continue;
			}
			else {
					mp.put(arr[i], count);
					count = 1;
			}
		}
		if(arr[i-1]!=arr[i]) {
			mp.put(arr[i], 1);
		}
		System.out.println(mp);
		
		for(Map.Entry m : mp.entrySet()) {
			Integer key = (int)m.getKey();
			int value = (int)m.getValue();
			System.out.println(value);
		}
				
	}
}
