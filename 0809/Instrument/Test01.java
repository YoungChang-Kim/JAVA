class Instrument{

	String name;
	
	void play(){} // 1

}

class WindInstrument extends Instrument{	

	void play(){} // 2

}

class PercussionInstrument extends Instrument{

	void play(){} // 3

}

class Xylophone extends PercussionInstrument{

}

class Test01{
	public static void main(String[] args){
		Instrument instrument1 = new Instrument(); // 1
		Instrument instrument2 = new WindInstrument(); // 2
		Instrument instrument3 = new PercussionInstrument(); // 3
		Instrument instrument4 = new Xylophone(); // 3
	}
}