abstract class Instrument{
	abstract void play();
	abstract void keep();
}

abstract class WindInstrument extends Instrument{
	void play(){}
	abstract void keep();
}

class PercussionInstrument extends Instrument{
	void play(){}
	void keep(){}
}

class Abs01{
	public static void main(String[] args){
		
		Instrument instrument = new Instrument();
		instrument.play();
		instrument.keep();

		WindInstrument windInstrument = new Instrument();
		windInstrument.play();
		windInstrument.keey();

	}
}