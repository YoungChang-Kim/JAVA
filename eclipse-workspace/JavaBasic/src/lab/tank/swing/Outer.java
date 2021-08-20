package lab.tank.swing;

//�Ϲ� ���� Ŭ����
//���� ���� Ŭ����
//���� ���� Ŭ����
//���� ���� Ŭ����

public class Outer {

	int outData = 100;
	static int staticOutData = 500;
	final int finalOutData = 700;
	
	public void printOuter() {
		System.out.println("Outer Ŭ������ printerOuter() ȣ��");
	}
	
	public static void staticPrintOuter() {
		System.out.println("Outer Ŭ������ staticPrintOuter() ȣ��");
	}
	
	//�Ϲ� ���� Ŭ����
	class Inner{
		
		int inData = 200;
		
		public void printInner() {
			System.out.println(outData);
			System.out.println(inData);
			System.out.println(staticOutData);
			System.out.println(finalOutData);
			printOuter();
			staticPrintOuter();
		}
	}
	
	//���� ���� Ŭ����
	static class StaticInner{
		int inData = 200;
		
		public void printInner() {
//			System.out.println(outData);
			System.out.println(inData);
			System.out.println(staticOutData);
//			System.out.println(finalOutData);
//			printOuter();
			staticPrintOuter();
		}
	}
	
	//���� ���� Ŭ���� : �޼ҵ� �ȿ� ����� Ŭ����
	Object getLocal() {
		
		int localData = 10;
		final int finalLocalData = 5;
		
		class Local extends Object {
			
			public String toString(){
				String temp = "";
				temp += "\n Outer Ŭ������ �ν��Ͻ� ������ = " + outData;
				temp += "\n Outer Ŭ������ static ������ = " + staticOutData;
				temp += "\n Outer Ŭ������ final ������ = " + finalOutData;
				temp += "\n getLocal() non-final ������ = " + localData;
				temp += "\n getLocal() final ������ = " + finalLocalData;
				
				return null;
			}			
		}
		return new Local();
	}
	
	Object getAnonymous() {
		int localData = 10;
		final int finalLocalData = 5;
		
		return (new Object() {
			public String toString(){
				String temp = "";
				temp += "\n Outer Ŭ������ �ν��Ͻ� ������ = " + outData;
				temp += "\n Outer Ŭ������ static ������ = " + staticOutData;
				temp += "\n Outer Ŭ������ final ������ = " + finalOutData;
				temp += "\n getLocal() non-final ������ = " + localData;
				temp += "\n getLocal() final ������ = " + finalLocalData;
				
				return null;
			}
		});
	}
}
