class BasicStatement{

	//1.if문을 이용하여 점수별 등급을 리턴하는 메소드를 작성하시오
	//	(파라미터로 숫자를 받으면 "A"를 리턴)
	//100~90 -> "A"
	//89~80 -> "B"
	//79~70 -> "C"
	//그외 -> "등급이 없습니다."
	String getGrade(int point){
		String grade = "";
		if(100 >= point && point >= 90){
			grade = "A";
		}else if(90 > point && point >= 80){
			grade = "B";
		}else if(80 > point && point >= 70){
			grade = "C";
		}else{
			grade = "등급이 없습니다.";
		}
		return grade;
	}

	
	
	
	
	
	//2.switch문을 이용하여 봄(3,4,5), 여름(6,7,8), 가을(9,10,11), 겨울(12,1,2)을 
	// 리턴하는 메소드를 작성하시오.
	// (파마리터 값이 숫자 3인 경우 받으면 "봄" 리턴)
	String getSeason(int month){
		String season = "";
		switch(month){
			case 1: case 2: case 12:
				season = "겨울";
				break;
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			default :
				season = "없음";
				break;
		}
		return season;
	}

	//3.for문을 이용하여 구구단을 출력하는 메소드를 작성해보자. 
	//  (파라미터 값이 숫자 3인 경우 3단만 찍는 메소드임)
	void googoodan(int dan){
		System.out.println(dan+"단");
		for (int i = 1; i <= 9; i++){
			System.out.println(dan+" * "+i+" = "+(dan * i));
		}
	}
}
