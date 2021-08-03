class EducationManagementTest 
{
	public static void main(String[] args) 
	{
		EducationManagement em = new EducationManagement();
		String message = em.getMessage("A");
		System.out.println(message);

		System.out.println(em.getMessage("B"));
	}
}