 package OOPs;

import java.util.Scanner;
class Date{
	int mon,day,k;
	public Date(int a, int b) {
		this.mon=a;
		this.day=b;
	}

	public int daysInMonth() {
		if(mon%2==1&&mon<8&&mon!=2) {
			k=31;
			return 31;
		}
		if(mon%2==0&&mon>7&&mon!=2) {
			k=31;
			return 31;
		}
		if(mon==2) {
			k=28;
		}
		k=30;
		return 30;
	}

	public void nextDay() {
		System.out.print(day+" "+mon);
		System.out.println();
		if(day>=k) {
			day = 1;
			mon = mon + 1;
			if(mon==13) {
				mon=1;
			}
		}
		else {
			day = day + 1;
		}
	}
	int getDay() {
		return day;
	}
	int getMonth() {
		return mon;
	}
}
public class DateClassOOPs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = Integer.parseInt(sc.nextLine().trim());
		b = Integer.parseInt(sc.nextLine().trim());
		Date d = new Date(a,b);
		System.out.println(d.daysInMonth());
		d.nextDay();
		System.out.println(d.getDay()+" "+d.getMonth());
	}
}
