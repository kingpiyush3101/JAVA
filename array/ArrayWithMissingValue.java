package array;

import java.util.Arrays;

public class ArrayWithMissingValue {
	public static void main(String[] args) {
		int arr[]= {1,4,3,5,6,5};
		Arrays.sort(arr);
		//1 3 4 5 5 6
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[i+1]=arr[i]+1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
