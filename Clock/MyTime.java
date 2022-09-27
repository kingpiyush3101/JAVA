package Clock;

public class MyTime {
	private int hour; // with the domain of values between 0 to 23.
	private int minute; // with the domain of values between 0 to 59.
	private int second; // with the domain of values between 0 to 59 
	public MyTime( )
	{
	}
	// Constructor. Initializes a new instance of the MyTime class. 
	public MyTime(int hour, int minute, int second )
	{
		// Constructor. Initializes a new instance of the MyTime class and sets the
		// three instance variables to the respe 
		//values given in the input.
		this.hour=hour;
		this.minute=minute;
		this.second = second;
	}

	public void SetTime( int hour, int minute, int second ) {

	// Sets the three instance variables to the respective values given in the
	// input. 
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
	}
	public void SetHour( int hour ) {

	// Mutator method. Gives the specified value to the instance variable hour. 
		this.hour=hour;
	}
	public void SetMinute( int minute ) {

	// Mutator method. Gives the specified value to the instance variable minute. 
		this.minute = minute;
	}
	public void SetSecond( int second ) {

	// Mutator method. Gives the specified value to the instance variable second. 
		this.second=second;
	}
	public int GetHour( ) {
	// Accessor method. Gets the value of the instance variable hour. 
		return this.hour;
	}
	public int GetMinute( ) {

	// Accessor method. Gets the value of the instance variable minute. 
		return this.minute;
	}
	public int GetSecond( ) {

	// Accessor method. Gets the value of the instance variable second. 
		return this.second;
	}

	MyTime NextSecond( ) {

	// Updates this instance of MyTime to the next second and returns this instance.
		MyTime obj = new MyTime();
		if(this.second==59) {
			obj.second=0;
		}
		else {
			obj.second = this.second + 1; 
		}
		obj.hour = this.hour;
		obj.minute = this.minute;
		return obj;
	}
	
	MyTime NextMinute( ) {

	// Updates this instance of MyTime to the next minute and returns this instance.
		MyTime obj = new MyTime();
		if(this.minute==59) {
			obj.minute=0;
		}
		else {
			obj.minute = this.minute + 1; 
		}
		obj.hour = this.hour;
		obj.second = this.second;
		return obj;
	}
	
	MyTime NextHour() {

	// Updates this instance of MyTime to the next hour and returns this instance. 
		MyTime obj = new MyTime();
		if(this.hour==23) {
			obj.hour=0;
		}
		else {
			obj.hour = this.hour + 1; 
		}
		obj.minute = this.minute;
		obj.second = this.second;
		return obj;
	}
	
	MyTime PreviousSecond( ) {
		
	// Updates this instance of MyTime to the previous second and returns this instance.
		MyTime obj = new MyTime();
		if(this.second==0) {
			obj.second=59;
		}
		else {
			obj.second = this.second - 1; 
		}
		obj.hour = this.hour;
		obj.minute = this.minute;
		return obj;
	}
	
	MyTime PreviousMinute( ) {

	// Updates this instance of MyTime to the previous minute and returns this instance. 
		MyTime obj = new MyTime();
		if(this.minute==0) {
			obj.minute=59;
		}
		else {
			obj.minute = this.minute - 1; 
		}
		obj.hour = this.hour;
		obj.second = this.second;
		return obj;
	}
	
	MyTime PreviousHour( ) {

	// Updates this instance of MyTime to the previous hour and returns this instance. 
		MyTime obj = new MyTime();
		if(this.hour==0) {
			obj.hour=23;
		}
		else {
			obj.hour = this.hour - 1; 
		}
		obj.minute = this.minute;
		obj.second = this.second;
		return obj;
	}
	
	void ToString(MyTime obj1,MyTime obj2,MyTime obj3) {
		//return string.Format("{0:D2}:{1:D2}:{2:D2}",this.hour, this.minute, this.second);
		
		System.out.println(obj1.hour+":"+obj2.minute+":"+obj3.second);

	// Returns a string that represents the current object. ToString() is the major
	// formatting method in the .NET //Framework. It converts an object to its
	// string representation so that it is suitable for display. This method must
	// return the time stored in the MyTime as a string formatted to "HH:MM:SS". 
		
	}
	
	public static void main(String arg[]) {
		System.out.println("Hello World");
		MyTime obj = new MyTime();
//		MyTime objtemp = new MyTime();
		obj.SetTime(15, 20, 25);
//		System.out.println(obj.ToString());
		MyTime obj1 = obj.NextHour();
		MyTime obj2 = obj.NextMinute();
		MyTime obj3 = obj.NextSecond();
		obj.ToString(obj1,obj2,obj3);
//		System.out.println(objtemp.ToString());
	}
}
