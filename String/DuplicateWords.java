package String;

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "hello how are you hello are you listening ";
		String s[]=str.split(" ");
		String f[]=str.split(" ");
		String st= "";
		String sk="";
		int j,i;
		for(i=0;i<s.length;i++) {
			for(j=i+1;j<s.length;j++) {
				if(f[j].equals(s[i])) {
					st = st+s[j]+" ";
					f[j]=" ";
					break;
					
				}
			}
			if(f[i]!=" ") {
				sk = sk + s[i]+" ";
			}
		}
		System.out.println("Duplicates: "+st.trim());
		System.out.println("After Removing Duplicates: "+sk.trim());
	}
}
