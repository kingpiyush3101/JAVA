package Accenture;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = {2,1,2};
		int max1=0;
		int max2=0;
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];
			}
			else if(max1!=arr[i]) {
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
}
