abstract class G{
	abstract void abstractMethod();
	void genaralMethod(){}
}

interface H{
	public static final double PI = 3.14;
	abstract public void methodA();
}

class I extends G implements H{
	void abstractMethod(){}
	public void methodA(){}
	void methodB(){}
}

class J{
	public static void main(String[] args){
		G g = new I();
		g.genaralMethod();
		g.abstractMethod();

		H h = new I();
		h.methodA();

		I i = new I();
		i.abstractMethod();
		i.genaralMethod();
		i.methodA();
		i.methodB();

		System.out.println(H.PI);
	}
}


