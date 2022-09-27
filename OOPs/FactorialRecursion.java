package OOPs;

public class FactorialRecursion {
	int fact(int x) {
		if(x<=1) {
			return 1;
		}
		else {
			return x*fact(x-1);
		}
		
	}
	public static void main(String[] args) {
		//we can access non static method by making objects
		
		FactorialRecursion obj = new FactorialRecursion();  
		int sum=0;
		float kum=0;
		float lum =0;
		for(int i=1;i<=5;i++) {
			int ans=obj.fact(i);
			
			//1! + 2! + 3! + 4! + 5!
			sum = sum+ans;
			
			//1/1! + 2/2! + 3/3! + 4/4! + 5/5!
			kum = kum + (float)i/ans;
			
			//1/1! - 2/2! + 3/3! - 4/4! + 5/5!
			if (i%2==0) {
				lum=lum-(float)i/ans;
				
			}
			else {
				lum=lum+(float)i/ans;
			}
		}
		System.out.println("1! + 2! + 3! + 4! + 5! :"+sum);
		System.out.println("1/1! + 2/2! + 3/3! + 4/4! + 5/5! : "+kum);
		System.out.println(lum);
	}
}
