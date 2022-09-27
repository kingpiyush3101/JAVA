package Recursion;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		int item = 44;
		LinearSearch obj = new LinearSearch();
		int ans=obj.fun(arr,0,arr.length,item);
		if(ans==1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found ");
		}
	}

	int fun(int[] arr, int start, int end, int item) {
		if(start<=end) {
			return -1;
		}
		else if(item==arr[start]) {
			return start;
		}
		else {
			return fun(arr,start+1,end,item);
		}
		
	}
}
