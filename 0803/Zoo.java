class Zoo
{
	String name;
	Bird bird;
	Monkey monkey;
	Insect insect;
	

	Zoo(String name){
		this.name = name;
	}

	Zoo(Bird bird, Monkey monkey, Insect insect){
		this.bird = bird;
		this.monkey = monkey;
		this.insect = insect;
	}
	Zoo(Monkey monkey){
		System.out.println("Zoo(Monkey monkey)");
	}

	Zoo(Insect insect){
		this.insect = insect;
		System.out.println("Zoo(Insect insect)");
	}

	void rename(Bird bird){
		bird.name = "�˷ϴ޷� ���ű�";
		System.out.println("void rename(Bird bird) bird.name : " + bird.name);
	}
}