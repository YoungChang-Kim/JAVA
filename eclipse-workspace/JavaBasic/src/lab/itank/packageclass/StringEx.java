package lab.itank.packageclass;

public class StringEx {

	public static void main(String[] args) {
		//String ��ü ������
		String str01 = new String("dog");
		
		char[] c = {'d', 'o' , 'g'};
		String str02 = new String(c);
		
		String str03 = "dog";
		String str04 = "dog";
		String str05 = "dog";
		
		String str06 = new String("dog");
		
		System.out.println(str01 == str02);//false
		System.out.println(str03 == str04);//true
		System.out.println(str04 == str05);//false
		System.out.println(str04 == str06);//true
		
		System.out.println("���ڿ� ���� = "+str01.length());
		System.out.println("Ư�� �ڸ� ���� = " + str01.charAt(2));
		
		//��������
		String str07 = "teacher";
		System.out.println("�Ϻι������� = " + str07.substring(3));//cher
		System.out.println("�Ϻι������� = " + str07.substring(2, 5));//ach
		
		//���� ��
		String str08 = "friend";
		String str09 = "FRIEND";
		
		System.out.println(str08 == str09); // false
		System.out.println(str08.equals(str09)); // false
		System.out.println(str08.equalsIgnoreCase(str09));//true
		
		String str10 = "Good ";
		String str11 = "Mother";
		System.out.println(str10.concat(str11).charAt(5));
		
		String str12 = "       space      ";
		String str13 = "space";
		System.out.println(str12.equals(str13));
		System.out.println(str12.trim()+"���� ��������");
		System.out.println(str12.trim().equals(str13));
	}

}
