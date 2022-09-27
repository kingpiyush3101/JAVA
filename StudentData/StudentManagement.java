package StudentData;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[3]; //array of object
		operation.input(arr);
		
//		for(int i=0;i<3;i++) {
//			System.out.println("Enter the Id:");
//			int roll = sc.nextInt();
//			System.out.println("Enter the Name: ");
//			String n = sc.next();
//			Student obj = new Student();
//			System.out.println("Enter the Id and Name: ");
//			obj.setName(n);
//			obj.setId(roll);
//			Student obj = new Student(sc.nextInt(),sc.next());
//			obj.id = roll;
//			obj.name = n;
//			arr[i]=obj;
//		}
//		System.out.println("Data: ");
//		for(int i=0;i<arr.length;i++) {
//			Student obj = arr[i];
//			System.out.println(obj.id+"\t"+obj.name);
//			System.out.println(obj.getId()+"\t"+obj.getName());
//		}
		operation.percentage(arr);
		operation.display(arr);
	}
}
