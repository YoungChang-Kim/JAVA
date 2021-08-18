package lab.itank.collection;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
//		return o1.getName().compareTo(o2.getName());
		return o2.getName().compareTo(o1.getName());
	}

	
}
