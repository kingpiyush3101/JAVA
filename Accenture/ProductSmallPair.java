package Accenture;

import java.util.Arrays;

public class ProductSmallPair {
	public static void main(String[] args) {
		int sum = 4;
		int arr[] = {9,8,-7,3,9,3};
		if(arr.length<2) {
			System.out.println(-1);
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				if((arr[i]+arr[i+1])<=sum) {
					System.out.println(arr[i]*arr[i+1]);
					break;
				}
				else {
					System.out.println(0);
					break;
				}
			}
		}
	}
}
