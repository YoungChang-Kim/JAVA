//클래스형(클래스이름) 형변환 : 상속관계에서만 할 수 있음
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

class Test02{
	public static void main(String[] args){
		WindInstrument windInstrument = new WindInstrument();
		Instrument instrument = windInstrument;

		Instrument instrument2 = new PercussionInstrument();
		PercussionInstrument percussionInstrument = (PercussionInstrument) instrument2;

		Instrument instrument3 = new WindInstrument();
		//WindInstrument windInstrument = (Percussion Instrument)instrument3;

		//안전하게 강제 형변환
		Instrument instrument4 = new WindInstrument();
		if(instrument4 instanceof WindInstrument){
			WindInstrument windInstrument =(WindInstrument)instrument4;
		}

	}
}
