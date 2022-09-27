package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyTest {
	public static void main(String[] args) throws IOException {
		 try {
			 int a =10;
			 int b=0;
			 int c = a/b;
			 System.out.println("c = "+c);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 finally {
			 System.out.println("Control");
		 }
	}
}
