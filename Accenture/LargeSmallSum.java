package Accenture;

public class LargeSmallSum {
	public static void main(String[] args) {
		int arr[]= {3,2,1,7,5,4};
		if(arr.length<=3) {
			System.out.println(0);
			System.exit(0);
		}
		int maxeven = arr[0]; 
		int min1 = arr[1]; 
		int min2 = arr[1]; 
		for(int i=1;i<arr.length;i+=2) {
			
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2&&arr[i]!=min1) {
				min2 = arr[i];
			}
			
			if(maxeven<arr[i-1]) {
				maxeven=arr[i-1];
			}
		}
		//System.out.println(maxeven);
		//System.out.println(min1+" "+min2);
		System.out.println(maxeven+min2);
	}
}
