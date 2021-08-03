class EducationManagement
{
	int baseScore = 70;

/*
	String isPass(int score){
		String result = "";
		
		if(score >= baseScore){
			result = "Pass";
		}else{
			result = "Non-Pass";
		}

		return result;
	}
*/
	
	// ? Âü:°ÅÁþ
	String isPass(int score){
		String result;
		return result = (score >= baseScore)? "Pass":"Non-Pass";
	}
}
