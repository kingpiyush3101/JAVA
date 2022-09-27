package Accenture;

public class CountSwapsInBubbleSort {
	public static void main(String[] args) {
		int n = 5;
		int arr[]= {10,11,8,7,1};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					count++;
				}
			}
		}
		System.out.println(count);	
	}
}
