package loops;
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 2,i;
		for (i = 2; i < num ; i++) {
			if (num%i==0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if (i == num) {
			System.out.println("Prime");
		}
	}
}
