package lab.itank.collection;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
//		return ((Integer)o1.getPrice()).compareTo(o2.getPrice());
		return ((Integer)o2.getPrice()).compareTo(o1.getPrice());
	}
}
