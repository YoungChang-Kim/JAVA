class BasicStatement{

	//1.if���� �̿��Ͽ� ������ ����� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�
	//	(�Ķ���ͷ� ���ڸ� ������ "A"�� ����)
	//100~90 -> "A"
	//89~80 -> "B"
	//79~70 -> "C"
	//�׿� -> "����� �����ϴ�."
	String getGrade(int point){
		String grade = "";
		if(100 >= point && point >= 90){
			grade = "A";
		}else if(90 > point && point >= 80){
			grade = "B";
		}else if(80 > point && point >= 70){
			grade = "C";
		}else{
			grade = "����� �����ϴ�.";
		}
		return grade;
	}

	
	
	
	
	
	//2.switch���� �̿��Ͽ� ��(3,4,5), ����(6,7,8), ����(9,10,11), �ܿ�(12,1,2)�� 
	// �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
	// (�ĸ����� ���� ���� 3�� ��� ������ "��" ����)
	String getSeason(int month){
		String season = "";
		switch(month){
			case 1: case 2: case 12:
				season = "�ܿ�";
				break;
			case 3: case 4: case 5:
				season = "��";
				break;
			case 6: case 7: case 8:
				season = "����";
				break;
			case 9: case 10: case 11:
				season = "����";
				break;
			default :
				season = "����";
				break;
		}
		return season;
	}

	//3.for���� �̿��Ͽ� �������� ����ϴ� �޼ҵ带 �ۼ��غ���. 
	//  (�Ķ���� ���� ���� 3�� ��� 3�ܸ� ��� �޼ҵ���)
	void googoodan(int dan){
		System.out.println(dan+"��");
		for (int i = 1; i <= 9; i++){
			System.out.println(dan+" * "+i+" = "+(dan * i));
		}
	}
}
