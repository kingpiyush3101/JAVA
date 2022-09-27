package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class HighestFrequencyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int count=1;
			int max=0;
			int num=0;
			Arrays.sort(arr);			
			for(int i =0;i<n-1;i++) {
				if(arr[i]==arr[i+1]) {
					count++;
				}
				else {
					if(max<count) {
						max = count;
						num = arr[i];
						count=1;
					}
				}
			}
			if(count == n) {
				num = arr[0];
			}
			System.out.println(num);
		}
		
		
	}
}
