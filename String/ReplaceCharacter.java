package String;

public class ReplaceCharacter {
	public static void main(String[] args) {
		
		String str = "uttaranchal";
		String s ="";
		int index1=3,index2=7;
//		s = str.substring(0,index1) + str.charAt(index2) 
//		+ str.substring(index1+1, index2)+ str.charAt(index1) 
//		+ str.substring(index2+1);
//		System.out.println(s);
		for(int i=0;i<str.length();i++) {
			if(i==index2) {
				s = s + str.charAt(index1);
				continue;
			}
			if(i==index1) {
				s = s + str.charAt(index2);
				continue;
			}
			else {
				s = s + str.charAt(i);
			}
		}
		System.out.println(s);
		
		
	}
}
