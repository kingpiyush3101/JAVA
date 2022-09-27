package sorting_and_searching;

public class SelectionSort {
	public static void main(String[] args) {
		//complexity - O(n^2)
		int[] a = {7,3,5,1,4,6};
		for(int i=0; i<a.length;i++) {
			int min =i;
			for(int j = i+1;j<a.length;j++) { 
			//we have to leave 1st and select smallest from rest so j = i+1
				if(a[min]>a[j]) {
					min=j;   //we need index of minimum value
				}
			}
			if(i!=min) { //if i is not equal to min then swap
				int t=a[min];
				a[min]=a[i];
				a[i]=t;
			}
		}
		System.out.println("Sorted Array: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
