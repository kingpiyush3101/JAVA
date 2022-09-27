package String;

public class FirstandLastVowelCharacterString {
	static void check(String arr[]){
		String k = "";
		for(int i=0;i<arr.length;i++) {
			char f = arr[i].charAt(0);
			char l = arr[i].charAt(arr[i].length()-1);
			if((f=='a'||f=='e'||f=='i'||f=='o'||f=='u')
				&&(l=='a'||l=='e'||l=='i'||l=='o'||l=='u')) {
				k = k + arr[i];
			}
		}
		if(k.length()<1) {
			System.out.println("no matches found");
		}
		else {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		String s[]= {"oreo","sirish","apple"};
		check(s);
	}
}
