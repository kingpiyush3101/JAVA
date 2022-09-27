package OOPs;

public class ThisOperator {
	int a;
	void fun(int a) {
		this.a = a;
	}
	void show() {
		System.out.println("a = "+a);
	}
	public static void main(String[] args) {
		ThisOperator obj = new ThisOperator();
		obj.fun(10);
		obj.show();
	}
}
