//Ŭ������(Ŭ�����̸�) ����ȯ : ��Ӱ��迡���� �� �� ����
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

class Test02{
	public static void main(String[] args){
		WindInstrument windInstrument = new WindInstrument();
		Instrument instrument = windInstrument;

		Instrument instrument2 = new PercussionInstrument();
		PercussionInstrument percussionInstrument = (PercussionInstrument) instrument2;

		Instrument instrument3 = new WindInstrument();
		//WindInstrument windInstrument = (Percussion Instrument)instrument3;

		//�����ϰ� ���� ����ȯ
		Instrument instrument4 = new WindInstrument();
		if(instrument4 instanceof WindInstrument){
			WindInstrument windInstrument =(WindInstrument)instrument4;
		}

	}
}
