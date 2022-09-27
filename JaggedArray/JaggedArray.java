package JaggedArray;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		//2D array with variable no. of columns
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][];
		//System.out.println(arr.length); 
			// length = 3 as no columns right now
		//System.out.println(arr[0].length); 
			// null as no columns in 0th row
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the column:");
			arr[i]=new int[sc.nextInt()];
		}
		System.out.println("Enter Elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		} 
		System.out.println("Elements are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
