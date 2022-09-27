package JaggedArray;

import java.util.Scanner;

public class TotalofFirstandLastClassTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int arr[][]=new int[n][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[sc.nextInt()];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=arr[i][0]+arr[i][arr[i].length-1];
			}
			System.out.println(sum);
		}
	}
}
