//�⺻�� ����ȯ
class Test01{
	public static void main(String[] args) {
		//�ڵ� �� ��ȯ
		int a = 100;
		double b = a;

		System.out.println(b);

		//���� ����ȯ
		short a1 = 100;
		byte b1 = (byte)a1;
		System.out.println(b1);

		//��������ȯ�� ������
		short a2 = 200;
		byte b2 = (byte)a2;
		System.out.println(b2);//-56

		//�����ϰ� ���� ����ȯ�ϱ�		
		short shortValue = 100;
		//Byte.MIN_VALUE : -128
		if((shortValue >= Byte.MIN_VALUE)&&(shortValue <= Byte.MAX_VALUE)){
			byte byteValue = (byte)shortValue;
		}

		int intValue = 200;
		if((intValue >= Short.MIN_VALUE)&&(intValue <= Short.MAX_VALUE)){
			short intValue = (short)intValue;
		}

		char ch = 65;
		byte by = (byte)ch;
		System.out.println(by);
	}
}
