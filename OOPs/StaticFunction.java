package OOPs;
class abc{
	static void sun() {
		System.out.println("hii");
	}
}

public class StaticFunction {
	static void fun() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		fun(); // no need of class name as main as in same class
		abc.sun(); // static function called by its class name
	}
}
