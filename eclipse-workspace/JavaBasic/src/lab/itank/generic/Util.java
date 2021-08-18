package lab.itank.generic;

public class Util {
	
	public Util(String s) {}
	
	public <T> Pocket<T> make(T t){
		Pocket<T> pocket = new Pocket<>();
		pocket.setT(t);
		
		return pocket;
	}
	
	public <T> T give(Pocket<T> pocket) {
		return pocket.getT();
	}
	
	public static void main(String[] args) {
		Util util = new Util("abc");
		Pocket<Integer> p1 = util.make(1234);
		System.out.println(util.give(p1));
	}
}
