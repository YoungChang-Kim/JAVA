class Instrument{
	
	String name;

	void play(){
		System.out.println("악기를 연주해요");
	}

}

class WindInstrument extends Instrument{

	void play(){
		System.out.println("입으로 불어서 연주를 해요");
	}

}

class PercussionInstrument extends Instrument{

		void play(){
			System.out.println("두드려서 연주를 해요");
		}

}

class Ensemble{
	
	Instrument instrument;
	WindInstrument windInstrument;
	PercussionInstrument percussionInstrument;

	Ensemble(){}

/*
	Ensemble(Instrument instrument, WindInstrument windInstrument, PercussionInstrument percussionInstrument){
		this.instrument = instrument;
		this.windInstrument = windInstrument;
		this.percussionInstrument = percussionInstrument;
	}
*/

	void playInstrument(){
		System.out.println("Instrument instrument, WindInstrument windInstrument, PercussionInstrument percussionInstrument");
		instrument.play();
		windInstrument.play();
		percussionInstrument.play();
	}

	void playInstrument(Instrument instrument){ // Instrument instrument = new WindInstrument();
		instrument.play();
	}

}

class Test{
	public static void main(String[] args){
		Ensemble ensemble = new Ensemble();

		ensemble.playInstrument(new Instrument());
		ensemble.playInstrument(new WindInstrument());
		ensemble.playInstrument(new PercussionInstrument());
	}
}
