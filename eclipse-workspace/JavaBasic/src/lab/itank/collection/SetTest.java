package lab.itank.collection;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		//중복X, 순서는 중요하지 않아.
		HashSet<String> set = new HashSet<>();
		set.add("강남10번지토지");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("강남10번지토지");
		set.add("F");
		set.add("G");
		
		System.out.println(set.size());
		
		for (String string : set) {
			System.out.println(string);
		}
	}

}
