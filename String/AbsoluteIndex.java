package String;

public class AbsoluteIndex {
	public static void main(String[] args) {
		String str = "999 aa 22aa";
		String s = "";
		int max1=0,max2=0;
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count ++;
				}
			}
			if(str.charAt(i)>=48&&str.charAt(i)<=57) {
				if(max1<count) {
					max1=count;
				}
			}
			if((str.charAt(i)>=97&&str.charAt(i)<=122)||(str.charAt(i)>=65&&str.charAt(i)<=90)) {
				if(max2<count) {
					max2=count;
				}
			}
		}
		int abIndex = Math.abs(max1-max2);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==32) {
				s = s + '$';
			}
			else if(str.charAt(i)==str.charAt(abIndex)) {
				continue;
			}
			else {
				s = s + str.charAt(i);
			}
		}
		System.out.println(s);
	}
}
