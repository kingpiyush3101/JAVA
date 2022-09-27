package Assessment;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,p;
		System.out.println("Enter Elements: ");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter position: ");
		int n = sc.nextInt();
		int j;
		for(j=0;j<n;j++) {
			int a=arr[0];
			for(i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=a;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
