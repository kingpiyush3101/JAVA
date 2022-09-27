package array;

public class NearestPrime {

	public static int Prime(int num){
		int i;
		for(i =2;i<num;i++) {
			if(num%i==0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int arr[]= {11,27,-5,35,2};
		int i,j;
		for(j=0;j<arr.length;j++) {
			int a=Prime(arr[j]);
			if (a==1) {
				arr[j]=arr[j];
			}
			else {
				for(i=0;;i++) {
					int n = arr[j]+i;
					a=Prime(n);
					if(a==1) {
						arr[j]=n;
						break;
					}
					n = arr[j]-i;
					a=Prime(n);
					if(a==1) {
						arr[j]=n;
						break;
					}
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}




