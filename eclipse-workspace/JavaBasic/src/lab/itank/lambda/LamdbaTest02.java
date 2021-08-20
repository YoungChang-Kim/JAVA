package lab.itank.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class LamdbaTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = (t) -> {System.out.println(t);};		
		consumer.accept("hi");
		
		IntConsumer intConsumer = (t) -> {System.out.println(t);};		
		intConsumer.accept(3);
		
//		R apply(T t)
//		public interface Function<T, R>
		
		Function<Integer, String> function = (t) -> {
			return "가";
		};
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(5);
		number.add(9);
		number.add(8);
		number.add(1);
		number.add(3);
		
		for (Integer integer : number) {
			System.out.println(integer);
		}
		
//		Consumer<Integer> integerConsumer = (t) -> {System.out.println(t);};		
//		number.forEach(integerConsumer);
		
		number.forEach((t)->{System.out.print(" "+t);});
		
		ArrayList<Dog> dogs = new ArrayList<>();
		
		dogs.add(new Dog("A"));
		dogs.add(new Dog("B"));
		dogs.add(new Dog("C"));
		dogs.add(new Dog("D"));
				
//		인터페이스가 API또는 작성자가 만든 경우 사용
//		public void forEach(Consumer<? super E> action)
		dogs.forEach(
			(t)->{
				System.out.println(t.getName());
			}
		);
		
//		Function<Integer, String> :: String apply(Integer t)
		Function<Integer, String> fun = (i) ->{return dogs.get(i).getName();};
//		System.out.println(fun.apply(1).getName());
		
	}

}
