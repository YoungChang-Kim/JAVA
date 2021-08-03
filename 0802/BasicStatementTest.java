class BasicStatementTest
{
	public static void main(String args[]){
		BasicStatement bs = new BasicStatement();
		String grade = bs.getGrade(90);
		String season = bs.getSeason(12);
		System.out.println(grade);
		System.out.println(season);
		bs.googoodan(3);
	}
}