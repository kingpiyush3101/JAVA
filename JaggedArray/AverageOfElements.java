package JaggedArray;

import java.util.Scanner;

public class AverageOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Rows: ");
		int r = sc.nextInt(); 
		float n = 0,sum=0;
		int arr[][]=new int[r][];
		System.out.println("Enter no. of Columns: ");
		for(int i=0;i<r;i++) {
			int c = sc.nextInt();
			arr[i]=new int[c];
			n = n+c;
		}
		System.out.println("Enter Elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Total no. of Rows: "+r);
		System.out.println("Array in Matrix form: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum = sum + arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Total no. of Elements: "+n);
		System.out.println("Average of Elements in array: "+String.format("%.02f",(sum/n)));
		
		
	}
}
