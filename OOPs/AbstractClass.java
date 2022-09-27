package OOPs;
abstract class YY{
	void fun() { //defined
		System.out.println("Hello");
	}
	abstract void sun(); //undefined 
}
public class AbstractClass extends YY{
	void sun() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		obj.fun();
		obj.sun(); 
	}
}
