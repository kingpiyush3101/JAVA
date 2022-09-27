package String;

public class IpAddress {
	static boolean check(String ip) {
		String arr[]=ip.split("[.]");
		if(arr.length<4) {
			return false;
		}
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int x = Integer.parseInt(arr[i]);
			if(x<=255&&x>=0) {
				count++;
			}
		}
		if(count==4) {
			return true;
		}
		return false;

	}
	public static void main(String[] args) {
		String ip = "2.256.0.60";
		System.out.println(check(ip));
	}
}
