package Recursion;

public class Conversion {
	static int sum=0;
	static int BinarytoDecimal(int num) {
		if(num==0) {
			return sum;
		}
		else {
			int r = num%2;
			BinarytoDecimal(num/2);
			sum = sum*10 + r ;
		   
		}
		return sum;
	}
	
	static int i=0;
	static int  DecimaltoBinary(int num) {
		if(num==0) {
			return 0;
		}
		else {
			int r = num%10;
			sum = sum +( r * (int) Math.pow(2, i++));
			DecimaltoBinary(num/10);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num = 11001;
		//System.out.println(BinarytoDecimal(num));
		System.out.println(DecimaltoBinary(num));
		
	}
}
