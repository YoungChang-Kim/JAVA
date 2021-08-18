package lab.itank.collection;

import java.util.Hashtable;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// 데이터형태(key, value)
		// 키 값으로 검색하므로 검색속도 빠름
		
		Hashtable<Integer, Book> hashtable = new Hashtable<>();
		hashtable.put(1, new Book("A", 1000));
		hashtable.put(2, new Book("B", 1000));
		hashtable.put(3, new Book("C", 1000));
		
//		Set<String> key = hashtable.keySet();
		
//		for (String string : key) {
//			System.out.println(hashtable.get(string));
//		}
		
		System.out.println(hashtable.get(1).getName() +" : "+ hashtable.get(1).getPrice());

	}

}
