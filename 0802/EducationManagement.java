class EducationManagement{

	String getMessage(char grade){
		String message = "";
		switch(grade){
			case 'A' :
				message = "�ſ� ����մϴ�.";
				break;
			case 'B' :
				message = "����մϴ�.";
				break;
			case 'C' : case 'D' :
				message = "��ȣ�մϴ�.";
				break;
			case 'F' :
				message = "����� �ʿ��մϴ�.";
				break;
			default :
				message = "����� Ȯ�ιٶ��ϴ�.";
				break;
		}
		return message;
	}

	String getMessage(String grade){
		String message = "";
		switch(grade){
			case "A" :
				message = "�ſ� ����մϴ�.";
				break;
			case "B" :
				message = "����մϴ�.";
				break;
			case "C" : case "D" :
				message = "��ȣ�մϴ�.";
				break;
			case "F" :
				message = "����� �ʿ��մϴ�.";
				break;
			default :
				message = "����� Ȯ�ιٶ��ϴ�.";
				break;
		}
		return message;
	}
}