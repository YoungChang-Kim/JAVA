abstract class Instrument{
	
	String name;

	abstract void play();
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

class Piano extends PercussionInstrument{
	void play(){
		System.out.println("�հ��� 10���� �̿��ؼ� ������ �����ؿ�");
	}
}

class Test{

	void play(PercussionInstrument instrument){
		instrument.play();
	}

	PercussionInstrument getInstrument(){
		return new Piano();
	}

	public static void main(String[] args){
		Ensemble ensemble = new Ensemble();

		Test test = new Test();
		test.play(new Instrument());
		test.play(new WindInstrument());
		test.play(new PercussionInstrument());
		test.play(new Piano());

		ensemble.playInstrument(new Instrument());
		ensemble.playInstrument(new WindInstrument());
		ensemble.playInstrument(new PercussionInstrument());
	}
}
