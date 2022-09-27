package OOPs;
//
//public class InstanceVariable {
//		int a=2; //Instance Variable---global
//		//sari classes ko pata hota hai ki a ke saath
//		//kisi bhi function mei kya hua
//		
//		void fun() {
//			int a = 8; //first priority ----local
//			a=8; //if not int then we are using instance variable
//			System.out.println("a = "+a); //a=8
//		}
//		void sun() {
//			System.out.println("a = "+a); 
//			//a=8 as a value has been changed and a is instance variable
//		}
//		public static void main(String[] args) {
//			//System.out.println(a); //error as a not static
//			InstanceVariable obj = new InstanceVariable();
//			obj.fun();
//			obj.sun();

//	int a; //by default instance variable has 0
//
//	void fun() {
//		a=10;
//	}
//	void sun() {
//		System.out.println("a = "+a); 
//	}
//	public static void main(String[] args) {
//		InstanceVariable obj1 = new InstanceVariable();
//		InstanceVariable obj2 = new InstanceVariable();
//		obj1.fun();
//		obj2.sun(); 
//		//output will be 0 (by default value) as value is changing in fun()
//		//but it has been called by another object
	
	
//	static int a; //memory management tools 
//	//if variable is static : single memory shared between different objects
//	void fun() {
//		a=10; 
//		//value will change for everyone now as a is static
//	}
//	void sun() {
//		System.out.println("a = "+a); 
//	}
//	public static void main(String[] args) {
//		InstanceVariable obj1 = new InstanceVariable();
//		InstanceVariable obj2 = new InstanceVariable();
//		obj1.fun();
//		obj2.sun();
		
//	}
//}
