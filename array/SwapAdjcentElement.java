package array;

public class SwapAdjcentElement {
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		int i;
		for(i=0;i<arr.length-1;i+=2) {
				int t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
			}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
