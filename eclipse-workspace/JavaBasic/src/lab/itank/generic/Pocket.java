package lab.itank.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class Pocket<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Pocket<String> pocket = new Pocket<>();
		pocket.setT("abc");
		System.out.println(pocket.getT());
		
		Pocket<Integer> pocket1 = new Pocket<>();
		pocket1.setT(32);
		
		ArrayList<String> arrayList01 = new ArrayList<>();
		arrayList01.add("abc");
		
		ArrayList<Integer> arrayList02 = new ArrayList<>();
		arrayList02.add(3);
		
		ArrayList<Dog> arrayList03 = new ArrayList<>();
		arrayList03.add(new Dog());
		
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("a1", 35254);
		
		HashMap<String, Dog> map2 = new HashMap<>();
		map2.put("", new Dog());
	}
}
