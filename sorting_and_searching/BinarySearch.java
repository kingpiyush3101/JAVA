package sorting_and_searching;

import java.util.Scanner;

public class BinarySearch {
	//works on divide and conquer 
	//complexity - O(log(n))
	public static void main(String[] args) {
		//for binary sort array must be in sorted order
		int arr[] = {11,22,33,44,55,66,77};
		//            0  1  2  3  4  5  6
		int beg = 0; //first index
		int end = arr.length-1; //last index
		int mid = (beg+end)/2;
		int item = 77; //element to be searched
		int f=0;
		while(beg<=end) {
			if(item == arr[mid]) {
				f=1;
				System.out.println(item +" found at location "+(mid+1));
			}
			if(arr[mid]>item) {
				end=mid;
			}
			else {
				beg=mid+1;
			}
			mid=(beg+end)/2;
		}
		if(f==0) {
			System.out.println(item + " not found");
		}
			
	}
}
