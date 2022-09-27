package array;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st array Size: ");
		int size1 = sc.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter Elements: ");
		int i;
		for(i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array Size: ");
		int size2 = sc.nextInt();
		int[] arr2=new int[size2];
		System.out.println("Enter Elements: ");
		for(i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int arr3[] = new int[arr1.length + arr2.length];
		for(i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			arr3[i++] = arr2[j];
		}
		System.out.println("Merged Array: ");
		for(i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}
}
