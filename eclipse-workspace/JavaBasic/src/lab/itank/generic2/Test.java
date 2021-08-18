package lab.itank.generic2;

public class Test {

	public static void main(String[] args) {
		Util util = new Util();
		
		//와일드 카드
		util.putAll(new Pocket<String>());
		util.putAll(new Pocket<Ring>());
		util.putAll(new Pocket<Jewel>());
		util.putAll(new Pocket<ThumbRing>());
		
		
		util.putJewel(new Pocket<Jewel>());
		util.putJewel(new Pocket<EarRing>());
		util.putJewel(new Pocket<Ring>());
		util.putJewel(new Pocket<GeminalRing>());
		util.putJewel(new Pocket<ThumbRing>());
		//util.putJewel(new Pocket<String>()); // err
		
		
		util.putRing(new Pocket<Ring>());
		util.putRing(new Pocket<GeminalRing>());
		util.putRing(new Pocket<ThumbRing>());
		
		
		util.putEarRing(new Pocket<Object>());
		util.putEarRing(new Pocket<Jewel>());
		util.putEarRing(new Pocket<EarRing>());
		//util.putEarRing(new Pocket<Ring>()); // err
				
	}

}
