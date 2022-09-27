package sorting_and_searching;

import java.util.Scanner;

public class LinearSearch {
	//complexity - O(n)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[]=new int[size]; 
		System.out.println("Enter Elements: ");
		int i;
		int flag=0;
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter element to Search: ");
		int k = sc.nextInt();
		for(i=0;i<size;i++) {
			if(arr[i]==k) {
				flag=1;
				System.out.println(k+ " found at location "+(i+1));
				break;
			}
		}
		if(flag==0) {
			System.out.println(k+ " not found");
		}
		
	}
}
