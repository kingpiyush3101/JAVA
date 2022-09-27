package String;

public class SwapFirstandLastCharacter {
	static  String Swap(String str) {
		String s = "";
		if(str.length()==1) {
			return str;
		}
		else {
			char f = str.charAt(0);
			char l = str.charAt(str.length()-1);
			s = s + l + str.substring(1, str.length()-1);
//			for(int i=1;i<str.length()-1;i++) {
//				s = s + str.charAt(i); 
//			}
			
			s = s + f;
		}
		return s;
	}
	static String getword(String str) {
		String sk="";
		int pos = 0;
		for(int i = 0;i<str.length();i++) {
			String s ="";
			if (str.charAt(i)==' ') {
				for(int j = pos;j<i;j++) {
					s = s + str.charAt(j);
				}
				pos = i + 1;
				sk = sk + Swap(s) + " ";
			}
			if(i==str.length()-1) {
				for(int j = pos;j<=i;j++) {
					s = s+ str.charAt(j);
				}
				sk = sk + Swap(s);
			}
		}
		return sk;
	}
	public static void main(String[] args) {
		String str = "Piyush Bhatt i";
		System.out.println(getword(str));
	}
}
