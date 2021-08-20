package lab.tank.swing;

//일반 내부 클래스
//정적 내부 클래스
//지역 내부 클래스
//무명 내부 클래스

public class Outer {

	int outData = 100;
	static int staticOutData = 500;
	final int finalOutData = 700;
	
	public void printOuter() {
		System.out.println("Outer 클래스의 printerOuter() 호출");
	}
	
	public static void staticPrintOuter() {
		System.out.println("Outer 클래스의 staticPrintOuter() 호출");
	}
	
	//일반 내부 클래스
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
	
	//정적 내부 클래스
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
	
	//지역 내부 클래스 : 메소드 안에 선언된 클래스
	Object getLocal() {
		
		int localData = 10;
		final int finalLocalData = 5;
		
		class Local extends Object {
			
			public String toString(){
				String temp = "";
				temp += "\n Outer 클래스의 인스턴스 데이터 = " + outData;
				temp += "\n Outer 클래스의 static 데이터 = " + staticOutData;
				temp += "\n Outer 클래스의 final 데이터 = " + finalOutData;
				temp += "\n getLocal() non-final 데이터 = " + localData;
				temp += "\n getLocal() final 데이터 = " + finalLocalData;
				
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
				temp += "\n Outer 클래스의 인스턴스 데이터 = " + outData;
				temp += "\n Outer 클래스의 static 데이터 = " + staticOutData;
				temp += "\n Outer 클래스의 final 데이터 = " + finalOutData;
				temp += "\n getLocal() non-final 데이터 = " + localData;
				temp += "\n getLocal() final 데이터 = " + finalLocalData;
				
				return null;
			}
		});
	}
}
