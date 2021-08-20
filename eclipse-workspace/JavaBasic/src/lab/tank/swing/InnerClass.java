package lab.tank.swing;

public class InnerClass {
	
	public static void main(String[] args) {
		//일반 내부 클래스
		Outer out = new Outer();		
		Outer.Inner in = out.new Inner();
		
		System.out.println(in);
		in.printInner();
		
		//정적 내부 클래스
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.printInner();
		
		//지역 내부 클래스
		Object refLocal = out.getLocal();
		System.out.println(refLocal.toString());
		
		Object refAnonymous = out.getAnonymous();
		System.out.println(refAnonymous.toString());
	}
}
