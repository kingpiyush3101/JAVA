package Accenture;

import java.util.*;

public class StraightLine {
	static class pair{
		int f,s;
		pair(int f,int s){
			this.f=f;
			this.s=s;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<pair> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new pair(a,b));
		}
		isStraightLinePossible(arr,n);
		
	}
	static void isStraightLinePossible(ArrayList<pair> arr, int n) {
		//Write your code from here
		int x0 = arr.get(0).f;
		int y0 = arr.get(0).s;
		int x1 = arr.get(1).f;
		int y1 = arr.get(1).s;
		int dx=x1-x0,dy=y1-y0;
		for(int i=0;i<n;i++) {
			int x = arr.get(i).f;
			int y = arr.get(i).s;
			if(dx*(y-y1)!=dy*(x-x1)) {
				System.out.println(0);
			}
		}
		System.out.println("1x-1y=0");
	}
}
