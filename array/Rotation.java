package array;

public class Rotation {

	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		//           0  1  2  3  4

		//22 33 44 55 11
//		int i,j;
//		int a=arr[0];
//		for(i=1;i<arr.length;i++) {
//			arr[i-1]=arr[i];
//		}
//		arr[arr.length-1]=a;
//		for(i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}

		//44 55 11 22 33
//		int i,j;
//		for(j=0;j<3;j++){
//			int a=arr[0];
//			for(i=1;i<arr.length;i++) {
//				arr[i-1]=arr[i];
//			}
//			arr[arr.length-1]=a;
//		}
//		for(i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}


		//55 11 22 33 44
		int i,j;
		int a=arr[arr.length-1];
		for(i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=a;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}
}