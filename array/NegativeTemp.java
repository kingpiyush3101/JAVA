package array;

public class NegativeTemp {
	static int neg(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]={9,-3,8,-6,-7,8,10};
		System.out.println(neg(arr));
	}
}
