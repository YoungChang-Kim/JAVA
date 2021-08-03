class EducationManagementTest
{
	static String passOrNonPass;
	public static void main(String[] args)
	{
		EducationManagement em = new EducationManagement();
		passOrNonPass = em.isPass(75);
		System.out.println("Pass or Non-Pass? : " + passOrNonPass);
	}
}
