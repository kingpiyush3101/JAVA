package OOPs;

import java.util.Scanner;
class Employee{
	
	private int employeeid;
	private String employeeName;
	private double Salary;
	private double netSalary;

	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public void calculateNetSalary(int pfpercentage) {
		netSalary=Salary-(Salary*pfpercentage)/100;
		this.setNetSalary(netSalary);
	}
}
public class SalaryEstimation{
	static Scanner sc = new Scanner(System.in);
	public static Employee getEmployeeDetails() {

		Employee obj = new Employee();
		System.out.println("Enter Id:");
		obj.setEmployeeid(sc.nextInt());
		System.out.println("Enter Name:");
		obj.setEmployeeName(sc.next());
		System.out.println("Enter Salary:");
		obj.setSalary(sc.nextDouble());
		return obj;
	}
	public static void display(Employee obj){
		System.out.println("Id: "+obj.getEmployeeid());
		System.out.println("Name: "+obj.getEmployeeName());
		System.out.println("Salary: "+obj.getSalary());
		System.out.println("NetSalary: "+obj.getNetSalary());
	}
	
	public static int getPFpercentage() {
		System.out.println("Enter PF Percentage:");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Employee obj=getEmployeeDetails();
		obj.calculateNetSalary(getPFpercentage());
		display(obj);
	}
}
