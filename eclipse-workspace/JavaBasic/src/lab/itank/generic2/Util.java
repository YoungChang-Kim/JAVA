package lab.itank.generic2;

public class Util {
	public void putAll(Pocket<?> pocket) {}
	
	public void putJewel(Pocket<? extends Jewel> pocket) {}
	
	public void putRing(Pocket<? extends Ring> pocket) {}
	
	public void putEarRing(Pocket<? super EarRing> pocket) {}
	
	//public <T extends Ring> void putRing(Pocket<T> pocket) {} // OK!!

	//public <T super EarRing> void putRing(Pocket<T> pocket) {} // Err!!
	
	//public <T> void putRing(Pocket<T extends Ring> pocket) {} // Err!
}
