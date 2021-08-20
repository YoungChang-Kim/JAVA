package lab.tank.swing;

public class InnerClass {
	
	public static void main(String[] args) {
		//�Ϲ� ���� Ŭ����
		Outer out = new Outer();		
		Outer.Inner in = out.new Inner();
		
		System.out.println(in);
		in.printInner();
		
		//���� ���� Ŭ����
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.printInner();
		
		//���� ���� Ŭ����
		Object refLocal = out.getLocal();
		System.out.println(refLocal.toString());
		
		Object refAnonymous = out.getAnonymous();
		System.out.println(refAnonymous.toString());
	}
}
