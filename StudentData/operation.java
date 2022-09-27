package StudentData;

import java.util.Scanner;

public class operation {
	static void input(Student arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+ " Id , Name and Marks(out of 100): ");
			Student obj = new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			arr[i]=obj;
		}
	}
	static void percentage(Student arr[]) {
		for(int i=0;i<arr.length;i++) {
			Student obj = arr[i];
			float per = (float)(obj.getM1()+obj.getM2()+obj.getM3())*100/300;
			obj.setPer(per);
		}
	}
//	static void HighestPercentage(Student arr[]) {
//		float max = arr[0].getPer();
//		for(int i=0;i<arr.length;i++) {
//			if(max>=arr[i].getPer()) {
//				max=arr[i].getPer();
//			}
//		}
//	}
	static void display(Student arr[]) {
		System.out.println("Student Data:"+"\n"+"Id"+"\t"+"Name"+"\t\t"+"%");
		for(int i=0;i<arr.length;i++) {
			//Student obj = arr[i];
//			System.out.println(obj.id+"\t"+obj.name);
			String s=String.format("%.02f", arr[i].getPer());
			System.out.println(arr[i].getId()+"\t"+arr[i].getName()+"\t\t"+s);
		}
	}
}
