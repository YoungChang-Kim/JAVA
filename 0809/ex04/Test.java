class Instrument{
	
	String name;

	void play(){
		System.out.println("�Ǳ⸦ �����ؿ�");
	}

}

class WindInstrument extends Instrument{

	void play(){
		System.out.println("������ �Ҿ ���ָ� �ؿ�");
	}

}

class PercussionInstrument extends Instrument{

		void play(){
			System.out.println("�ε���� ���ָ� �ؿ�");
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
