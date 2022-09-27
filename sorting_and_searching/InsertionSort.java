package sorting_and_searching;

public class InsertionSort {
	public static void main(String[] args) {
		//complexity - O(n^2)
		//                i
		int[] arr= {7,3,5,1,4,6};
        //          <---j
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1; //compare with previous 
			while(j>=0 && key<=arr[j]) { //j=-1 means nothing to compare
				//displacement
				arr[j+1]=arr[j]; 
				//put element in j to j+1
				j--;
			}
			arr[j+1]=key;//element put in j which we comparing 
		}
		System.out.println("Sorted Array: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
