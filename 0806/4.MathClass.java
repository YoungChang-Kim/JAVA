/* 틀린 곳에 주석을 달아주세요.
class MathClass{

	String 3Word;
	int count;
	
	public void MathClass(){
		count++;
	}

	public MathClass(String word){
		count++;
	}

    //두 정수의 합을 리턴하는 메소드
	public void sum(int x, int y){
		int result;
		result=x+y;
		return result;		
	}

	//배열의 합을 리턴하는 메소드
	public int sum(int[] array){
		for(int i=0; i<5; i++){
			result += array[i];
		}
		return result;
	}

	//두 String을 연결해서 리턴하는 메소드
	public int sum(String s1, String s2){
		return s1+s2;
	}

	//만들어진 객체 갯수를 리턴하는 메소드
	public static int getCount(){
		return count;
	}
} 
*/
//틀린 부분을 바르게 고쳐주세요.
class MathClass{

	String 3Word;
	int count;
	
	public void MathClass(){
		count++;
	}

	public MathClass(String word){
		count++;
	}

    //두 정수의 합을 리턴하는 메소드
	public void sum(int x, int y){
		int result;
		result=x+y;
		return result;		
	}

	//배열의 합을 리턴하는 메소드
	public int sum(int[] array){
		for(int i=0; i<5; i++){
			result += array[i];
		}
		return result;
	}

	//두 String을 연결해서 리턴하는 메소드
	public int sum(String s1, String s2){
		return s1+s2;
	}

	//만들어진 객체 갯수를 리턴하는 메소드
	public static int getCount(){
		return count;
	}
}

class MathClassTest{
	//main()에는 틀린 코드가 없습니다.
	public static void main(String[] args){
		
		MathClass mc = new MathClass();
		System.out.println(mc.sum(3,5));//
		
		int[] array01={1,2,3,4,5};
		System.out.println(mc.sum(array01));//
		
		int[] array02={1,2,3,4,5,6,7,8,9,10};
		System.out.println(mc.sum(array02));//
		
		System.out.println(mc.sum("자바","잼나"));//

		MathClass mc2s = new MathClass("MathClass");		
		System.out.println(MathClass.getCount());//
	}
}
