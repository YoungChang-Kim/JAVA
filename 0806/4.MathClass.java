/* Ʋ�� ���� �ּ��� �޾��ּ���.
class MathClass{

	String 3Word;
	int count;
	
	public void MathClass(){
		count++;
	}

	public MathClass(String word){
		count++;
	}

    //�� ������ ���� �����ϴ� �޼ҵ�
	public void sum(int x, int y){
		int result;
		result=x+y;
		return result;		
	}

	//�迭�� ���� �����ϴ� �޼ҵ�
	public int sum(int[] array){
		for(int i=0; i<5; i++){
			result += array[i];
		}
		return result;
	}

	//�� String�� �����ؼ� �����ϴ� �޼ҵ�
	public int sum(String s1, String s2){
		return s1+s2;
	}

	//������� ��ü ������ �����ϴ� �޼ҵ�
	public static int getCount(){
		return count;
	}
} 
*/
//Ʋ�� �κ��� �ٸ��� �����ּ���.
class MathClass{

	String 3Word;
	int count;
	
	public void MathClass(){
		count++;
	}

	public MathClass(String word){
		count++;
	}

    //�� ������ ���� �����ϴ� �޼ҵ�
	public void sum(int x, int y){
		int result;
		result=x+y;
		return result;		
	}

	//�迭�� ���� �����ϴ� �޼ҵ�
	public int sum(int[] array){
		for(int i=0; i<5; i++){
			result += array[i];
		}
		return result;
	}

	//�� String�� �����ؼ� �����ϴ� �޼ҵ�
	public int sum(String s1, String s2){
		return s1+s2;
	}

	//������� ��ü ������ �����ϴ� �޼ҵ�
	public static int getCount(){
		return count;
	}
}

class MathClassTest{
	//main()���� Ʋ�� �ڵ尡 �����ϴ�.
	public static void main(String[] args){
		
		MathClass mc = new MathClass();
		System.out.println(mc.sum(3,5));//
		
		int[] array01={1,2,3,4,5};
		System.out.println(mc.sum(array01));//
		
		int[] array02={1,2,3,4,5,6,7,8,9,10};
		System.out.println(mc.sum(array02));//
		
		System.out.println(mc.sum("�ڹ�","�볪"));//

		MathClass mc2s = new MathClass("MathClass");		
		System.out.println(MathClass.getCount());//
	}
}
