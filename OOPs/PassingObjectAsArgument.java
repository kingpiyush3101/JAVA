package OOPs;

class time{
	private int hr,min,sec; //instance variable
	void init(int h, int m, int s) {
		hr=h; min=m; sec=s;
	}
	void show() {
		System.out.println(hr+":"+min+":"+sec);
	}
	public String tostring() {
		return hr+":"+min+":"+sec;
	}
	time sum(time g) { //Object g : object is top most class
		//directly call karne wale ka saman directly available hota hai
		//aur g.min mei t2 ka ayega kyuki g mei t2 pada va hai 
		
		//System.out.println((hr+g.hr)+":"+(min + g.min));
		time obj = new time();
		int m = (sec + g.sec)/60;
		int h = (min + g.min)/60;
		obj.sec = (sec + g.sec)%60;
		obj.min = (m+min+g.min)%60;
		obj.hr = (h + hr + g.hr)%12;
		
		return obj; //returning a object
		
	}
}

public class PassingObjectAsArgument { 
	//major class as it contains main
	public static void main(String[] args) {
		time t1 = new time();
		time t2 = new time();
		time t3 = new time();
		String s = new String();
		t1.init(8,40,30);
		t2.init(5,45,50);
		//t3.hr = t1.hr + t2.hr;  //directly accessing the variables
		//t3.min = t1.min + t2.min; 
		//t3.show();
		t3=t1.sum(t2); //passing object as argument
		//t1 and t2 saman at the same time send to sum()
		t3.show();
		System.out.println(s);
		
	}
}
