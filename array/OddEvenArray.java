package array;

public class OddEvenArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int[] arr1= new int[arr.length];
		int[] arr2= new int[arr.length];
		int i=0;
		int m = 0,n=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr1[m]=arr[i];
				m++;
			}
			else {
				arr2[n++]=arr[i];
			}
		}
		System.out.println("Odd Elements: ");
		for(i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("Even Elements: ");
		for(i=0;i<m;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
