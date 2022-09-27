package String;

public class MissbyInt {
	public static void main(String[] args) {
		String str = "abc2e#rs3qptrm";
		//            abcrsrm
		//0==48 9-57
		String s ="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48&&str.charAt(i)<=57) {
				i = i + (str.charAt(i)-48);
			}
			else {
				s = s + str.charAt(i);
			}
		}
		System.out.println(s);
	}
}
