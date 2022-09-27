package ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsTesting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str1 = br.readLine();
		//convert string to integer
		int x = Integer.parseInt(str);
		int y = Integer.parseInt(str1);
		System.out.println(x+y);
	}
}
