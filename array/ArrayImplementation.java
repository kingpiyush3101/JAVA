package array;

import java.util.Scanner;

public class ArrayImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = sc.nextInt();
		int arr[] = new int[size]; //array declaration
		System.out.print("Enter Elements: ");
		int i;
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Entered Elements: ");
		for(i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
