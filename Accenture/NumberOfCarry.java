package Accenture;

public class NumberOfCarry {
	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 563;
		String s1 = ""+num1;
		String s2 = ""+num2;
		int count=0;
		int carry=0;
		String zero="0";
		int t = Math.abs(s2.length()-s1.length());
		if(s2.length()>s1.length()) 
			s1 = zero.repeat(t)+s1;
		else
			s2 = zero.repeat(t)+s2;
		
		
		for(int i =s1.length()-1;i>=0;i--) {
			int ch1=s1.charAt(i)-48;
			int ch2=s2.charAt(i)-48;
			if((ch1+ch2+carry)>9) {
				count++;
				carry=1;
			}
		}
		System.out.println(count);
	}
}
