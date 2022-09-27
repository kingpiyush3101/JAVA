package array;

import java.util.Scanner;

public class ArrayDeletion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements: ");
		int i;
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Element to delete: ");
		int k = sc.nextInt();
		for(i=0;i<size;i++) {
			if(arr[i]==k) {
				break;
			}
		}
		
		for(int j=i;j<size-1;j++) {
			arr[j]=arr[j+1];
		}
		
		for(i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
