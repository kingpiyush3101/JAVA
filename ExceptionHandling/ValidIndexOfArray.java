package ExceptionHandling;

import java.util.Scanner;

public class ValidIndexOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		try {
			int in = sc.nextInt();
			if(in>size) {
				throw new Exception("Out Of Bounds");
			}
			System.out.println(arr[in]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
