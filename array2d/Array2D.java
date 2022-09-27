package array2d;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row: ");
		int r = sc.nextInt();
		System.out.println("Enter Column: ");
		int c = sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter Elements: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
//		System.out.println("Entered Elements are:");
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		if(r==c) {
//			int sum=0,kum=0;
//				for(int i=0;i<r;i++) {
//					for(int j=0;j<c;j++) {
//						if(i==j) {
//							sum = sum + arr[i][j];
//						}
//						int lum = i + j;
//						if(lum==(r-1)){
//							kum = kum + arr[i][j];
//						}
//						
//					}
//				}
//				System.out.println("Sum of Diagonal 1 is : "+sum);
//				System.out.println("Sum of Diagonal 2 is : "+kum);
//				
//		}
//		else {
//			System.out.println("No Square Matrix.");
//		}
		
	    //sum of each row and column
//		int i,j;
//		for(i=0;i<r;i++) {
//			int sum=0,kum=0;
//			for(j=0;j<c;j++) {
//				sum=sum+arr[i][j];
//				kum=kum+arr[j][i];
//				
//			}
//			System.out.println("Sum of "+(i+1)+" row : "+sum);
//			System.out.println("Sum of "+(i+1)+" column : "+kum);
//		}
		
		//min max of each row
//		int i,j,min=0,max=0;
//		for(i=0;i<r;i++) {
//			for(j=0;j<c-1;j++) {
//				min=arr[i][0];
//				max=arr[i][0];
//				if(min>arr[i][j+1]) {
//					min=arr[i][j+1];
//				}
//				if(max<arr[i][j+1]) {
//					max=arr[i][j+1];
//				}
//			}
//			System.out.println("Min of "+(i+1)+" row : "+min);
//			System.out.println("Max of "+(i+1)+" row : "+max);
//		}
		
		//shortcut Transpose --- working
//		for(int j=0;j<c;j++){
//			for(int i=0;i<r;i++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//Transpose by using new array
//		int brr[][]=new int[r][c];
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				brr[j][i]=arr[i][j];
//			}
//		}
//		System.out.println("Transpose:");
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(brr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//Transpose by using same array
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<i;j++) {
//				int t = arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=t;
//			}
//			System.out.println();
//		}
//		System.out.println("Transpose:");
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<r;i++){
//			for(int j=c-1;j>=0;j--) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//			
//		}
		
//		for(int i=r-1;i>=0;i--) {
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//rotate 90 degree direct taking input 
//		for(int j=c-1;j>=0;j--){
//			for(int i=0;i<r;i++){
//			arr[i][j]=sc.nextInt();
//		}
//		System.out.println();
//	}
		//rotate 90 degree - anti clockwise
//		for(int j=c-1;j>=0;j--){
//			for(int i=0;i<r;i++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//						
//		}
		
		//rotate 90 degree - clockwise
//		for(int i=0;i<r;i++){
//			for(int j=c-1;j>=0;j--) {
//				System.out.print(arr[j][i]+ " ");
//			}
//			System.out.println();
//		}
		
	}
}
