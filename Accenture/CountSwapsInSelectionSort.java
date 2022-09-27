package Accenture;

public class CountSwapsInSelectionSort {
	public static void main(String[] args) {
		int arr[]= {10,11,8,7,1};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int t = arr[min];
				arr[min]=arr[i];
				arr[i]=min;
				count++;
			}
		}
		System.out.println(count);
	}
}
