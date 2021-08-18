package lab.itank.packageclass;

public class StringEx {

	public static void main(String[] args) {
		//String 객체 생성법
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
		
		System.out.println("문자열 길이 = "+str01.length());
		System.out.println("특정 자리 문자 = " + str01.charAt(2));
		
		//문자추출
		String str07 = "teacher";
		System.out.println("일부문자추출 = " + str07.substring(3));//cher
		System.out.println("일부문자추출 = " + str07.substring(2, 5));//ach
		
		//내용 비교
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
		System.out.println(str12.trim()+"공백 사라졌어요");
		System.out.println(str12.trim().equals(str13));
	}

}
