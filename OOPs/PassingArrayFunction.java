package OOPs;

public class PassingArrayFunction { 
	void fun(int kar[]) { //call by reference
		int max = kar[0];
		for(int i = 0;i<kar.length;i++) {
			kar[i]=0;
		}

	}
	public static void main(String[] args) {
		int mar[]= {1,2,3,4,5,6};
		PassingArrayFunction obj = new PassingArrayFunction();
		obj.fun(mar);
		//name of array contains base address - address of first element
		for(int i = 0;i<mar.length;i++) {
			System.out.print(mar[i]+" ");
		}
	} 
}
