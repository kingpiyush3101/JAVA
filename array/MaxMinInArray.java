package array;

import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[]=new int[size]; 
		System.out.println("Enter Elements: ");
		int i;
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0],min = arr[0];
		for(i=1;i<size;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min= arr[i];
			}
		}
		System.out.println("Maximum Element : "+max);
		System.out.println("Minimum Element : "+min);

	}

}
