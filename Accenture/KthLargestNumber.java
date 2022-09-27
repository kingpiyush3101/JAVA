package Accenture;

import java.util.Arrays;

public class KthLargestNumber {
	public static void main(String[] args) {
		int arr[]= {74,85,102,99,101,56,84};
		int k = 2;
		Arrays.sort(arr);
		int idx=0;
		int count=-1;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]!=arr[i-1]) {
				idx=i;
				count++;
			}
			if(count==k) {
				break;
			}
		}
		System.out.println(arr[idx]);
		
	}
}
