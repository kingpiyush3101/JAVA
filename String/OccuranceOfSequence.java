package String;

public class OccuranceOfSequence {
	public static void main(String[] args) {
		String str = "timtim";
		String str1 = "tim";
		int count=0;
		for(int i=0;i<=str.length()-str1.length();i++) {
			String s ="";
			s = s + str.substring(i, i+str1.length());
			if(s.equalsIgnoreCase(str1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
