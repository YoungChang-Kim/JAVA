package lab.itank.packageclass;

//Object
public class ObjectEx extends Object{
	//�޼ҵ� 11 : Object
	
	public static void main(String[] args) {
		
		ObjectEx parent0 = new ObjectEx();		
//		System.out.println("hashCode() = "+parent0.hashCode());
//		System.out.println("getClass() = "+parent0.getClass());
//		System.out.println("toString() = "+parent0.toString());
//		System.out.println("toString() ���� = "+parent0);
		
		ObjectEx parent1 = new ObjectEx();
		// ==, equals
//		System.out.println(parent0.equals(parent0));//true
//		System.out.println(parent0==parent0);//true
//		
//		System.out.println(parent0.equals(parent1));//false
//		System.out.println(parent0==parent1);//false
//		
		String s01 = new String("�ڹ�");
		String s02 = new String("��");
		
		System.out.println(s01.equals(s01));//true
		System.out.println(s01==s01);//true
		
		System.out.println(s01.equals(s02));//false 
		System.out.println(s01==s02);//false
		//String���� Object Ŭ������ equals �޼ҵ带 ���ڸ� ���ϴ� ������ �������̵� �Ͽ���.
	}
}
