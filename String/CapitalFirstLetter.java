package String;

public class CapitalFirstLetter {
	
	//without split()
	static String Check(String str) {
		String s="";
			if(str.charAt(0)>=97&&str.charAt(0)<=122) {
				s = s + (char)(str.charAt(0)- 32);
			}
			s = s + str.substring(1, str.length());
			return s;
		}
		
//	public static void main(String[] args) {
//		String  str = "hello how are you";
//		String sk="";
//		int pos = 0;
//		for(int i = 0;i<str.length();i++) {
//			String s ="";
//			if (str.charAt(i)==' ') {
//				for(int j = pos;j<i;j++) {
//					s = s+ str.charAt(j);
//				}
//				sk=sk + Check(s);
//				pos = i + 1;
//				sk = sk + " ";
//			}
//			if(i==str.length()-1) {
//				for(int j = pos;j<=i;j++) {
//					s = s+ str.charAt(j);
//				}
//				sk=sk + Check(s);
//			}
//		}
//		System.out.print(sk);
//	}
	
	//with split()
	public static void main(String[] args) {
		String str = "hello how are you";
		String st = "";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			st = st + Check(arr[i]) + " ";
		}
		st=st.trim();
		System.out.print(st);
	}
}
