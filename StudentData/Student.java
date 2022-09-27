package StudentData;

public class Student {
	int id;
	String name;
	private int m1,m2,m3;
	private float per;
//	void setName(String s) {
//		this.name = s;
//	}
//	void setId(int i) {
//		this.id = i;
//	}
	public Student(int id,String name,int m1,int m2,int m3) {  //by constructor
		//if not public can use only in same package  
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}
	public int getM3() {
		return m3;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
}
