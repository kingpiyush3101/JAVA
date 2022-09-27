package array;

import java.util.Scanner;

public class ArrayInsertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size= sc.nextInt();
		int arr[]=new int[size+1];
		System.out.println("Enter Elements: ");
		int i;
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Element to Insert: ");
		int k = sc.nextInt();
		System.out.println("Enter place to Insert: ");
		int p = sc.nextInt();
		//11 22 33 44 55 _
		//0   1  2  3  4 5
		//             i
		for(i=size-1;i>=p;i--) {
			arr[i+1]=arr[i];
		}
		arr[p]=k;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
}
