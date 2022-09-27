package Collections;

import java.util.*;

public class VectorRemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(24);
		vec.add(10);
		vec.add(12);
		vec.add(19);
		vec.add(24);
		vec.add(17);
		vec.add(12);
		vec.add(10);
		vec.add(10);
		vec.add(19);
		vec.add(26);
		vec.add(26);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(vec);
		vec.clear();
		vec.addAll(set);
		System.out.println(vec);
		
	}
}
