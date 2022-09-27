package Accenture;

import java.util.Scanner;

public class MaximumInArray {
	public static void main(String[] args) {
		int arr[] = {23,45,82,27,66,12,78,13,71,86};
		int max =arr[0];
		int idx = 0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println(idx+"\n"+max);
	}
}
