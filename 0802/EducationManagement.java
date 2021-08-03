class EducationManagement{

	String getMessage(char grade){
		String message = "";
		switch(grade){
			case 'A' :
				message = "매우 우수합니다.";
				break;
			case 'B' :
				message = "우수합니다.";
				break;
			case 'C' : case 'D' :
				message = "양호합니다.";
				break;
			case 'F' :
				message = "노력이 필요합니다.";
				break;
			default :
				message = "등급을 확인바랍니다.";
				break;
		}
		return message;
	}

	String getMessage(String grade){
		String message = "";
		switch(grade){
			case "A" :
				message = "매우 우수합니다.";
				break;
			case "B" :
				message = "우수합니다.";
				break;
			case "C" : case "D" :
				message = "양호합니다.";
				break;
			case "F" :
				message = "노력이 필요합니다.";
				break;
			default :
				message = "등급을 확인바랍니다.";
				break;
		}
		return message;
	}
}