package lab.itank.collection;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		//�ߺ�X, ������ �߿����� �ʾ�.
		HashSet<String> set = new HashSet<>();
		set.add("����10��������");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("����10��������");
		set.add("F");
		set.add("G");
		
		System.out.println(set.size());
		
		for (String string : set) {
			System.out.println(string);
		}
	}

}
