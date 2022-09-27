package OOPs;

public class MethodOverloading {
	void fun() {
		System.out.println("hi");
	}
	void fun(int x) {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.fun();
	}
	
	//return baad mei hota hai call pehle hoti hai 
}
