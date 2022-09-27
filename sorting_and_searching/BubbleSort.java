package sorting_and_searching;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		//complexity - O(n^2)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter Elements: ");
		int i,j,t;
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length-1;i++) { //for no. of steps
			for(j=0;j<arr.length-1;j++) { //for comparison
				if(arr[j]>arr[j+1]) { //< for descending
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("Array sorted in asscending order: ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
